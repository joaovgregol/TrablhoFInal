package org.trabalhofinal.model;

import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<ComposicaoNota> composicaoNotas;

    public Disciplina(String nome) {
        this.nome = nome;
    }
}
