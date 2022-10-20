package br.edu.femass.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiBibliotecario {
    private javax.swing.JPanel JPanel;
    private JButton btnCadastroLivro;
    private JButton btnCadastrarExemplar;
    public JPanel getJPanel() {
        return JPanel;
    }

    public guiBibliotecario() {
        btnCadastroLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLivro guiLivro = new guiLivro();
                guiAutor guiAutor = new guiAutor();
                JFrame frame = new JFrame("Cadastro de Livro");

                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });

        btnCadastrarExemplar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiExemplar guiExemplar = new guiExemplar();
                JFrame frame = new JFrame("Cadastro de Exemplar");
                frame.setContentPane(guiExemplar.getJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
