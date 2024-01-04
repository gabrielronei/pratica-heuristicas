package com.deveficiente.heuristicas.valueobjects.cpf.v2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriaClienteControllerV2 {

	@PostMapping("/cpf/v2")
	public void executa(String cpf) {
		/*
		 * Como você sabe se é para passar o cpf é com pontuação ou sem? Como você vai 
		 * facilitar a vida de quem vai usar essa classe?	
		 */
		new ClienteV2(cpf);
	}
}