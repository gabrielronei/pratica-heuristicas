package com.deveficiente.heuristicas.valueobjects.cpf.v2;

import org.springframework.stereotype.Component;

@Component
public class ClienteRepositoryV2 {


	public ClienteV2 busca(Long id) {
		return new ClienteV2("985746985643");
	}
}
