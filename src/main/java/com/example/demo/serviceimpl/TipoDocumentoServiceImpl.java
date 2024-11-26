package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TipoDocumentoDao;
import com.example.demo.entity.TipoDocumento;
import com.example.demo.service.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

	@Autowired
	private TipoDocumentoDao tipodocumentodao;
	
	@Override
	public TipoDocumento create(TipoDocumento a) {
		// TODO Auto-generated method stub
		return tipodocumentodao.create(a);
	}

	@Override
	public TipoDocumento update(TipoDocumento a) {
		// TODO Auto-generated method stub
		return tipodocumentodao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipodocumentodao.delete(id);
	}

	@Override
	public Optional<TipoDocumento> read(Long id) {
		// TODO Auto-generated method stub
		return tipodocumentodao.read(id);
	}

	@Override
	public List<TipoDocumento> readAll() {
		// TODO Auto-generated method stub
		return tipodocumentodao.readAll();
	}
	

}
