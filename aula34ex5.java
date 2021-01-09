import java.util.Scanner;

public class aula34ex5 {
    public static void main(String[] args) {
        double c=0; //capital investido
        double i=0; //taxa de rentabilidade 
        int t=0; //tempo em meses
        double m=0; //montante acumulado
        double juros =0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Valor a ser investido: ");
        c = ler.nextDouble();
        System.out.println("Taxa de rentabilidade: ");
        i = ler.nextDouble();
        System.out.println("Quantidade de meses: ");
        t = ler.nextInt();

        m = c * Math.pow((1+i/100), t);
        juros = m-c;

        System.out.println("Montante final "+ m);
        System.out.println("Juros = "+juros);
    }
}
