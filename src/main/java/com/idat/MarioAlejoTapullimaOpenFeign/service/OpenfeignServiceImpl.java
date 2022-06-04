package com.idat.MarioAlejoTapullimaOpenFeign.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.MarioAlejoTapullimaOpenFeign.client.OpenFeignClient;
import com.idat.MarioAlejoTapullimaOpenFeign.modelo.Openfeign;

public class OpenfeignServiceImpl implements OpenfeignService {
	
	@Autowired
	private OpenFeignClient cliente;

	@Override
	public List<Openfeign> asignarCliente() {
		List<Openfeign>listaropen= new ArrayList<>();
		Openfeign open= new Openfeign();
		
		open.setNombreOpen("Cachito");
		open.setIdOpen(1);
		open.setListarCliente(cliente.listarCliente());
		listaropen.add(open);
		return listaropen;
	}

}
