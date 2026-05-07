import java.util.ArrayList;

public class Main {
    /*
    Crie 2 Carro e 1 Moto.
    Armazene em ArrayList<Veiculo>.
    Percorra a lista chamando toString() de cada objeto
    */

    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        lista.add(new Carro("A","Audi",4));
        lista.add(new Moto("B","Yamaha",1250));
        lista.add(new Carro("C","Fit",45));

        for (Veiculo veiculo : lista){
            System.out.println(veiculo); //veiculo toString
        }
    }
}
