package com.idat.MarioAlejoTapullimaOpenFeign.modelo;

import java.util.List;

public class Openfeign {
	private Integer idOpen;
	private String nombreOpen;
	private List<Cliente>listarCliente;
	private List<Lavadora>listarLavadora;
	private List<Ropa>listarRopa;
	public Integer getIdOpen() {
		return idOpen;
	}
	public void setIdOpen(Integer idOpen) {
		this.idOpen = idOpen;
	}
	public String getNombreOpen() {
		return nombreOpen;
	}
	public void setNombreOpen(String nombreOpen) {
		this.nombreOpen = nombreOpen;
	}
	public List<Cliente> getListarCliente() {
		return listarCliente;
	}
	public void setListarCliente(List<Cliente> listarCliente) {
		this.listarCliente = listarCliente;
	}
	public List<Lavadora> getListarLavadora() {
		return listarLavadora;
	}
	public void setListarLavadora(List<Lavadora> listarLavadora) {
		this.listarLavadora = listarLavadora;
	}
	public List<Ropa> getListarRopa() {
		return listarRopa;
	}
	public void setListarRopa(List<Ropa> listarRopa) {
		this.listarRopa = listarRopa;
	}


	
}
