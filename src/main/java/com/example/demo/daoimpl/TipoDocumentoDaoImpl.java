package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.TipoDocumentoDao;
import com.example.demo.entity.TipoDocumento;
import com.example.demo.repository.TipoDocumentoRepository;

@Component
public class TipoDocumentoDaoImpl implements TipoDocumentoDao {

	@Autowired
	private TipoDocumentoRepository tipodocumentorepository;

	@Override
	public TipoDocumento create(TipoDocumento a) {
		// TODO Auto-generated method stub
		return tipodocumentorepository.save(a);
	}

	@Override
	public TipoDocumento update(TipoDocumento a) {
		// TODO Auto-generated method stub
		return tipodocumentorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipodocumentorepository.deleteById(id);
	}

	@Override
	public Optional<TipoDocumento> read(Long id) {
		// TODO Auto-generated method stub
		return tipodocumentorepository.findById(id);
	}

	@Override
	public List<TipoDocumento> readAll() {
		// TODO Auto-generated method stub
		return tipodocumentorepository.findAll();
	}

}
