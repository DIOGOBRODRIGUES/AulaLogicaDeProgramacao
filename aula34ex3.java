import java.util.Scanner;

public class aula34ex3 {
    public static void main(String[] args) {
        int idade;
        double altura;
        double peso;
        int pesoMenor40=0;
        int altura1a2=0;
        Scanner ler = new Scanner(System.in);
        for (int i =0; i < 5; i++){
            System.out.println("Pessoa "+(i+1));
            System.out.println("Digite o sua idade: ");
            idade = ler.nextInt();
            System.out.println("Digite o seu peso: ");
            peso = ler.nextDouble();
            System.out.println("Digite a sua altura");
            altura = ler.nextDouble();

            if(peso < 40){
                pesoMenor40++;
            }
            if(altura >1 && altura < 2){
                altura1a2++;
            }
        }
        System.out.println(pesoMenor40 + " pessoas tem peso menor que 40kg");
        System.out.println(altura1a2+ " pessoas tem altura entre 1 a 2 m");
    }
    
}
