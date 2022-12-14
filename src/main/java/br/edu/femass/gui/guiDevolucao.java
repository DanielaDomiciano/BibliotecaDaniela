package br.edu.femass.gui;

import br.edu.femass.dao.DaoEmprestimo;
import br.edu.femass.model.Emprestimo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class guiDevolucao {
    private javax.swing.JPanel JPanel;
    private JList lstDevolucaoEmprestimo;

    public guiDevolucao() {

        updateList();
        lstDevolucaoEmprestimo.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Emprestimo emprestimo = (Emprestimo) lstDevolucaoEmprestimo.getSelectedValue();
                if (emprestimo==null) return;
            }
        });
    }

    private void updateList() {
        try {
            List<Emprestimo> emprestimos = new DaoEmprestimo().getAll();
            lstDevolucaoEmprestimo.setListData(emprestimos.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public JPanel getJPanel() {
        return JPanel;
    }
}


