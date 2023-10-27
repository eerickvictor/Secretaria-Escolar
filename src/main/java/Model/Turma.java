/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Enums.EnumTurnos;

/**
 *
 * @author Breno
 */
public class Turma extends Curso {
    private int referenciaCurso; //Essa variável vai conter a referencia
                            // do codigo do Curso a qual essa Turma fará parte.
    private int codigoTurma = (this.codigoTurma++)+100; //Essa variável vai conter o número do codigo da Turma
                                                        // que está sendo criada para um Curso e os Alunos.
    private EnumTurnos turnoTurma;
    private String nomeTurma;
    //GerenciadorCurso a;

    /*public Turma(String nomeCurso, String turnoCurso,String nomeTurma) {
        super(nomeCurso, turnoCurso);
        this.nomeTurma = nomeTurma;
    }*/
    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
    public Turma(){}

    public int getReferenciaCurso() {
        return referenciaCurso;
    }

    public void setReferenciaCurso(int referenciaCurso) {
        this.referenciaCurso = referenciaCurso;
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public String getTurnoTurma() {
        return String.valueOf(turnoTurma);
    }

    public void setTurnoTurma(String turnoTurma) {
        this.turnoTurma = EnumTurnos.valueOf(turnoTurma);
    }
    public String getNomeTurma() {
        return nomeTurma;
    }
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
}
