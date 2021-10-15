package com.example.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Tarjeta;

@FeignClient("{feign.client.tarjeta.variente}")
@RequestMapping("{feign.client.tarjeta.uri}")
public interface Ej1Feign {

	@GetMapping("${feign.client.tarjeta.get}")
	public List<Tarjeta>getResponseGet();
	
}
