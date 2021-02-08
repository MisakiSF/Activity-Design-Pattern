package safae.examdp.demo.Composite;

import org.springframework.stereotype.Component;
import safae.examdp.demo.Observer.IObserver;
import safae.examdp.demo.Observer.Parametre;

import java.io.Serializable;


public abstract class Figure implements IObserver {
    private int epaisseur;
    private String couleurPerimetre;
    private String couleurSurface;
    public void update(Parametre parametre){
        epaisseur = parametre.getEpaisseur();
        couleurPerimetre = parametre.getCouleurPerimetre();
        couleurSurface = parametre.getCouleurSurface();
    }

    public abstract double calculePerimetre();

    public abstract double calculeSurface();

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }

    public String getCouleurPerimetre() {
        return couleurPerimetre;
    }

    public void setCouleurPerimetre(String couleurPerimetre) {
        this.couleurPerimetre = couleurPerimetre;
    }

    public String getCouleurSurface() {
        return couleurSurface;
    }

    public void setCouleurSurface(String couleurSurface) {
        this.couleurSurface = couleurSurface;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "epaisseur=" + epaisseur +
                ", couleurPerimetre='" + couleurPerimetre + '\'' +
                ", couleurSurface='" + couleurSurface + '\'' +
                '}';
    }
}
