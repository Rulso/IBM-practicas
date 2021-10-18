package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ej2Controller {
	
	//@Autowired
	
	@PostMapping("/api/v1/sucursales")
	public ResponseEntity<List<Bancos>> retrieveSucursalesRequest(@RequestBody RetrieveSucursalesRequest request){

		
		log.info("Request received: {}",request);
		
		List<Bancos> retrieveBancos= service.retrieveBancoEstado(request.getEstado());
		
		return new ResponseEntity<>(retrieveBancos,HttpStatus.OK);
	}

}
