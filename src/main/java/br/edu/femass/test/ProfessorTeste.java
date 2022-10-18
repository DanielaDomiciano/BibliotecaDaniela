package br.edu.femass.test;

import br.edu.femass.dao.DaoProfessor;
import br.edu.femass.model.Professor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void criarProfessor() {

        Professor professor = new Professor("Nome", "Endereco", "Telefone",
                "Disciplina");

        String nome = "Nome";
        String endereco = "Endereco";
        String telefone = "Telefone";
        String disciplina = "Disciplina";

        Assertions.assertEquals(nome, professor.getNome());
        Assertions.assertEquals(endereco, professor.getEndereco());
        Assertions.assertEquals(telefone, professor.getTelefone());
        Assertions.assertEquals(disciplina, professor.getDisciplina());
    }

    @Test
    void atualizarCodigo() {

        Professor professor = new Professor("Nome", "Endereco", "Telefone",
                "Disciplina");
        professor.atualizarCodigo();
        Long maior = 1L;
        try {
            List<Professor> professores = new DaoProfessor().getAll();
            for (Professor p: professores) {
                if (p.getCodigo() > maior) {
                    maior = p.getCodigo();
                    professor.setCodigo(maior + 1);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assertions.assertEquals(maior, professor.getCodigo());
    }
}