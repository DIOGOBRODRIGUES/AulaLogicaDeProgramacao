import java.util.Scanner;

public class aula26ex {
    public static void main(String[] args) {
        Scanner leiaString = new Scanner(System.in);
        Scanner leiaNum = new Scanner(System.in);
        String nome;
        int idade;
        double peso;
        String jogo;

        System.out.println("Nome: ");
        nome = leiaString.nextLine();
        System.out.println("Idade: ");
        idade = leiaNum.nextInt();
        System.out.println("Peso: ");
        peso = leiaNum.nextDouble();
        System.out.println("Jogo: ");
        jogo = leiaString.nextLine();

        if(nome.equals("Diogo")){
            System.out.println("Pessoa com nome igual!");
        }else{
            System.out.println("Pessoa com nome diferente");
        }
        


    }
}
