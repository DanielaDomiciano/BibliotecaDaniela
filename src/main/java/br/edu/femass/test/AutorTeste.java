package br.edu.femass.test;

import br.edu.femass.model.Autor;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AutorTest {

    @Test
    void cadastrarAutor() {
        Autor autor = new Autor("Nome", "Sobrenome", "Nacionalidade");

        String nome = "Nome";
        String sobrenome = "Sobrenome";
        String nacionalidade = "Nacionalidade";

        Assertions.assertEquals(nome, autor.getNome());
        Assertions.assertEquals(sobrenome, autor.getSobrenome());
        Assertions.assertEquals(nacionalidade, autor.getNacionalidade());
    }


}