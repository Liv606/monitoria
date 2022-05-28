package animais;

public class Animais {

    public static void main(String[] args) {
        //Animal fabricio = new Animal(15, 0, 3);
        //Cachorro caio = new Cachorro(10.0, 5, 15.0);
        Animal fafa = new Cachorro(10.0, 5, 15);
        Animal caio = new Gato(10.0, 5, 15);
        //fabricio.fazSom();
        //System.out.println(((Cachorro) fafa).tamanhoRabo);
        Animal[] array = new Animal[2];
        array[0] = fafa;
        array[1] = caio;
//        caio.fazSom();
//        fafa.fazSom();

        for (Animal a : array) {
            a.fazSom();
        }

//        for (int i = 0; i < array.length; i++) {
//            array[i].fazSom();
//        }
    }

}
