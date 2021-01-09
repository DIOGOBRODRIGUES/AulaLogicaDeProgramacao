public class aula35ex4 {
    public static void main(String[] args) {
       
        for (int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                if(x == 2 && y == 2){
                    System.out.print(3+" ");
                }
                else if(x == y || y + x == 4){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println("");
        }

    }
    
}
