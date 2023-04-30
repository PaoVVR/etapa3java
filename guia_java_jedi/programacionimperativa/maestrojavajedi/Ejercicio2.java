package programacionimperativa.maestrojavajedi;

import java.util.Scanner;

public class Ejercicio2 {

//Ejercicio 2 Conversión de grados Celsius a grados Fahrenheit :    

   
    public static void main(String[] args) {
    //Escribir un programa en Java que convierta una temperatura en grados Celsius a grados Fahrenheit. 
    //Buscar la fórmula con la que se resuelve. 


    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de grados celsius a convertir:");

    double celsius = sc.nextDouble();

    sc.close();
    
    double fahrenheit = ( celsius * 1.8) + 32;
    
    
    System.out.println(celsius + " Grados celsius son equivalentes a " + fahrenheit + " grados fahrenheit");
    

    
    }
}
