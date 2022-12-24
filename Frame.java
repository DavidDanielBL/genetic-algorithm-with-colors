/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetic_algorithm_colors;

import java.awt.Component;

import java.awt.GridLayout;

import javax.swing.JFrame;

/**
 *
 * @author David Daniel Beltrán López
 */

public class Frame extends JFrame {

    public Frame() {
        Alleles_pane con = new Alleles_pane();
        this.setBounds(10, 10, 300, 300);
        this.setSize(1280, 670);
        this.setVisible(true);
        this.setTitle("Genetic Algorithm");
        Component consoleA = con.console("Console");
        setLayout(new GridLayout(1, 1));
        add(consoleA);

    }

}
