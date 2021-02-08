package safae.examdp.demo.Composite;

public class Cercle extends Figure {
    private Point centre;
    private double R;


    @Override
    public double calculePerimetre() {
        return 2*(double) Math.PI*R;
    }

    @Override
    public double calculeSurface() {
        return R*R*(double) Math.PI;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public Cercle(Point centre, double r) {
        this.centre = centre;
        R = r;
    }
    @Override
    public String toString() {
        return "Cercle{" +
                "centre=" + centre +
                ", R=" + R +
                '}';
    }
}
