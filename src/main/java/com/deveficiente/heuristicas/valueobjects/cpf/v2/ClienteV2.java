package com.deveficiente.heuristicas.valueobjects.cpf.v2;

public class ClienteV2 {

	private CPF cpf;

	public ClienteV2(String cpf) {
		super();
		this.cpf = CPF.fromString(cpf);
	}

	public String getRawCPF() {
		return cpf.getRawCPF();
	}

	public String getFormattedCPF() {
		return cpf.getFormattedCpf();
	}
}
