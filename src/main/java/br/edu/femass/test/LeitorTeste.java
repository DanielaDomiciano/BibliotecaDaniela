package br.edu.femass.test;

import br.edu.femass.model.Leitor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeitorTest {

    @Test
    void cadastroGeralLeitor() {

        Leitor leitor = new Leitor("Nome", "Endereco", "Telefone");

        String nome = "Nome";
        String endereco = "Endereco";
        String telefone = "Telefone";

        Assertions.assertEquals(nome, leitor.getNome());
        Assertions.assertEquals(endereco, leitor.getEndereco());
        Assertions.assertEquals(telefone, leitor.getTelefone());
    }

}