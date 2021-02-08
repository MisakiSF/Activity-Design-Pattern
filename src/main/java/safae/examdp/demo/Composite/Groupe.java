package safae.examdp.demo.Composite;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure{

    private List<Figure> figures = new ArrayList<>();

    @Override
    public double calculePerimetre() {
        double p = 0;
        for (Figure f : figures) {
            p += f.calculePerimetre();
        }
        return p;
    }

    @Override
    public double calculeSurface() {
        double s = 0;
        for (Figure f : figures) {
            s += f.calculeSurface();
        }
        return s;
    }

    public Groupe(List<Figure> figures) {
        this.figures = figures;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Groupe{" +
                "figures=" + figures +
                '}';
    }
}
