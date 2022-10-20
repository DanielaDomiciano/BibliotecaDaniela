package br.edu.femass.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiMenu {
    private javax.swing.JPanel JPanel;
    private JButton btnBibliotecario;
    private JButton btnAtendente;
    private JLabel lblInicial;

    public JPanel getJPanel() {
        return JPanel;
    }

    public guiMenu() {
        btnBibliotecario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiBibliotecario guiBibliotecario = new guiBibliotecario();
                JFrame frame = new JFrame("Bibliotecaria (o)");
                frame.setContentPane(guiBibliotecario.getJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);

            }
        });
        btnAtendente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLeitor guiLeitor = new guiLeitor();
                JFrame frame = new JFrame("Atendente");
                frame.setContentPane(guiLeitor.getJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
