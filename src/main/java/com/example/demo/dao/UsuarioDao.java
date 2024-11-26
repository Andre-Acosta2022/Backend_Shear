package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Usuario;

public interface UsuarioDao {
	Usuario create(Usuario a);

	Usuario update(Usuario a);

	void delete(Long id);

	Optional<Usuario> read(Long id);

	List<Usuario> readAll();
}
