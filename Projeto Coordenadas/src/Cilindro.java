public class Cilindro {
    private Ponto ponto;
    private double altura;
    private double raio;


    public Cilindro(Ponto ponto, double altura, double raio) {
        this.ponto = ponto;
        this.altura = altura;
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Cilindro{" + "ponto=" + ponto + ", altura=" + altura + ", raio=" + raio + '}';
    }

    public double calcularArea(){
        double area;

        area = 2 * Math.PI * raio * (raio + altura);
        return area;
    }

    public double calcularVolume(){
        double volume;

        volume = Math.PI * Math.pow(raio,2) * altura;
        return volume;
    }
}
