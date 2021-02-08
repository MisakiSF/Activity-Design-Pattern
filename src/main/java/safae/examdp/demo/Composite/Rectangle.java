package safae.examdp.demo.Composite;

public class Rectangle extends Figure{
    private Point p;
    private double L;
    private double H;

    @Override
    public double calculePerimetre() {
        return 2* (L+H);
    }

    @Override
    public double calculeSurface() {
        return L*H;
    }

    public Rectangle(Point p, double l, double h) {
        this.p = p;
        L = l;
        H = h;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "p=" + p +
                ", L=" + L +
                ", H=" + H +
                '}';
    }
}
