package animais;

public class Gato extends Animal {

    public double tamanhoBigode;

    public Gato(double tamanho, int idade, double tamanhoBigode) {
        super(tamanho, idade);
        this.tamanhoBigode = tamanhoBigode;
    }

    @Override
    public void fazSom() {
        System.out.println("Miau Miau");
    }

}
