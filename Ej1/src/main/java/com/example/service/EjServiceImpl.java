package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.feign.Ej1Feign;
import com.example.model.Tarjeta;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EjServiceImpl implements Ej1Service {
	@Autowired
	Ej1Feign ej1Feign;

	@Override
	public List<Tarjeta> getTarjeta() {
		Log.info("Buscando en /api/v1/example/get-tarjeta");
		return ej1Feign.getResponseGet();
	}
	
}
