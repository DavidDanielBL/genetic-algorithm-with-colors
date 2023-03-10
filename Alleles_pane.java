/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetic_algorithm_colors;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author David Daniel Beltrán López
 */
public class Alleles_pane extends JPanel {

    public Color color, B, F1, F2, F3,
            A1, A2, A3, A4, A5, A6, A7, A8, A9, A10; //colors;
    ColorPane pane;
    public ColorPane screen;
    public JPanel p1, p2, p3, p4;
    public JButton btExit, btUtility;
    Chromosome ac;
    List<Chromosome> pupulation, populationA;
    int numberofpopulation = 10;
    GeneticAlgorithm ab;
    Vector<Allele> v, w;

    public JTextField title, txtA, txtB, txtC, txtD, txtE,
            txtF, txtG, txtH, txtI, txtJ;

    public JTextField getTxtA() {
        return txtA;
    }

    public void setTxtA(JTextField txtA) {
        this.txtA = txtA;
    }

    public JTextField getTxtAB() {
        return txtB;
    }

    public void setTxtAB(JTextField txtB) {
        this.txtB = txtB;
    }

    public JTextField getTxtC() {
        return txtC;
    }

    public void setTxtC(JTextField txtC) {
        this.txtC = txtC;
    }

    public JTextField getTxtD() {
        return txtD;
    }

    public void setTxtD(JTextField txtD) {
        this.txtD = txtD;
    }

    public JTextField getTxtE() {
        return txtE;
    }

    public void setTxtE(JTextField txtE) {
        this.txtE = txtE;
    }

    public JTextField getTxtF() {
        return txtF;
    }

    public void setTxtF(JTextField txtF) {
        this.txtF = txtF;
    }

    public JTextField getTxtG() {
        return txtG;
    }

    public void setTxtG(JTextField txtG) {
        this.txtG = txtG;
    }

    public JTextField getTxtH() {
        return txtH;
    }

    public void setTxtH(JTextField txtH) {
        this.txtH = txtH;
    }

    public JTextField getTxtI() {
        return txtI;
    }

    public void setTxtI(JTextField txtI) {
        this.txtI = txtI;
    }

    public JTextField getTxtJ() {
        return txtJ;
    }

    public void setTxtJ(JTextField txtJ) {
        this.txtJ = txtJ;
    }

    public Component console(String text) {
        pane = new ColorPane();
        color = Color.WHITE;
        B = Color.BLACK;
        A1 = new Color(39, 63, 86);
        A2 = new Color(158, 82, 50);
        A3 = new Color(9, 125, 162);
        A4 = new Color(47, 106, 116);
        A5 = new Color(83, 12, 97);
        A6 = new Color(95, 139, 72);
        A7 = new Color(236, 240, 231);
        A8 = new Color(22, 160, 133);
        A9 = new Color(231, 76, 60);
        A10 = new Color(93, 109, 126);
        F1 = Color.black;
        p1 = new JPanel(new BorderLayout()); // Main Panel
        p2 = new JPanel(new GridLayout(2, 1)); // Panel for 3 buttoms in BorderLayout.SOUTH
        p3 = new JPanel(new GridLayout(3, 5));

        title = new JTextField(40);
        txtA = new JTextField(40);
        txtB = new JTextField(40);
        txtC = new JTextField(40);
        txtD = new JTextField(40);
        txtE = new JTextField(40);

        txtF = new JTextField(40);
        txtG = new JTextField(40);
        txtH = new JTextField(40);
        txtI = new JTextField(40);
        txtJ = new JTextField(40);

        title = new JTextField(40);
        title.setToolTipText("It shows you");
        screen = new ColorPane();
        screen.setToolTipText("The result is displayed");
        btExit = new JButton("Exit");
        btUtility = new JButton("Fitness");
        btExit.setToolTipText("Exit");
        btExit.addActionListener(new cerrarVentana());
        
        btUtility.addActionListener(new utility());
        btUtility.setBackground(Color.black);
        btUtility.setForeground(Color.WHITE);
        btExit.setBackground(Color.black);
        btExit.setForeground(Color.WHITE);
        p1.setBackground(Color.black);

        

        title.setBackground(Color.BLACK);
        txtA.setText("10");

        txtB.setText("15");

        txtC.setText("15");
        txtD.setText("15");
        txtE.setText("15");
        txtF.setText("15");
        txtG.setText("15");
        txtH.setText("15");
        txtI.setText("15");
        txtJ.setText("15");
        txtA.setBackground(Color.BLACK);
        txtB.setBackground(Color.BLACK);
        txtC.setBackground(Color.BLACK);
        txtD.setBackground(Color.BLACK);
        txtE.setBackground(Color.BLACK);
        txtF.setBackground(Color.BLACK);
        txtG.setBackground(Color.BLACK);
        txtH.setBackground(Color.BLACK);
        txtI.setBackground(Color.BLACK);
        txtJ.setBackground(Color.BLACK);

        title.setForeground(Color.WHITE);
        txtA.setForeground(A1);
        txtB.setForeground(A2);
        txtC.setForeground(A3);
        txtD.setForeground(A4);
        txtE.setForeground(A5);
        txtF.setForeground(A6);
        txtG.setForeground(A7);
        txtH.setForeground(A8);
        txtI.setForeground(A9);
        txtJ.setForeground(A10);

        title.setText("Genetic Algorithm");
        txtA.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtB.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtC.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtD.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtE.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtF.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtG.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtH.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtI.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        txtJ.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        title.setEditable(false);

        screen.setEditable(true);
        screen.setFont(new java.awt.Font("Arial", Font.PLAIN, 50));
        screen.setBackground(Color.black);

        v = new Vector<Allele>();
        w = new Vector<Allele>();

        pupulation = new ArrayList<Chromosome>();
        populationA = new ArrayList<Chromosome>();
        ab = new GeneticAlgorithm();
        ac = new Chromosome();

        utility();

        int colors = 0;

        screen.append(Color.white, "Initial Population" + "\n");

        for (Chromosome cro : pupulation) {

            for (Allele ale : cro.getV()) {

                if (colors == 0) {

                    ale.setColor(41, 128, 185);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }

                if (colors == 1) {

                    ale.setColor(52, 152, 219);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 2) {

                    ale.setColor(9, 125, 162);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 3) {

                    ale.setColor(47, 106, 116);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 4) {

                    ale.setColor(26, 188, 156);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 5) {

                    ale.setColor(36, 113, 163);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 6) {

                    ale.setColor(236, 240, 231);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 7) {

                    ale.setColor(22, 160, 133);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 8) {

                    ale.setColor(231, 76, 60);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 9) {

                   
                    ale.setColor(88, 214, 141 );
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }

            }
            screen.append(Color.WHITE, "   Fitness : " + String.valueOf(cro.getFitnesscost()));
            screen.append(Color.BLUE, "\n");
         
            colors++;
        }

        int iterations = 0;

        int parents = numberofpopulation - 1;

        while (iterations < 10) {
            GeneticAlgorithm a = new GeneticAlgorithm();

            a.setParents(parents);
            a.setSons(new ArrayList<Chromosome>());

            a.generateoffspring(1, 0.6, pupulation, a.getParents());
            screen.append(Color.white, "\nOrdered Population \n");
            for (Chromosome cro : a.getOrderedpopulation()) {

         
                for (Allele ale : cro.getV()) {
                    
                    screen.append(new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor()), String.valueOf(ale.getData()));
                }
                screen.append(Color.WHITE, "   Fitness : " + String.valueOf(cro.getFitnesscost()));
                screen.append(Color.white, "\n");
               
            }

            screen.append(Color.white, "\n" + "Number of selected parents: " + a.getParents());
            screen.append(Color.white, "\n" + "Crossover rate: " + a.getCrossoverrate());
            screen.append(Color.white, "\n" + "Number of crossed sons: (" + a.getCrossoverrate() + "*" + a.getParents() + ")≈ "
                    + a.getNumberofcrossedsons());
            screen.append(Color.white, "\n" + "Parents copies (less than): " + a.getParents());
            screen.append(Color.white, "\n" + "Mutation rate: " + a.getMutationrate());
            screen.append(Color.white, "\n" + "Number of mutated sons :(" + a.getMutationrate() + "*" + a.getNumberofcrossedsons() + ")≈ "
                    + a.getNumberofmutatedsons());
            screen.append(Color.white, "\n" + "Crossing line : " + String.valueOf(a.getCrossline()));
            screen.append(Color.white, "\n" + "Best chromosome " + "\n");
            for (Allele ale : a.getBestfitness().getV()) {
                
                screen.append(new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor()), String.valueOf(ale.getData()));
            }
            screen.append(Color.white, "\n" + "Best fitness " + String.valueOf(a.getBestfitness().getFitnesscost()) + "\n");
            screen.append(Color.white, "\n" + "Sons \n");
            for (Chromosome sons : a.getSons()) {

                for (Allele ale : sons.getV()) {
                    
                    screen.append(new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor()), String.valueOf(ale.getData()));

                }
                screen.append(Color.WHITE, "   Fitness : " + String.valueOf(sons.getFitnesscost()));
                screen.append(Color.WHITE, "   State : " + String.valueOf(sons.getStatus()));
                screen.append(Color.white, "\n");
               

            }
            a.mutation(a.getSons(), a.getMutationrate());
            pupulation = a.getSons();
            iterations++;
            if (iterations == 50) {
                JOptionPane.showMessageDialog(null, "Try again");
                break;

            }

        }

        JScrollPane pScroll = new JScrollPane(screen, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pScroll.setBackground(Color.BLACK);
        p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p1.add(p2, BorderLayout.NORTH);
        p1.add(p3, BorderLayout.SOUTH);

        p1.add(pScroll, BorderLayout.CENTER);

        p1.setFocusable(true);

        p3.add(txtA);
        p3.add(txtB);
        p3.add(txtC);
        p3.add(txtD);
        p3.add(txtE);
        p3.add(txtF);
        p3.add(txtG);
        p3.add(txtH);
        p3.add(txtI);
        p3.add(txtJ);
        p3.add(btUtility);
        p3.add(btExit);

        return p1;
    }

    public class cerrarVentana implements ActionListener {

        public void actionPerformed(ActionEvent evt) {

            System.exit(0);

        }
    }

   

    

   

    public class utility implements ActionListener {

        public void actionPerformed(ActionEvent evt) {

            screen.setText("");

            pupulation = new ArrayList<Chromosome>();
            populationA = new ArrayList<Chromosome>();
            ab = new GeneticAlgorithm();
            ac = new Chromosome();

            utility();

            int colors = 0;
            
            screen.append(Color.white, "Initial Population" + "\n");
         
            for (Chromosome cro : pupulation) {
                

                for (Allele ale : cro.getV()) {

                    if (colors == 0) {

                    ale.setColor(41, 128, 185);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }

                if (colors == 1) {

                    ale.setColor(52, 152, 219);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 2) {

                    ale.setColor(9, 125, 162);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 3) {

                    ale.setColor(47, 106, 116);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 4) {

                    ale.setColor(26, 188, 156);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 5) {

                    ale.setColor(36, 113, 163);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 6) {

                    ale.setColor(236, 240, 231);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 7) {

                    ale.setColor(22, 160, 133);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 8) {

                    ale.setColor(231, 76, 60);
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }
                if (colors == 9) {

                   
                    ale.setColor(88, 214, 141 );
                    Color color = new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor());
                    screen.append(color, String.valueOf(ale.getData()));

                }

                }
                screen.append(Color.WHITE, "   Fitness : " + String.valueOf(cro.getFitnesscost()));
                screen.append(Color.BLUE, "\n");
              
                colors++;
            }

            int iterations = 0;

            int parents = numberofpopulation - 1;

            while (iterations < 10) {
                GeneticAlgorithm a = new GeneticAlgorithm();

                a.setParents(parents);
                a.setSons(new ArrayList<Chromosome>());

                a.generateoffspring(1, 0.6, pupulation, a.getParents());
                screen.append(Color.white, "\nOrdered Population \n");
                for (Chromosome cro : a.getOrderedpopulation()) {

                   
                    for (Allele ale : cro.getV()) {
                      
                        screen.append(new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor()), String.valueOf(ale.getData()));
                    }
                    screen.append(Color.WHITE, "   Fitness : " + String.valueOf(cro.getFitnesscost()));
                    screen.append(Color.white, "\n");
                   
                }

                screen.append(Color.white, "\n" + "Number of selected parents: " + a.getParents());
                screen.append(Color.white, "\n" + "Crossover rate: " + a.getCrossoverrate());
                screen.append(Color.white, "\n" + "Number of crossed sons: (" + a.getCrossoverrate() + "*" + a.getParents() + ")≈ "
                        + a.getNumberofcrossedsons());
                screen.append(Color.white, "\n" + "Parents copies (less than): " + a.getParents());
                screen.append(Color.white, "\n" + "Mutation rate: " + a.getMutationrate());
                screen.append(Color.white, "\n" + "Number of mutated sons :(" + a.getMutationrate() + "*" + a.getNumberofcrossedsons() + ")≈ "
                        + a.getNumberofmutatedsons());
                screen.append(Color.white, "\n" + "Crossing line : " + String.valueOf(a.getCrossline()));
                screen.append(Color.white, "\n" + "Best chromosome " + "\n");
                for (Allele ale : a.getBestfitness().getV()) {
                  
                    screen.append(new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor()), String.valueOf(ale.getData()));
                }
                screen.append(Color.white, "\n" + "Best fitness " + String.valueOf(a.getBestfitness().getFitnesscost()) + "\n");
                screen.append(Color.white, "\n" + "Sons \n");
                for (Chromosome sons : a.getSons()) {

                    for (Allele ale : sons.getV()) {
                        
                        screen.append(new Color(ale.getFirstcolor(), ale.getSecondcolor(), ale.getThirdcolor()), String.valueOf(ale.getData()));

                    }
                    screen.append(Color.WHITE, "   Fitness : " + String.valueOf(sons.getFitnesscost()));
                    screen.append(Color.WHITE, "   State : " + String.valueOf(sons.getStatus()));
                    screen.append(Color.white, "\n");
                    

                }
                a.mutation(a.getSons(), a.getMutationrate());
                pupulation = a.getSons();
                iterations++;
                if (iterations == 50) {
                    JOptionPane.showMessageDialog(null, "Try again");
                    break;

                }

            }
        }
    }

    public void utility() {

        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtA.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtA.getText())) {
            pupulation.add(0, ac);

        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtB.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtB.getText())) {

            pupulation.add(1, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtC.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtC.getText())) {

            pupulation.add(2, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtD.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtD.getText())) {

            pupulation.add(3, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtE.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtE.getText())) {

            pupulation.add(4, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtF.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtF.getText())) {

            pupulation.add(5, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtG.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtG.getText())) {

            pupulation.add(6, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtH.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtH.getText())) {

            pupulation.add(7, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtI.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtI.getText())) {

            pupulation.add(8, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

        while (ac.getFitnesscost() != Integer.valueOf(txtJ.getText())) {

            ab = new GeneticAlgorithm();
            ac = new Chromosome();
            ac = ab.generateinitialpopulation(5, w);

        }
        if (ac.getFitnesscost() == Integer.valueOf(txtJ.getText())) {

            pupulation.add(9, ac);
        }

        ab = new GeneticAlgorithm();
        ac = new Chromosome();
        ac = ab.generateinitialpopulation(5, w);

    }
}
