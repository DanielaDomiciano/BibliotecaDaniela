package br.edu.femass.test;

import br.edu.femass.model.Exemplar;
import br.edu.femass.model.Livro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ExemplarTest {

    @Test
    void cadastrarExemplar() {

        Livro livro = new Livro();
        Exemplar exemplar = new Exemplar(LocalDate.now(), livro);

        LocalDate data = LocalDate.now();

        Assertions.assertEquals(data, exemplar.getDataAquisicao());

    }

}