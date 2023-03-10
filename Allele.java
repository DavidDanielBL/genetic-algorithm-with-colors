/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetic_algorithm_colors;

import java.util.Vector;

/**
 *
 * @author David Daniel Beltrán López
 */
public class Allele {

    //We put the color, the dat, the first color, the second color and the third color
    //of the allele, that is a part of the chromosome
    public Vector color;
    public Integer data;
    public Integer firstcolor;
    public Integer secondcolor;
    public Integer thirdcolor;

    public Integer getFirstcolor() {
        return firstcolor;
    }

    public void setFirstcolor(Integer firstcolor) {
        this.firstcolor = firstcolor;
    }

    public Integer getSecondcolor() {
        return secondcolor;
    }

    public void setSecondcolor(Integer secondcolor) {
        this.secondcolor = secondcolor;
    }

    public Integer getThirdcolor() {
        return thirdcolor;
    }

    public void setThirdcolor(Integer thirdcolor) {
        this.thirdcolor = thirdcolor;
    }

    public Vector getColor() {
        return color;
    }

    public void setColor(Vector color) {
        this.color = color;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Allele() {
    }

    void setColor(int cl1, int cl2, int cl3) {

        this.firstcolor = cl1;
        this.secondcolor = cl2;
        this.thirdcolor = cl3;

    }

}
