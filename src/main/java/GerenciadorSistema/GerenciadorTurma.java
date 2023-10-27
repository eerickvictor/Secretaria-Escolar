/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciadorSistema;

import Model.Curso;
import Model.Turma;

import java.util.LinkedList;
/**
 *
 * @author Breno
 */
public class GerenciadorTurma {
    private LinkedList<Turma> turmas;
    private static GerenciadorTurma existeLista = null;
    private GerenciadorTurma(){
        this.turmas = new LinkedList<Turma>();
    }
    public static GerenciadorTurma getInstance(){
        if(existeLista == null){
            existeLista = new GerenciadorTurma();
        }
        return existeLista;
    }
    public void adicionarTurmas(Turma turma){
        this.turmas.add(turma);
    }
    public boolean buscarTurmas(Turma turma){

        for(Turma turma1: this.turmas){
            if (turma1.getCodigoCurso() == turma.getCodigoCurso()){
                return true;
            }
        }
        return false;
    }
    public String listarTurmas(){
        String texto = "";

        for(Turma turma1: this.turmas){
            texto = texto + "Codigo da turma: " + turma1.getCodigoCurso();
        }
        return texto;
    }
    public void removerCurso(Turma turma){
        this.turmas.remove(turma);
    }
}
