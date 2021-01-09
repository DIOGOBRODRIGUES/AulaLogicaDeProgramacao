import java.util.Scanner;

public class aula34ex4 {
    public static void main(String[] args) {
        double valorProduto;
        double valorPrestacao;
        double parcela;
        int i = 1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valorProduto = ler.nextDouble();
        System.out.println("Digite o número de parcelas");
        parcela = ler.nextDouble();
        
        while ( i <= parcela){
            valorPrestacao = (valorProduto+valorProduto*(parcela/100))/parcela;
            
            System.out.println("parcela "+i+" = "+valorPrestacao);
            i++;
        }
        System.out.println("Valor de juros cobrado em cada prestação: "+valorProduto*(parcela/100)/parcela);
    }
}
