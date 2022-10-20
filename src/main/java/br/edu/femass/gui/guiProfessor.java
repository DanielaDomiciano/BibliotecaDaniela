package br.edu.femass.gui;

import br.edu.femass.dao.DaoProfessor;
import br.edu.femass.model.Professor;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class guiProfessor {
    private JFormattedTextField txtNome;
    private javax.swing.JPanel JPanel;
    private JFormattedTextField txtEndereco;
    private JFormattedTextField txtTelefone;
    private JFormattedTextField txtDisciplina;
    private JButton btnOk;
    private JList lstProfessor;

    public JPanel getJPanel() {
        return JPanel;
    }

    public guiProfessor() {
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Professor professor = new Professor(txtNome.getText(), txtEndereco.getText(),
                            txtTelefone.getText(), txtDisciplina.getText());
                    new DaoProfessor().save(professor);
                    professor.atualizarCodigo();
                    updateList();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        lstProfessor.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Professor professor = (Professor) lstProfessor.getSelectedValue();
                if (professor==null) return;
                txtNome.setText(professor.getNome());
                txtEndereco.setText(professor.getEndereco());
                txtTelefone.setText(professor.getTelefone());
                txtDisciplina.setText(professor.getDisciplina());
            }
        });
    }

    private void updateList() {
        try {
            List<Professor> professores = new DaoProfessor().getAll();
            lstProfessor.setListData(professores.toArray());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
