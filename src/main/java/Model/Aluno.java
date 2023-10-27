/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Enums.EnumStatus;
import Enums.EnumTurnos;
import GerenciadorSistema.GerenciadorCurso;
/**
 *
 * @author Breno
 */
public class Aluno extends Pessoa{
    private int matriculaAluno = (this.matriculaAluno++)+100;
    private EnumTurnos turnoAluno;
    private EnumStatus status;
    private float media;
    private String senha, email;
    private int referenciaCurso;   //Essa variavel receberá o número do codigo do curso
                                    // que o aluno faz parte
    private int referenciaTurma;   //Essa variavel receberá o numero do codigo da Turma que
                                    // o aluno faz parte
    //String nota1, nota2, nota3;
    public Aluno(String nome, String cpf, String sexo, String data_nascimento, String email, String senha/* String media, String nota1, String nota2, String nota3*/){
        super(nome, cpf, sexo, data_nascimento);
        this.senha = senha;
        this.email = email;
    }

    public Aluno(){
    }
    public int getMatricula() {
        return matriculaAluno;
    }
    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = EnumStatus.valueOf(status);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getReferenciaCurso() {
        return referenciaCurso;
    }

    public void setReferenciaCurso(int referenciaCurso) {
        this.referenciaCurso = referenciaCurso;
    }

    public int getReferenciaTurma() {
        return referenciaTurma;
    }

    public void setReferenciaTurma(int referenciaTurma) {
        this.referenciaTurma = referenciaTurma;
    }

    public String getTurnoAluno() {
        return String.valueOf(turnoAluno);
    }

    public void setTurnoAluno(String turnoAluno) {
        this.turnoAluno = EnumTurnos.valueOf(turnoAluno);
    }
}
