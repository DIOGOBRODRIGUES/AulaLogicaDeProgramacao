import java.util.Scanner;

public class aula34ex2 {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        double valorProduto;
        double totalCompra = 0 ;
        double menorCompra = 0 ;
        double maiorCompra =0 ;
        for (int i = 0; i < 10;  i++){
            System.out.println("Digite o valor do item de número "+ (i+1));
            valorProduto = ler.nextDouble();
            totalCompra = totalCompra + valorProduto;
            if(i==0){
                menorCompra = valorProduto;
                maiorCompra = valorProduto;
            }else{
                if(menorCompra > valorProduto){
                    menorCompra = valorProduto;
                }if(maiorCompra < valorProduto){
                    maiorCompra = valorProduto;
                }
            }
            }
            System.out.println("Valor média da Compra "+(totalCompra/10));
            System.out.println("Menor valor da compra "+ menorCompra);
            System.out.println("Maior valor da compra "+ maiorCompra);
            System.out.println("Diferença do maior e menor valor da compra "+(maiorCompra-menorCompra));
            System.out.println("Lucro da loja "+totalCompra*30/100);
        }
        
    }
    

