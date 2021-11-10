package com.main.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.helpdesk.domain.Tecnico;
import com.main.helpdesk.repositories.TecnicoRepository;

/**
 * Create class by: @author Jhonatan
 *
 *  9 de nov. de 2021 22:39:25 
 */
@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> tecnicoById = tecnicoRepository.findById(id);
		
		return tecnicoById.orElse(null);
	}
}