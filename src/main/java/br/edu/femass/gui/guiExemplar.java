package br.edu.femass.gui;

import br.edu.femass.dao.DaoExemplar;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.model.Exemplar;
import br.edu.femass.model.Livro;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

public class guiExemplar {
    private JList lstLivroExemplar;
    private JButton btnRegistrarExemplar;
    private javax.swing.JPanel JPanel;
    public guiExemplar() {

        updateList();
        btnRegistrarExemplar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (lstLivroExemplar.getSelectedValue() == null) {
                        JOptionPane.showMessageDialog(null, "Nenhum livro Selecionado");
                    }
                    else {
                        Livro livro = (Livro) lstLivroExemplar.getSelectedValue();
                        Exemplar exemplar = new Exemplar(LocalDate.now(), livro);
                        new DaoExemplar().save(exemplar);
                        JOptionPane.showMessageDialog(null, "Foi realizado o cadastro com sucesso!!!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }


            }
        });
        lstLivroExemplar.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Livro livro = (Livro) lstLivroExemplar.getSelectedValue();
                    if (livro==null) return;
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    private void updateList() {
        try {
            List<Livro> livros = new DaoLivro().getAll();
            lstLivroExemplar.setListData(livros.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public JPanel getJPanel() {
        return JPanel;
    }
}
