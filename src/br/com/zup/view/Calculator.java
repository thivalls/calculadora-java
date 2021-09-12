package br.com.zup.view;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator() {
        load();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(232, 322);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void load() {
        BorderLayout layout = new BorderLayout();

        Teclado teclado = new Teclado();
        setPreferredSize(new Dimension(233, 262));
        add(teclado, BorderLayout.CENTER);

        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 60));
        add(display, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
