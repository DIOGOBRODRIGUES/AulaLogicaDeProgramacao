public class Aula29Ex {
    public static void main(String[] args) {
        for(int i = 1; i <= 100 ; i++){
            
            System.out.println(i);
            if(i%2==0){
                System.out.println("O número "+i+" é par");
                if(i%4==0){
                    System.out.println(" e múltiplo de 4");
                }
            }
            else{
                System.out.println("O número "+i+" é ímpar");
            }
                if(i%3==0){
                    System.out.println(" e múltiplo de 3 ");
                }else if(i%5==0){
                    System.out.print(" e múltiplo de 5 ");
                    System.out.println(", número múltiplos de 5 em ordem decrescente: ");
                    for(int j = i; j > 1; j--){
                        if(j%5 == 0){
                            System.out.print(j+" ");
                        }
                    }
                System.out.println(" ");
                }
        }
    }
}
