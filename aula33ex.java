public class aula33ex {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        do{
            do{
                if( i== 1 || i == 8){
                    System.out.print("T C B r R B C T");
                    break;
                }
                else if (i == 2 || i ==7){
                    System.out.print("p p p p p p p p");
                    break;
                }
                else{
                    if(( i + j )%2 == 0){
                        System.out.print("p ");
                        j++;
                    }else{
                        System.out.print("b ");
                        j++;
                    }
                }
            }while (j <= 8);
                System.out.println();
                j =1;
                i++;
            }while(i <= 8);
        }
    }
    

