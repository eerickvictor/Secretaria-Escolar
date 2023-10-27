/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciadorSistema;

import java.util.LinkedList;
import Model.Aluno;
/**
 *
 * @author Breno
 */
public class GerenciadorAluno {
    //ArrayList ou LinkedList??
    private LinkedList<Aluno> alunos;
    private static GerenciadorAluno existeLista = null;
    private GerenciadorAluno(){
        this.alunos = new LinkedList<Aluno>();
    }

    public static GerenciadorAluno getInstance(){
        if(existeLista == null){
            existeLista = new GerenciadorAluno();
        }
        return existeLista;
    }

    public boolean validarAluno(String email, String senha){
        //Faz a verificação nos registros dos alunos com email e senha retornando verdadeiro ou falso

        for(Aluno u: this.alunos){
            if (u.getEmail().equals(email) && (u.getSenha().equals(senha))){
                return true;
            }
        }
        return false;
    }
    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void adcAlunoTurma(int  matriculaAluno, int codigoTurma){
        //Adiciona um aluno a uma turma

        String texto = "";
        /*if(GerenciadorTurmas.getInstance() != null){
            for (GerenciadorTurmas a: GerenciadorTurmas.getInstance());
        }*/
        for (Aluno e : this.alunos){
            if (e.getMatricula() == matriculaAluno){
                e.setReferenciaTurma(codigoTurma);
                texto = texto+"O aluno(a) "+e.getNome()+" matricula: "+e.getMatricula()+
                        "foi adicionado(a) a turma "+e.getReferenciaTurma();
                return;
            }
        }
        texto = texto +"Aluno(a) ou turma não encontrado :/";
    }
    public void adcAlunoCurso(int  matriculaAluno, int codigoCurso){
        //Adiciona um aluno a um curso
        String texto = "";

        for (Aluno e : this.alunos){
            if (e.getMatricula() == matriculaAluno){
                e.setReferenciaCurso(codigoCurso);
                texto = texto+"O aluno(a) "+e.getNome()+" matricula: "+e.getMatricula()+
                        "foi adicionado(a) ao curso "+e.getReferenciaCurso();
                return;
            }
        }
        texto = texto +"Aluno(a) ou turma não encontrado :/";
    }
    public String buscarAluno(int matriculaAluno) {
        //Mostra os dados de um aluno ao informar a matricula

        String texto = "";
        for (Aluno u : this.alunos) {
            if (u.getMatricula() == matriculaAluno) {
                texto = "Matricula: " + u.getMatricula()+"                 Situação: "+u.getStatus() +
                        "\nNome: " + u.getNome() + "\nSexo: "+ u.getSexo()+
                        "\nNascimento: "+u.getData_nascimento()+ "\nEmail: "+ u.getEmail()+
                        "\nCurso: "+u.getReferenciaCurso()+"              Turma: "+u.getReferenciaTurma()+"\n\n";
                return texto;
            }
        }return "Nenhum registro foi encontrado :/";
    }

    public String listarAlunos(){
        //Mostra os dados de todos os alunos registrados no sistema
        String texto = "";

        for(Aluno u: this.alunos){
            texto = "Matricula: " + u.getMatricula()+"                 Situação: "+u.getStatus() +
                    "\nNome: " + u.getNome() + "\nSexo: "+ u.getSexo()+
                    "\nNascimento: "+u.getData_nascimento()+ "\nEmail: "+ u.getEmail()+
                    "\nCurso: "+u.getReferenciaCurso()+"              Turma: "+u.getReferenciaTurma()+"\n\n";
        }
        return texto;
    }
    public String listarAlunos(int codigoCurso, String turnoCurso){
        //Mostra os dados de todos os alunos registrados em um Curso no turno correspondente.
        String texto = "";
        for (Aluno u : this.alunos) {
            if (u.getReferenciaCurso() == codigoCurso && u.getTurnoAluno().equals(turnoCurso)) {
                texto = "Matricula: " + u.getMatricula() + "                 Situação: " + u.getStatus() +
                        "\nNome: " + u.getNome() + "\nSexo: " + u.getSexo() +
                        "\nNascimento: " + u.getData_nascimento() + "\nEmail: " + u.getEmail() +
                        "\nCurso: "+u.getReferenciaCurso()+ "Turno: "+u.getTurnoAluno()+
                        "\nTurma: " + u.getReferenciaTurma() +"\n\n";
            }
        }
        if (texto.equals("")){
            texto = "Não há nenhum aluno(a) neste curso.";
            return texto;
        }
        return texto;
    }
    public String listarAlunos(int codigoCurso, int codigoTurma){
        //Mostra os dados de todos os alunos registrados em uma única Turma de um mesmo Curso.
        String texto = "";
        for (Aluno u : this.alunos) {
            if (u.getReferenciaTurma() == codigoTurma && u.getReferenciaCurso() == codigoCurso) {
                texto = "Matricula: " + u.getMatricula() + "                 Situação: " + u.getStatus() +
                        "\nNome: " + u.getNome() + "\nSexo: " + u.getSexo() +
                        "\nNascimento: " + u.getData_nascimento() + "\nEmail: " + u.getEmail() +
                        "\nCurso: " + u.getReferenciaCurso() + "              Turma: " + u.getReferenciaTurma() +"\n\n";
            }
        }
        if (texto.equals("")){
            texto = "Não há nenhum aluno(a) neste curso.";
            return texto;
        }
        return texto;
    }
    public void alterarAluno(int matriculaAluno){
        //Faz alteração dos dados do aluno (Adm)

        for (Aluno e :this.alunos){
            if (e.getMatricula() == matriculaAluno ) {
                System.out.println("Matricula: "+e.getMatricula()+"            Situação: "); e.setStatus("");
                System.out.println("Nome: ");           e.setNome("");
                System.out.println("Sexo: ");           e.setSexo("");
                System.out.println("Nascimento: ");     e.setData_nascimento("");
                System.out.println("Email: ");          e.setEmail("");
                System.out.println("Curso: ");          e.setReferenciaCurso(123);
                System.out.println("Turma");            e.setReferenciaTurma(321);
            }
        }
    }
}
