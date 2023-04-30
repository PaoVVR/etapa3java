package programacionimperativa.maestrojavajedi;

import java.util.Scanner;

public class Ejercicio7 {

//Ejercicio 7 Cálculo de la fuerza centrípeta:  

    public static void main(String[] args) {
    
    //Escribir un programa en Java que calcule la fuerza centrípeta necesaria para mantener un objeto en una trayectoria circular,
    //dados su masa, la velocidad angular y el radio de la trayectoria.

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el valor de la masa, la velocidad angular y el radio de la trayectoria: ");
     
    int m = sc.nextInt();

    int velo = sc.nextInt();

    int r = sc.nextInt();

    sc.close(); 
    
    //Muestre el resultado por pantalla. 
    
    System.out.println("La fuerza centripeta necesaria para mantener un objeto en una trayectoria circular,  cuya masa es de " + m + " kilogramos, su velocidad angular es de " + velo + " segundos y su radio es de " + r + " es igual a " + (m * (velo * velo ) / r) + " newton" );
    }
}
