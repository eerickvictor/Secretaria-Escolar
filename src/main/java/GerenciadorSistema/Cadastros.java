/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciadorSistema;

import Model.Aluno;
import Model.Curso;
import Model.Professor;
import Model.Turma;
/**
 *
 * @author Breno
 */
public class Cadastros {
    //Essa classe é temporária e será substituída com a parte da web
    // onde os dados serão coletados de acordo com a proposta do professor Mayrton.
    public void CadastrarAluno(){
        Aluno aluno = new Aluno();

        System.out.println("Nome: ");
        aluno.setNome("INAJÁ");             //(webNome);
        aluno.setCpf("");               //A MATRICULA É GERADA PELO SISTEMA
        System.out.println("Sexo: ");
        aluno.setSexo("M");                 //(webSexo);
        System.out.println("Email: ");
        aluno.setEmail("loucoo@gmail.com"); //(webEmail);
        System.out.println("Crie uma Senha: ");
        aluno.setSenha("654321");           //(webSenha);
        System.out.println("Data de Nascimento: ");
        aluno.setData_nascimento("23/05/199");//(webDataNascimento);
        System.out.println("Informe o turno desejado: ");
        aluno.setTurnoAluno("Noite");
        //aluno.setCursoAluno(/*"Aqui é preciso passar um objeto do tipo curso"*/);//(webCursoAluno)
    }

    public void CadastrarProfessor(){
        Professor professor = new Professor();

        System.out.println("Nome: ");
        professor.setNome("Ramos");             //(webNome);
        professor.setCpf("");    //A MATRICULA É GERADA PELO SISTEMA
        System.out.println("Sexo: ");
        professor.setSexo("M");                 //(webSexo);
        System.out.println("Email: ");
        professor.setEmail("raminho@gmail.com");//(webEmail);
        System.out.println("Crie uma Senha: ");
        professor.setSenha("123456");
        System.out.println("Data de Nascimento: ");
        professor.setData_nascimento("23/05/1999");//(webDataNascimento);
        System.out.println("Remuneração: ");
        professor.setSalario(3.000);
        System.out.print("Matricula do professor: ");
        professor.getMatriculaFuncionario();
        //professor.setCursoAluno(/*"Aqui é preciso passar um objeto do tipo curso"*/);//(webCursoAluno)
    }
    public void CadastrarCurso(){
        Curso curso = new Curso();

        System.out.print("Codigo do curso: ");
        curso.getCodigoCurso();//Codigo do curso é gerado peço sistema
        System.out.println("\n\nInforme o nome do curso");
        curso.setNomeCurso("ADS - Analise e Dessenvolvimento de Sistemas ");//(webNomeCurso);
        System.out.println("Qual será o turno deste curso?");
        curso.setTurnoCurso("Noite");//(webTurnoCurso);
    }
    public void CadastrarTurma(){
        Turma turma = new Turma();

        System.out.print("Codigo da turma: ");
        turma.getCodigoCurso();//Codigo do curso é gerado peço sistema
        System.out.println("\n\nInforme o nome do curso");
        turma.setNomeTurma("Turma A");//(webNomeCurso);
        System.out.println("Qual será o turno desta turma?");
        turma.setTurnoCurso("Noite");//(webTurnoCurso);
        System.out.println("Esta turma faz parte de qual curso?" +
                "\nPor favor, informe o codigo do curso ao qual essa turma pertence: ");
        turma.setReferenciaCurso(101);
    }
}
