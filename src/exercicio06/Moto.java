package exercicio06;

public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String placa, String marca, int cilindradas) {
        super(placa, marca);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
