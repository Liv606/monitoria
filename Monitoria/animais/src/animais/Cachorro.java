package animais;

public class Cachorro extends Animal {

    double tamanhoRabo;

    public Cachorro(double tamanho, int idade, double tamanhoRabo) {
        super(tamanho, idade);
        this.tamanhoRabo = tamanhoRabo;
    }

    @Override
    public void fazSom() {
        System.out.println("AuAu!");
    }

}
