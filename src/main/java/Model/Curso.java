/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Enums.EnumTurnos;
import GerenciadorSistema.GerenciadorAluno;
/**
 *
 * @author Breno
 */
public class Curso {
   //Abaixo, essa variável vai conter o número do codigo do Curso ao qual
    // Turma(s) e Aluno(s) farão parte e poderão se referenciar.
    private int codigoCurso = (this.codigoCurso++)+100;
    private String nomeCurso;
    private EnumTurnos turnoCurso;

    public Curso(){}
    public Curso(String nomeCurso, String turnoCurso){
        this.nomeCurso = nomeCurso;
        // Abaixo está definindo que o valor de turnoCurso recebido por parametro em String
        // será transformado em um valor do tipo EnumTurnos.
        this.turnoCurso = EnumTurnos.valueOf(turnoCurso);
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getTurnoCurso() {
        return String.valueOf(turnoCurso);
    }

    public void setTurnoCurso(String turnoCurso) {
        this.turnoCurso = EnumTurnos.valueOf(turnoCurso);
    } 
}
