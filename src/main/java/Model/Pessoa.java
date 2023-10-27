/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Enums.EnumSexo;
/**
 *
 * @author Breno
 */
public abstract class Pessoa {
    //Logo abaixo estão sendo definidos os atributos da classe Pessoa
    private String nome;
    private String cpf;
    private EnumSexo sexo;
    private String data_nascimento;

    //Esse carinha logo abaixo é o CONSTRUTOR, que basicamente armazena um espaço na memoria
    // do pc para os valores que vão ser atribuidos, ele inicializa um valor que ainda não foi declarado
    public Pessoa(String nome, String cpf, String data_nascimento, String sexo ) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        //this.sexo é uma variavel do tipo EnumSexo ele está recebendo por parametro um valor do tipo
        // String e convertendo para o tipo da variavel this.sexo logo abaixo
        this.sexo = EnumSexo.valueOf(sexo);
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return String.valueOf(sexo);
    }

    public void setSexo(String sexo) {
        this.sexo = EnumSexo.valueOf(sexo);
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
