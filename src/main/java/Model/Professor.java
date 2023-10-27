/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import GerenciadorSistema.GerenciadorProfessor;
import GerenciadorSistema.GerenciadorTurma;
/**
 *
 * @author Breno
 */
public class Professor extends Pessoa{
    private int matriculaFuncionario = (this.matriculaFuncionario++)+100;
    private double salario;
    private String email, senha;
    private GerenciadorProfessor turmasprofessor;
    public Professor(String nome, String cpf, String sexo, String data_nascimento, String email, String senha) {
        super(nome, cpf, sexo, data_nascimento);
        this.email = email;
        this.senha = senha;
    }

    public Professor() {
    }
    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /*public GerenciadorTurma turmaAddProfessor(GerenciadorTurmas a){
        turmasprofessor.getlistaProfessores();
    } */
}
