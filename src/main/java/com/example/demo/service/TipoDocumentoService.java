package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.TipoDocumento;

public interface TipoDocumentoService {
	TipoDocumento create(TipoDocumento a);

	TipoDocumento update(TipoDocumento a);

	void delete(Long id);

	Optional<TipoDocumento> read(Long id);

	List<TipoDocumento> readAll();
}
