package animais;

public abstract class Animal {

    double tamanho;
    int idade;

    public Animal(double tamanho, int idade) {
        this.tamanho = tamanho;
        this.idade = idade;
    }

    public void fazSom() {
        System.out.println("aaaaaaa");
    }
}
