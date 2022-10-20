package br.edu.femass.gui;

import br.edu.femass.dao.DaoAluno;
import br.edu.femass.model.Aluno;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class guiAluno {
    private javax.swing.JPanel JPanel;
    private JFormattedTextField txtNome;
    private JFormattedTextField txtEndereco;
    private JFormattedTextField txtTelefone;
    private JFormattedTextField txtMatricula;
    private JButton btnOk;
    private JList lstAluno;

    public JPanel getJPanel() { return JPanel; }

    public guiAluno() {

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Aluno aluno = new Aluno(txtNome.getText(), txtEndereco.getText(),
                            txtTelefone.getText(), txtMatricula.getText());
                    new DaoAluno().save(aluno);
                    aluno.atualizarCodigo();
                    updateList();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        lstAluno.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Aluno aluno = (Aluno) lstAluno.getSelectedValue();
                if (aluno==null) return;
                txtNome.setText(aluno.getNome());
                txtEndereco.setText(aluno.getEndereco());
                txtTelefone.setText(aluno.getTelefone());
                txtMatricula.setText(aluno.getMatricula());
            }
        });
    }

    private void updateList() {
        try {
            List<Aluno> alunos = new DaoAluno().getAll();
            lstAluno.setListData(alunos.toArray());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
