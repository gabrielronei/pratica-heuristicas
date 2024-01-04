package com.deveficiente.heuristicas.valueobjects.cpf.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExibeCpfControllerV2 {

	private ClienteRepositoryV2 clienteRepository;


	public ExibeCpfControllerV2(ClienteRepositoryV2 clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@GetMapping("/cpf/v2")
	public String executa(Long idCliente) {
		
		ClienteV2 cliente = clienteRepository.busca(idCliente);
		/*
		 * Como você sabe se o cpf está na formataçÃo que você precisa aqui?	
		 */
		return cliente.getFormattedCPF();
	}

	public static void main(String[] args) {
		ClienteV2 clienteV2 = new ClienteV2("478.904.910-85");

		System.out.println(clienteV2.getRawCPF());
		System.out.println(clienteV2.getFormattedCPF());

		System.out.println("====================================");

		clienteV2 = new ClienteV2("09452783060");
		System.out.println(clienteV2.getRawCPF());
		System.out.println(clienteV2.getFormattedCPF());
	}
	
}
