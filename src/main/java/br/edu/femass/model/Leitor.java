package br.edu.femass.model;

import java.util.ArrayList;

public class Leitor {

    private Long codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private Integer prazoMaximoDevolucao;
    private static Long proximoCodigo = 1L;


    public Leitor() {

    }

    public Leitor(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.codigo = proximoCodigo;
        proximoCodigo++;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getPrazoMaximoDevolucao() {
        return prazoMaximoDevolucao;
    }

    public void setPrazoMaximoDevolucao(Integer prazoMaximoDevolucao) {
        this.prazoMaximoDevolucao = prazoMaximoDevolucao;
    }
    public boolean equals(Object obj) {
        Leitor leitor = (Leitor) obj;
        return this.prazoMaximoDevolucao.equals(leitor.getPrazoMaximoDevolucao());
    }

    public String toString() {
        return "Nome: " + this.nome + " Devolução em: " + this.prazoMaximoDevolucao + " dias.";
    }

}
