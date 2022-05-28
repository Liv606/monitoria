package poligono;

public class Quadrado extends Poligono {

    double tamLados;

    public Quadrado(double tamLados) {

        this.tamLados = tamLados;

    }

    public static Quadrado criaQuadrado(double tamLados) {
        Quadrado q = new Quadrado(tamLados);
        return q;
    }

    @Override
    public double calcularArea() {
        double a = tamLados * tamLados;
        return a;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularPerimetro() {
        double p = tamLados * 4;
        return p;
    }
}
