package br.edu.femass;

import br.edu.femass.gui.guiPrincipal;


import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(String[] args) {
        guiPrincipal guiPrincipal = new guiPrincipal();
        JFrame frame = new JFrame("Menu Principal do Sistema Biblioteca");
        frame.setContentPane(guiPrincipal.getJPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);

    }

}
