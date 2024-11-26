package com.example.demo.service;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Service
public class ExcelImportService {
	 public void importDataFromExcel(String filePath) {
	        String jdbcUrl = "jdbc:oracle:thin:@//<host>:<port>/<service_name>";
	        String username = "tu_usuario";
	        String password = "tu_contraseña";

	        try (FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = new XSSFWorkbook(fis);
	             Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {

	            for (Sheet sheet : workbook) {
	                String tableName = sheet.getSheetName(); // El nombre de la hoja es el nombre de la tabla
	                Row headerRow = sheet.getRow(0); // Primera fila como encabezado

	                if (headerRow == null) continue; // Saltar hojas vacías

	                // Extraer nombres de columnas y excluir IDs generados automáticamente
	                List<String> columnNames = new ArrayList<>();
	                for (Cell cell : headerRow) {
	                    String columnName = cell.getStringCellValue();
	                    if (!columnName.equalsIgnoreCase("id")) { // Ajustar si tus IDs tienen otro nombre
	                        columnNames.add(columnName);
	                    }
	                }

	                // Construir consulta dinámica
	                StringBuilder query = new StringBuilder("INSERT INTO " + tableName + " (");
	                query.append(String.join(", ", columnNames)).append(") VALUES (");
	                query.append("?,".repeat(columnNames.size()));
	                query.deleteCharAt(query.length() - 1).append(")");

	                // Iterar sobre las filas de datos
	                for (Row row : sheet) {
	                    if (row.getRowNum() == 0) continue; // Saltar encabezados

	                    try (PreparedStatement preparedStatement = connection.prepareStatement(query.toString())) {
	                        int colIndex = 0;
	                        for (Cell cell : row) {
	                            String columnName = headerRow.getCell(colIndex).getStringCellValue();
	                            if (columnName.equalsIgnoreCase("id")) {
	                                colIndex++;
	                                continue; // Saltar columnas generadas automáticamente
	                            }

	                            switch (cell.getCellType()) {
	                                case STRING -> preparedStatement.setString(colIndex + 1, cell.getStringCellValue());
	                                case NUMERIC -> preparedStatement.setDouble(colIndex + 1, cell.getNumericCellValue());
	                                case BOOLEAN -> preparedStatement.setBoolean(colIndex + 1, cell.getBooleanCellValue());
	                                case BLANK -> preparedStatement.setNull(colIndex + 1, java.sql.Types.NULL);
	                                default -> throw new IllegalArgumentException("Tipo de celda no soportado: " + cell.getCellType());
	                            }
	                            colIndex++;
	                        }
	                        preparedStatement.executeUpdate();
	                    }
	                }
	                System.out.println("Datos importados para la tabla: " + tableName);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
