import java.util.Scanner;

public class aula22ex {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valora da compra: ");
        double valorCompra = leia.nextDouble();
        System.out.println("Digite o número de prestações: ");
        int numPrestacoes = leia.nextInt();
        System.out.println("Digite o valor do deconto(%): ");
        double desconto = leia.nextDouble();
        System.out.println("Digite o valore de juros (%): ");
        double juros = leia.nextDouble();

        double valorProdutoAvista = valorCompra*(1-desconto/100);
        double valorPrestacao = valorCompra*(juros/100+1)/numPrestacoes;
        double jurosCadaPrestacao = valorCompra*juros/100/numPrestacoes;

        System.out.println("O valor do produto Avista é = "+ valorProdutoAvista+" xvalor Prestação com Juros= "+
        valorPrestacao+"juros cada pretação "+jurosCadaPrestacao);
    }
}