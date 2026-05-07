package exemploHeranca;

public class Main {
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[4];

        //Super classe || Sub classe
        empregado[0] = new EmpregadoComissionado(1,"Selmini",35000,20);
        empregado[1] = new EmpregadoHorista(2,"Joao",160,550);

        empregado[2] = new EmpregadoComissionado(3,"Patricia",700000,23);
        empregado[3] = new EmpregadoHorista(4,"Maria",200,800);

        //for tradicional
        for (int i = 0; i < empregado.length; i++) {
            System.out.println(empregado[i].matricula);
            System.out.println(empregado[i].nome);

        }

        //for genérico
        System.out.println("#####################################");
        for(Empregado e : empregado) {
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }
    }
}
