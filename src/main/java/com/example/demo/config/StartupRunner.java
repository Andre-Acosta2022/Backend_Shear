package com.example.demo.config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.ExcelImportService;

@Component
public class StartupRunner implements CommandLineRunner {

    private final ExcelImportService excelImportService;

    public StartupRunner(ExcelImportService excelImportService) {
        this.excelImportService = excelImportService;
    }

    @Override
    public void run(String... args) throws Exception {
        String excelFilePath = "ruta/a/tu/archivo.xlsx"; // Cambia esta ruta al archivo Excel
        excelImportService.importDataFromExcel(excelFilePath);
    }
}