import java.util.Random;
import java.util.Scanner;

public class aula35ex3 {
    public static void main(String[] args) {
        int tamanhoMa;
        int num;
        double soma = 0;
        double media;
        Scanner ler = new Scanner (System.in);
        Random ale = new Random();
        System.out.println("Digite o tamanho da matriz: ");
        tamanhoMa = ler.nextInt();
        for(int i = 0; i < tamanhoMa ; i++){
            for(int j = 0; j < tamanhoMa; j++){
                num = 1+ale.nextInt(10);
                System.out.print(num+" ");
                soma = soma + num;
            }
            System.out.println("");
        }
        media = soma / (tamanhoMa*tamanhoMa);
        System.out.println("Soma dos números da matriz: "+soma);
        System.out.println("Media dos número da matriz: " + media);
    }
}
