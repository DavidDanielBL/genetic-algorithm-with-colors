/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetic_algorithm_colors;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author David Daniel Beltrán López
 */
public class GeneticAlgorithm {

    public String[][] m;
    public List<Chromosome> orderedpopulation,sons;
    public Vector arrayofVectors[];
 
    public int crossline,combinatorialofsons,numberofcrossedsons,numberofmutatedsons,
            parents,row=0;
    public double crossoverrate,mutationrate;
    public Chromosome bestfitness;
  
    Vector temporalA,temporalB,temporalC,temporalD,genA,genB;
    List<Vector> genesA,genesB;
    
    
    public Genetic_algorithm_colors.Chromosome getBestfitness() {
        return bestfitness;
    }

    public void setBestfitness(Genetic_algorithm_colors.Chromosome bestfitness) {
        this.bestfitness = bestfitness;
    }


    public int getNumberofmutatedsons() {
        return numberofmutatedsons;
    }

    public void setNumberofmutatedsons(int numberofmutatedsons) {
        this.numberofmutatedsons = numberofmutatedsons;
    }

    public double getMutationrate() {
        return mutationrate;
    }

    public void setMutationrate(double mutationrate) {
        this.mutationrate = mutationrate;
    }

    public double getCrossoverrate() {
        return crossoverrate;
    }

    public void setCrossoverrate(double crossoverrate) {
        this.crossoverrate = crossoverrate;
    }

    public int getNumberofcrossedsons() {
        return numberofcrossedsons;
    }

    public void setNumberofcrossedsons(int numberofcrossedsons) {
        this.numberofcrossedsons = numberofcrossedsons;
    }

    public int getParents() {
        return parents;
    }

    public void setParents(int parents) {
        this.parents = parents;
    }

    public int getCombinatorialofsons() {
        return combinatorialofsons;
    }

    public void setCombinatorialofsons(int combinatorialofsons) {
        this.combinatorialofsons = combinatorialofsons;
    }

    public List<Chromosome> getSons() {
        return sons;
    }

    public void setSons(List<Chromosome> sons) {
        this.sons = sons;
    }

    public List<Chromosome> getOrderedpopulation() {
        return orderedpopulation;
    }

    public void setOrderedpopulation(List<Chromosome> orderedpopulation) {
        this.orderedpopulation = orderedpopulation;
    }

    public int getCrossline() {
        return crossline;
    }

    public void setCrossline(int crossline) {
        this.crossline = crossline;
    }

    public GeneticAlgorithm() {
        m = new String[1000][1000];
        arrayofVectors = new Vector[1000];
        genesA = new Vector();
        genesB = new Vector();
        temporalB = new Vector();
        temporalC = new Vector();
        temporalD = new Vector();
        genA = new Vector();
        genB = new Vector();
        //  Hijos = new Vector();
        sons = new ArrayList<Chromosome>();
    }


    public void initialpopulation(int n, Vector v) {
        v.clear();
        for (int i = 0; i < n; i++) {
            v.insertElementAt(0, i);
        }
        

        if (n <= 100) {
         
        }
    }

    public Chromosome generateinitialpopulation(int n, Vector<Allele> v) {
       
        int value;
        Chromosome chromosome = new Chromosome(v);

        Vector<Allele> ve = new Vector();
        double m = 7 * (1.0);
        Allele allele;

        for (int i = 0; i < n; i++) {
            value = (int) (Math.random() * m+1);
            allele = new Allele();
            Vector colors = new Vector();
            colors.add(Colors.colors[row][0]);
            colors.add(Colors.colors[row][1]);
            colors.add(Colors.colors[row][2]);
            allele.setColor(colors);
            allele.setData(value);
            ve.insertElementAt(allele, i);

        }
        row++;
        chromosome.setV(ve);
        
        


        


        return chromosome;
    }

    public boolean repeated(Vector<Allele> vector, int value) {
        for (Allele a : vector) {
            if (a.getData() == value) {
                return false;
            }
        }
        return true;
    }



    public List<Chromosome> generateoffspring(double crossoverrate, double mutationrate, List<Chromosome> population,int parents) {
        parents = getParents();
        setCrossoverrate(crossoverrate);
        double crossoverrateA = (crossoverrate * getParents());
        double crossoverrateB = Math.rint(crossoverrateA);
        int crossoversons = (int) crossoverrateB;
        setNumberofcrossedsons(crossoversons);
   
        order(population, new Comparator() {

            public int compare(Object chromosomeA, Object chromosomeB) {
                Chromosome chromosomeC = (Chromosome) chromosomeA;
                Chromosome chromosomeD = (Chromosome) chromosomeB;
                if (chromosomeC.getFitnesscost() > chromosomeD.getFitnesscost()) {
                    return -1;
                } else if (chromosomeC.getFitnesscost() < chromosomeD.getFitnesscost()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        
        orderedpopulation = population;
        
        setBestfitness(population.get(parents));

        crossover(population, parents);
         getSons().add(getBestfitness());
       
        
        mutation(sons, mutationrate);
      
      
        return sons;

    }

    private static void order(List<Chromosome> list, Comparator comparator) {
        Collections.sort(list, new Comparator() {

            public int compare(Object chromosomeA, Object chromosomeB) {
                Chromosome chromosomeC = (Chromosome) chromosomeA;
                Chromosome chromosomeD = (Chromosome) chromosomeB;
                if (chromosomeC.getFitnesscost() < chromosomeD.getFitnesscost()) {
                    return -1;
                } else if (chromosomeC.getFitnesscost() > chromosomeD.getFitnesscost()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public Vector genesA(Chromosome chromosome, int crossline) {
        temporalA = new Vector();
        int limit = crossline;
        for (int i = limit; i < chromosome.getV().size(); i++) {
            temporalA.add(chromosome.getV().elementAt(i));
        }
        return temporalA;
    }

    public Vector genesB(Chromosome chromosome, int crossline) {
        temporalA = new Vector();
        int limit = crossline;
        for (int i = 0; i < limit; i++) {
            temporalA.add(chromosome.getV().elementAt(i));
        }
        return temporalA;
    }

    public void crossover(List<Chromosome> population, int parents) {
        int crossoversonscounter = 0;
        crossline = (int) (Math.random() * (population.get(0).getV().size() - 1) + 1);

     
        for (int j = 0; j < population.size(); j++) {
            genA = genesA(population.get(j), crossline);
            genesA.add(genA);
        }
        for (int j = 0; j < population.size(); j++) {
            genB = genesB(population.get(j), crossline);
            genesB.add(genB);
        }
        int i = 0;
        while (crossoversonscounter < parents) {
            if (crossoversonscounter < getNumberofcrossedsons()) {
                temporalB.addAll(genesB.get(i));
                temporalB.addAll(genesA.get(i + 1));
                Chromosome son = new Chromosome(temporalB);
                son.setStatus("Crossed son");
                sons.add(son);
                crossoversonscounter++;
            }
            if (crossoversonscounter < getNumberofcrossedsons()) {
                temporalC.addAll(genesB.get(i + 1));
                temporalC.addAll(genesA.get(i));
                Chromosome son = new Chromosome(temporalC);
                son.setStatus("Crossover son");
                crossoversonscounter++;
                sons.add(son);
            }
            if (crossoversonscounter >= getNumberofcrossedsons() && getCrossoverrate() != 1) {
                temporalD.addAll(population.get(crossoversonscounter).getV());
                Chromosome son = new Chromosome(temporalD);
                son.setStatus("Son,copy of parents");
                sons.add(son);
                crossoversonscounter++;
            }
            temporalB = new Vector();
            temporalC = new Vector();
            temporalD = new Vector();
            i += 2;


        }
    }

    public void mutation(List<Chromosome> crossoversons, double mutationrate) {
        setMutationrate(mutationrate);
        double tasamutacion = mutationrate * getNumberofcrossedsons();
        double tasamut = Math.rint(tasamutacion);
        int hijosmutados = (int) tasamut;
        setNumberofmutatedsons(hijosmutados);
        for (int i = 0; i < hijosmutados; i++) {
            permutation(crossoversons.get(i).getV());
            crossoversons.get(i).setStatus("Crossover and mutated sons");

        }
    }

    public void permutation(Vector v) {
        int alleleA;
        int alleleB;

        int limit = v.size();
        do {
            alleleA = (int) ((Math.random() * limit - 1) + 1);
            alleleB = (int) ((Math.random() * limit - 1) + 1);
        } while (alleleA == alleleB);
        Object alleletemporalA = v.elementAt(alleleA);
        Object alleletemporalB = v.elementAt(alleleB);
        v.setElementAt(alleletemporalA, alleleB);
        v.setElementAt(alleletemporalB, alleleA);

    }

}
