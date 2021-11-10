package com.main.helpdesk.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.helpdesk.domain.Tecnico;
import com.main.helpdesk.services.TecnicoService;

/**
 * Create class by: @author Jhonatan
 *
 *  9 de nov. de 2021 22:33:46 
 */
@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {
	
	@Autowired
	private TecnicoService tecnicoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Tecnico> findById(@PathVariable Integer id) {
		Tecnico findById = tecnicoService.findById(id);

		return ResponseEntity.ok().body(findById);
	}
	
}