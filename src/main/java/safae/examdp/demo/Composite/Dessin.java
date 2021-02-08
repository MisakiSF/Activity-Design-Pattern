package safae.examdp.demo.Composite;

import safae.examdp.demo.Strategy.Traitement;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private List<Figure> figures = new ArrayList<>();

    private Traitement traitement;

    public Dessin(Traitement traitement) {
        this.traitement = traitement;
    }
    public void traiter(){
        traitement.traiter();
    }
    public void add(Figure figure){
        figures.add(figure);
    }

    public void remove(Figure figure){
        figures.remove(figure);
    }

    public void display(){
        figures.forEach(System.out::println);
    }

    public void serialiser(){

    }
    public Traitement getTraitement() {
        return traitement;
    }

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

}
