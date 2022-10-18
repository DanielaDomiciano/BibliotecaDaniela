package br.edu.femass.model;

public class Autor {
    private String nome;
    private String sobrenome;
    private String nacionalidade;

    public Autor(){

    }

    public Autor(String nome, String sobrenome, String nacionalidade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String toString(){
        return this.nome;
        //return this.sobrenome.toUpperCase() + ", " + this.nome;
    }

}
