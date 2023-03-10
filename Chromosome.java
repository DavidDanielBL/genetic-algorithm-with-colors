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
public class Chromosome {

    private Vector<Allele> v;
    private int fitnesscost;
    private String status="Survivor";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public Chromosome(Vector<Allele> vector) {
      //     vector = new Vector();
           this.v=vector;

    }

    public Chromosome() {
    }


    public int getFitnesscost() {

      fitnesscost=fitness_cost_of_chromosome(v);
        return fitnesscost;
    }

    public void setFitnesscost(int fitnesscost) {
        this.fitnesscost = fitnesscost;
    }

    public Vector<Allele> getV() {
        return v;
    }

    public void setV(Vector<Allele> v) {
        this.v = v;
    }

   public int fitness_cost_of_chromosome(Vector<Allele> v) {

        int numero = 0;
        numero=v.get(0).getData()+v.get(1).getData()+v.get(2).getData()+
                 v.get(3).getData()+v.get(4).getData();
        return numero;


    }
        


}
