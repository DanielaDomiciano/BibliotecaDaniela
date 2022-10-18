package br.edu.femass.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiLeitor {
    private javax.swing.JPanel JPanel;
    private JButton btnCadastroProfessor;
    private JButton btnCadastroAluno;
    private JButton btnEmprestimo;
    private JButton btnDevolucao;

    public JPanel getjPanel() {
        return JPanel;
    }

    public guiLeitor() {
        btnCadastroProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiProfessor guiProfessor = new guiProfessor();
                JFrame frame = new JFrame("Professores");
                frame.setContentPane(guiProfessor.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
        btnCadastroAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiAluno guiAluno = new guiAluno();
                JFrame frame = new JFrame("Alunos");
                frame.setContentPane(guiAluno.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
        btnEmprestimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiEmprestimo guiEmprestimo = new guiEmprestimo();
                JFrame frame = new JFrame("Emprestimos");
                frame.setContentPane(guiEmprestimo.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
        btnDevolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ActionEvent) {
                guiDevolucao guiDevolucao = new guiDevolucao();
                JFrame frame = new JFrame("Devoluções");
                frame.setContentPane(guiDevolucao.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }


    public JPanel getJPanel() {
        return JPanel;
    }
}

