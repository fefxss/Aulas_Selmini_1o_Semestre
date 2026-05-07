public class Main {
    public static void main(String[] args) {
        Ponto ponto = new Ponto(0,0);
        Circulo circulo = new Circulo(ponto,5);
        Cilindro cilindro = new Cilindro(ponto, 10,5);

        System.out.println(circulo.calcularArea());
        System.out.println(cilindro.calcularArea());
        System.out.println(cilindro.calcularVolume());
    }
}
