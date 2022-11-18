package edu.jdbc.dao;


public class Pedido {

	//Properties
	int id;
	String cod_estado_envio;
	
	//Constructor
	public Pedido(int id, String cod_estado_envio) {
		super();
		this.id = id;
		this.cod_estado_envio = cod_estado_envio;
	}

	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCod_estado_envio() {
		return cod_estado_envio;
	}
	public void setCod_estado_envio(String cod_estado_envio) {
		this.cod_estado_envio = cod_estado_envio;
	}


	//ToString
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cod_estado_envio=" + cod_estado_envio + "]";
	}
}
