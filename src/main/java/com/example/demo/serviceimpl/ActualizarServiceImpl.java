package com.example.demo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EstadoPPP;
import com.example.demo.entity.Practica;
import com.example.demo.repository.EstadoPPPRepository;
import com.example.demo.repository.PracticaRepository;
import com.example.demo.service.ActualizarService;

@Service
public class ActualizarServiceImpl implements ActualizarService {

	@Autowired
    private PracticaRepository practicaRepository;

    @Autowired
    private EstadoPPPRepository estadoPPPRepository;

    @Override
    public void actualizarEstado(Long idPractica, Long idEstadoPPP) throws Exception {
        // Buscar la práctica por ID
        Optional<Practica> practicaOptional = practicaRepository.findById(idPractica);
        if (!practicaOptional.isPresent()) {
            throw new Exception("Práctica no encontrada");
        }

        // Buscar el estado PPP por ID
        Optional<EstadoPPP> estadoOptional = estadoPPPRepository.findById(idEstadoPPP);
        if (!estadoOptional.isPresent()) {
            throw new Exception("Estado no encontrado");
        }

        // Actualizar el estado de la práctica
        Practica practica = practicaOptional.get();
        EstadoPPP estado = estadoOptional.get();
        practica.setEstadoPPP(estado);

        // Guardar los cambios en la base de datos
        practicaRepository.save(practica);
    }
	
}
