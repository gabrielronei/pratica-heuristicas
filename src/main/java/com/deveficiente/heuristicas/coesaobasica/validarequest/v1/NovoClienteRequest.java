package com.deveficiente.heuristicas.coesaobasica.validarequest.v1;

import java.util.Optional;

public class NovoClienteRequest {

	private String nomePais;
	private String nomeEstado;

	public NovoClienteRequest(String nomePais) {
		//país é obrigatório no cadastro
		super();
		this.nomePais = nomePais;
	}
	
	public void setEstado(String nomeEstado) {
		//estado é opcional
		this.nomeEstado = nomeEstado;
	}

	public Optional<String> getNomeEstado() {
		return Optional.ofNullable(this.nomeEstado);
	}

	public String getNomePais() {
		return nomePais;
	}
}
