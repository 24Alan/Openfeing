package com.idat.MarioAlejoTapullimaOpenFeign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.MarioAlejoTapullimaOpenFeign.modelo.Cliente;
import com.idat.MarioAlejoTapullimaOpenFeign.modelo.Lavadora;
import com.idat.MarioAlejoTapullimaOpenFeign.modelo.Ropa;

@FeignClient(name ="final-cliente",url="localhost:8080")
public interface OpenFeignClient {
	@GetMapping("/cliente/v1/listar")
	public List<Cliente>listarCliente();
	@GetMapping("/Lavadora/v1/listar")
	public List<Lavadora>listarLavadora();
	@GetMapping("/Ropa/v1/listar")
	public List<Ropa>listarRopa();
}
