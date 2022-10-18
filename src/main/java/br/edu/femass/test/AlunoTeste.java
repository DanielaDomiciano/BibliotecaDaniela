package br.edu.femass.test;

import br.edu.femass.dao.DaoAluno;
import br.edu.femass.model.Aluno;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void criarAluno() {

        Aluno aluno = new Aluno("Nome", "Endereco", "Telefone", "Matricula");

        String nome = "Nome";
        String endereco = "Endereco";
        String telefone = "Telefone";
        String matricula = "Matricula";

        Assertions.assertEquals(nome, aluno.getNome());
        Assertions.assertEquals(endereco, aluno.getEndereco());
        Assertions.assertEquals(telefone, aluno.getTelefone());
        Assertions.assertEquals(matricula, aluno.getMatricula());
    }

    @Test
    void atualizarCodigo() {

        Aluno aluno = new Aluno("Nome", "Endereco", "Telefone", "Matricula");

        aluno.atualizarCodigo();
        Long maior = 1L;

        try {
            List<Aluno> alunos = new DaoAluno().getAll();
            for (Aluno al: alunos) {
                if (al.getCodigo() > maior) {
                    maior = al.getCodigo();
                    aluno.setCodigo(maior + 1);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assertions.assertEquals(maior, aluno.getCodigo());
    }

}