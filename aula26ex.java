import java.util.Scanner;

public class aula26ex {
    public static void main(String[] args) {
        Scanner leiaString = new Scanner(System.in);
        Scanner leiaNum = new Scanner(System.in);
        String nome;
        int idade;
        double peso;
        String jogo;
        int igual = 0;

        System.out.println("Nome: ");
        nome = leiaString.nextLine();
        System.out.println("Idade: ");
        idade = leiaNum.nextInt();
        System.out.println("Peso: ");
        peso = leiaNum.nextDouble();
        System.out.println("Jogo: ");
        jogo = leiaString.nextLine();

        if(nome.equals("Daniel")){
            System.out.println("Pessoa com nome igual!");
            igual++;
        }else{
            System.out.println("Pessoa com nome diferente");
        }

        if(idade==40){
            System.out.println("Pessoa com a mesma idade!");
            igual++;
        }else{
            System.out.println("Pessoa com idade diferente");
        }
        
        if(peso==80){
            System.out.println("Pessoa com o mesmo peso!");
            igual++;
        }else{
            System.out.println("Pessoa com peso diferente");
        }


        if(jogo.equals("sonic")){
            System.out.println("Pessoa gosta do mesmo jogo!");
            igual++;
        }else{
            System.out.println("Pessoa não gosta do mesmo jogo");
        }

        if(igual>=3){
            System.out.println("Esta pessoa é bem parecida comigo");
        }else{
            System.out.println("Esta pessoa não é parecida comigo.");
        }


    }
}
