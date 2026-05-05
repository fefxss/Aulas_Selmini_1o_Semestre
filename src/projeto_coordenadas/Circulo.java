package projeto_coordenadas;

public class Circulo {
    Ponto ponto;
    private double raio;

    public Circulo(Ponto ponto, double raio) {
        this.ponto = ponto;
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        double area;
        area = Math.PI * Math.pow(raio,2);
        return area;
    }

}
