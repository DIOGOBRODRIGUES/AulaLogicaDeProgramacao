import java.util.Scanner;


public class aula23ex {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner lerDouble = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.print("é maior de idade? ");
        System.out.println(idade>18);

        System.out.println("informe o seu salário:");
        double salario = lerDouble.nextDouble();
        System.out.print("Recebe mais que o salário minimo? ");
        System.out.println(salario > 1100);
     

        System.out.println("Informe a sua altura: ");
        double altura = lerDouble.nextDouble();
        System.out.print("é mais alto que 1.8m? ");
        System.out.println(altura > 1.8);
        
        System.out.println("informe o seu peso: ");
        double peso = lerDouble.nextDouble();
        System.out.print("Seu peso é menor que 60Kg? ");
        System.out.println(peso < 60);
    
        System.out.println("Digite o seu nome: ");
        String nome = lerString.nextLine();
        System.out.print("O nome digitado é igual a Diogo? ");
        System.out.println(nome.equals("Diogo"));
        
        

        }
}
