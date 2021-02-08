package safae.examdp.demo.Observer;

import java.util.ArrayList;
import java.util.List;

public class Parametre {

    private int epaisseur;
    private String couleurPerimetre;
    private String couleurSurface;

    private List<IObserver> figures = new ArrayList<>();
    public Parametre() {
        epaisseur = 1;
        couleurPerimetre = "Purple";
        couleurSurface = "Pink";
    }

    public Parametre(int epaisseur, String couleurPerimetre, String couleurSurface) {
        this.epaisseur = epaisseur;
        this.couleurPerimetre = couleurPerimetre;
        this.couleurSurface = couleurSurface;
    }

    public void notifierAll(){
        for(IObserver f : figures){
            f.update(this) ;
        }

    }
    public void subscribe(IObserver figure){
        figures.add(figure);
        figure.update(this);
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
        notifierAll();
    }

    public String getCouleurPerimetre() {
        return couleurPerimetre;
    }

    public void setCouleurPerimetre(String couleurPerimetre) {
        this.couleurPerimetre = couleurPerimetre;
        notifierAll();
    }

    public String getCouleurSurface() {
        return couleurSurface;
    }

    public void setCouleurSurface(String couleurSurface) {
        this.couleurSurface = couleurSurface;
        notifierAll();
    }



}

