package poligono;

public abstract class Poligono {

    double area;
    double perimetro;

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public static void main(String[] args) {
        Triangulo t = Triangulo.criaTriangulo(5, 4, 3);
        System.out.println("Lado 1: " + t.lado1);
        System.out.println("Lado 2: " + t.lado2);
        System.out.println("Lado 3: " + t.lado3);
        System.out.println("É triângulo? " + t.ehTriangulo());
        System.out.println("A área do triângulo é: " + t.calcularArea());
        System.out.println("O perímetro do triângulo é: " + t.calcularPerimetro());
        Quadrado q = Quadrado.criaQuadrado(5);
        System.out.println("A área do quadrado é: " + q.calcularArea());
        System.out.println("O perímetro do quadrado é: " + q.calcularPerimetro());
    }

}
