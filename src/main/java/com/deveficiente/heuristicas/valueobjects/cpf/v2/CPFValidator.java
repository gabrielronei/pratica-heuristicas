package com.deveficiente.heuristicas.valueobjects.cpf.v2;

public class CPFValidator {

    static boolean isValid(String cpf) {
        var cpfValidator = new org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator();
        cpfValidator.initialize(null);

        return cpfValidator.isValid(cpf, null);
    }
}
