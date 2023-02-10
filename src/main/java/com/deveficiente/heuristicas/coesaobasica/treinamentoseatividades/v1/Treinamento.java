package com.deveficiente.heuristicas.coesaobasica.treinamentoseatividades.v1;

import java.util.*;

public class Treinamento {

    private String titulo;
    private List<String> titulosAtividades = new ArrayList<>();

    public Treinamento(String titulo) {
        super();
        this.titulo = titulo;
    }

    public void addTituloAtividade(String titulo) {
        this.titulosAtividades.add(titulo);
    }


    public OptionalInt getPosition(String titulo) {
        final var index = this.titulosAtividades.indexOf(titulo);

        return index < 0 ? OptionalInt.empty() : OptionalInt.of(index);
    }

    public static void main(String[] args) {
        Treinamento testeDeFogo = new Treinamento("teste de fogo para você");

        /*
         * Primeiro passo é vocé implementar a adição de titulos de atividades
         * dentro do treinamento. Como você faria?
         */

        testeDeFogo.addTituloAtividade("Atividade 1");
        testeDeFogo.addTituloAtividade("Atividade 2");
        testeDeFogo.addTituloAtividade("Atividade 3");

        /*
         * Uma vez que você implementou a adição de titulos de atividades,
         * é necessário que você possibilite a descoberta da posicao do titulo
         * da atividade dentro do treinamento.
         */

        OptionalInt position = testeDeFogo.getPosition("Atividade 0");

        System.out.println(position);

    }
}
