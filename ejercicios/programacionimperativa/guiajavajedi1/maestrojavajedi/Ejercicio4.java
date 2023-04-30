package programacionimperativa.guiajavajedi1.maestrojavajedi;

import java.util.Scanner;

public class Ejercicio4 {

    // Ejercicio 4 Cálculo de la media aritmética:
    public static void main(String[] args) {

        // Escribir un programa en Java que calcule la media aritmética de un conjunto
        // de números.
        // Utilicen variables y constantes según corresponda.
        // Muestre el resultado por pantalla

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de los números: ");

        int num1= sc.nextInt();

        int num2= sc.nextInt();
        
        int num3= sc.nextInt();

        int cantidadDeNumeros = 3;

        sc.close();

        
        System.out.println("La media aritmética de este conjunto de números es igual a: " +((num1 + num2 + num3 )/ cantidadDeNumeros));

    }
}
