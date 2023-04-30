package programacionimperativa.guiajavajedi1.maestrojavajedi;

import java.util.Scanner;

public class Ejercicio3 {

//Ejercicio 3 Cálculo de la hipotenusa de un triángulo:

    public static void main(String[] args) {
    
    //Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
    //dados los valores de los catetos.

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el valor de los catetos: ");

    int cateto1= sc.nextInt();

    int cateto2= sc.nextInt();

    sc.close();

    int hipotenusa= (cateto1 * cateto1) + ( cateto2 * cateto2);

    System.out.println("La hipotenusa del triangulo es igual a " + hipotenusa);
    
    }
}
