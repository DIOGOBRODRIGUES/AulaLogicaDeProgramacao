import java.util.Random;
import java.util.Scanner;

public class aula35ex5 {
    public static void main(String[] args) {
        int tamanhoMa;
        int sinal = 1;
        int num;
        int dprincipal1 = 1;
        int dprincipal2 = 1;
        int dprincipal3 = 1;
        int dsecundaria1 = 1;
        int dsecundaria2 = 1;
        int dsecundaria3 = 1;
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        System.out.println("Digite o tamanho da matriz 2-(2x2) ou 3-(3x3): ");
        tamanhoMa = ler.nextInt();
        for (int i = 0; i < tamanhoMa; i++){
            for(int j = 0; j <tamanhoMa; j++){
                sinal = ale.nextInt(2);
                if(sinal==1){
                    sinal =1;
                }else{
                    sinal = -1;
                }
                num = ale.nextInt(10)*sinal;
                System.out.print(num+" ");
                if(i == j){
                    dprincipal1 = dprincipal1*num;
                }if(tamanhoMa == 2){
                        dprincipal2 =0;
                        dprincipal3 = 0;
                    }else{
                        if(i == 0 && j == 1 || i == 1 && j ==2 ||i ==2 && j ==0){
                            dprincipal2 = dprincipal2*num;
                        }if(i == 0 && j == 2 || i == 1 && j ==0 ||i ==2 && j ==1){
                            dprincipal3 = dprincipal3*num;
                        }
                    }
                if(i+j == tamanhoMa-1){
                    dsecundaria1 = dsecundaria1 *num;
                }
                if(tamanhoMa == 2){
                    dsecundaria2 =0;
                    dsecundaria3 =0;
                }else{
                    if(i == 0 && j == 0 || i == 1 && j ==2 ||i ==2 && j ==1){
                        dsecundaria2 = dsecundaria2*num;
                    }if(i == 0 && j == 1 || i == 1 && j ==0 ||i ==2 && j ==2){
                        dsecundaria3 = dsecundaria3*num;
                    }
                }
            }
            System.out.println(" ");
        }
            System.out.println("O valor da determinante da matriz acima é: "+(dprincipal1+dprincipal2+dprincipal3-
        dsecundaria1-dsecundaria2-dsecundaria3));
    }
}
