package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Usuario;

public interface UsuarioService {
	Usuario create(Usuario a);

	Usuario update(Usuario a);

	void delete(Long id);

	Optional<Usuario> read(Long id);

	List<Usuario> readAll();
}
