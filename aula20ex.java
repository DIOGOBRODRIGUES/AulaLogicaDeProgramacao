/*
Escreva um código que leia do teclado o valor do RAIO de um círculo e calcule:
Diâmetro
Perímetro
Área

Leia também o valor da Aresta de um cubo e calcule:
Área da Superfície
Volume
Diagonal 
*/

import java.util.Scanner;

public class aula20ex {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        final double pi = 3.14;
        double raio;
        System.out.println("Digite o valor do raio ");
        raio = leia.nextDouble();

        double diâmetro = 2*raio;
        double perímetro = 2*pi*raio;
        double área = pi*Math.pow(raio, 2); 

        System.out.println("O círculo de raio "+ raio+" tem diâmetro igual à "+diâmetro+", perímetro igual à "+
        perímetro+" e área de "+área);
        
        final double raizde3 = 1.73;
        double aresta;
        System.out.println("Digite o valor de aresta do cubo ");
        aresta = leia.nextDouble();

        double areaSuperfície = 6 * Math.pow(aresta, 2);
        double volume = Math.pow(aresta, 3);
        double diagonalPrincipal = aresta*raizde3;

        System.out.println("O cubo de aresta "+aresta+", tem área da superficíe igual à "+areaSuperfície+
        ", volume igual "+volume+" e digonal principal "+diagonalPrincipal);
    }
}
