package br.edu.femass.gui;

import br.edu.femass.dao.DaoAutor;
import br.edu.femass.model.Autor;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class guiAutor {
    private javax.swing.JPanel JPanel;
    private JTextField txtNome;
    private JTextField txtSobrenome;
    private JTextField txtNacionalidade;
    private JButton btnRegistrar;
    private JList lstAutor;

    public JList getLstAutor() {
        return lstAutor;
    }

    public JPanel getJPanel() {
        return JPanel;
    }

    public guiAutor() {
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Autor autor = new Autor(txtNome.getText(), txtSobrenome.getText(), txtNacionalidade.getText());
                    new DaoAutor().save(autor);
                    updateList();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        lstAutor.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Autor autor = (Autor) lstAutor.getSelectedValue();
                if (autor==null) return;
                txtNome.setText(autor.getNome());
                txtSobrenome.setText(autor.getSobrenome());
                txtNacionalidade.setText(autor.getNacionalidade());
            }
        });
    }

    private void updateList() {
        try {
            List<Autor> autores = new DaoAutor().getAll();
            lstAutor.setListData(autores.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
