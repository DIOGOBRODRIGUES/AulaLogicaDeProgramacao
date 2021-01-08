import java.util.Random;
import java.util.Scanner;

public class aula31ex{
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner ler = new Scanner(System.in);
        int aleatorio = 1+ale.nextInt(1000);
        System.out.println(aleatorio);

        for(int i = 1; i <= 20; i++){
            System.out.println("Tentativa de número "+i);
            System.out.println("tente um número: ");
            int num = ler.nextInt();

            if(num < aleatorio){
                System.out.println("número menor que o sorteado!");
            }else if(num >aleatorio){
                System.out.println("número maior que o número sorteado!");
            }else if(num == aleatorio){
                System.out.println("Parabéns, você ganhou o jogo!");
                break;
            }if(i == 20){
                System.out.println("Fim de tentativas, você perdeu");
            }
        }
    }
}