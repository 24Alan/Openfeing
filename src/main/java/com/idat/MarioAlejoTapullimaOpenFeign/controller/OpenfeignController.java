package com.idat.MarioAlejoTapullimaOpenFeign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MarioAlejoTapullimaOpenFeign.modelo.Openfeign;
import com.idat.MarioAlejoTapullimaOpenFeign.service.OpenfeignService;

@RequestMapping("/openfeign/v1")
public class OpenfeignController {
	@Autowired
	private OpenfeignService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Openfeign>listarAula(){
		return service.asignarCliente();
	}
	
}
