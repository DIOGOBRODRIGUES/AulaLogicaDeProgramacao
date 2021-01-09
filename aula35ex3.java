import java.util.Random;
import java.util.Scanner;

public class aula35ex3 {
    public static void main(String[] args) {
        int tamanhoMa;
        Scanner ler = new Scanner (System.in);
        Random ale = new Random();
        System.out.println("Digite o tamanho da matriz: ");
        tamanhoMa = ler.nextInt();
        for(int i = 0; i < tamanhoMa ; i++){
            for(int j = 0; j < tamanhoMa; j++){
                System.out.print(1+ale.nextInt(10)+" ");
            }
            System.out.println("");
        }
    }
}
