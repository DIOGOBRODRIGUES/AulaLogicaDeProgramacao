import java.util.Scanner;

public class aula35ex2 {
    public static void main(String[] args) {
        int lado1;
        int lado2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do lado 1: ");
        lado1 = ler.nextInt();
        System.out.println("Digite o valor do lado 2: ");
        lado2 = ler.nextInt();
        for(int i = 0; i < lado1; i++){
            for(int j = 0; j < lado2; j++){
                if(i==0 || i==lado1-1 || j==0 || j==lado2-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
