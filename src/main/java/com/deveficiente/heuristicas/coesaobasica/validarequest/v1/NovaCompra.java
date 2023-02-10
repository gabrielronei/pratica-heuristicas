package com.deveficiente.heuristicas.coesaobasica.validarequest.v1;

import org.springframework.util.Assert;

public class NovaCompra {

	private Pais pais;
	private Estado estado;

	public NovaCompra(Pais pais) {
		super();
		this.pais = pais;
	}
	
	public void setEstado(Estado estado) {
		/*
		 * não é permitido criar uma compra com um estado que não pertence
		 * ao país de origem da compra. Caso isso aconteça, uma exception aqui
		 * precisa ser lançada, já que temos um bug.  
		 */
		Assert.isTrue(estado.pertence(pais),"Estado não pertence ao pais!");

		this.estado = estado;
	}

}
