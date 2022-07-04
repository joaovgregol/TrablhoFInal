package org.trabalhofinal;


import org.trabalhofinal.model.Aluno;
import org.trabalhofinal.model.Disciplina;
import org.trabalhofinal.model.Prova;
import org.trabalhofinal.model.Trabalho;
import org.trabalhofinal.util.Calcula;

import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        Disciplina disciplina = new Disciplina("Portugues");
        Trabalho trabalho = new Trabalho(10);
        Prova prova = new Prova( 10);
        Aluno aluno1 = new Aluno("João");

        Calcula calcula = new Calcula();
        calcula.calculaNotaFinal(trabalho, prova, aluno1);
    }
}
