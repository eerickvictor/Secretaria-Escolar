/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciadorSistema;

import java.util.LinkedList;
import Model.Professor;
/**
 *
 * @author Breno
 */
public class GerenciadorProfessor {
    private LinkedList<Professor> professores;
    private static GerenciadorProfessor chamadaProfessores = null;

    private GerenciadorProfessor(){
        this.professores = new LinkedList<Professor>();
    }

    public static GerenciadorProfessor getInstance(){
        if(chamadaProfessores == null){
            chamadaProfessores = new GerenciadorProfessor();
        }
        return chamadaProfessores;
    }

    public void adicionarAluno(Professor professor){
        this.professores.add(professor);
    }

    public boolean buscarAluno(Professor aluno){

        for(Professor elemento: this.professores){
            if (elemento.getEmail().equals(aluno.getEmail()) && (elemento.getSenha().equals(aluno.getSenha()))){
                return true;
            }
        }
        return false;
    }

    public String listarAluno(){
        String texto = "";

        for(Professor elemento: this.professores){
            texto = texto + "Nome: " + elemento.getNome() + "\n";
            texto = texto + "Login: " + elemento.getEmail() + "\n";
            texto = texto + "Senha: " + elemento.getSenha() + "\n\n";
        }
        return texto;
    }
    public GerenciadorProfessor getlistaProfessores(){
        return chamadaProfessores;
    }
}
