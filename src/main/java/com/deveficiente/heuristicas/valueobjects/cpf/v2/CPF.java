package com.deveficiente.heuristicas.valueobjects.cpf.v2;

import org.springframework.util.Assert;

public final class CPF {

    private final String rawCPF; //sempre salvamos como raw
    private final String formattedCPF; //sempre salvamos como raw

    private CPF(String rawCPF, String formattedCPF) {
        Assert.isTrue(CPFValidator.isValid(rawCPF), "Deve ser um CPF valido!");
        Assert.isTrue(CPFValidator.isValid(formattedCPF), "Deve ser um CPF valido!");

        this.rawCPF = rawCPF;
        this.formattedCPF = formattedCPF;
    }

    public String getRawCPF() {
        return rawCPF;
    }

    public String getFormattedCpf() {
        return this.formattedCPF;
    }

    public static CPF fromString(final String cpf) {
        var cpfFormatter = new CPFFormatter();

        if (cpfFormatter.isFormatted(cpf)) {
            return new CPF(cpfFormatter.unformat(cpf), cpf);
        }

        return new CPF(cpf, cpfFormatter.format(cpf));
    }
}
