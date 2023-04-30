package programacionimperativa.caballerojavajedi;

import java.util.Scanner;

public class Ejercicio5 {

//Ejercicio 5 Conversión de pesos a euros:  

    public static void main(String[] args) {


    //Escribir un programa en Java que solicite al usuario una cantidad en pesos 
    //y muestre el equivalente en euros, utilizando una tasa de cambio fija.
    
    double convertir = 0.0041;

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de pesos a convertir:");

    double pesos = sc.nextDouble();

    sc.close();
    
    double euros = pesos * convertir;
    
    
    System.out.println("$" + pesos + " pesos son equivalentes a $" + euros + " euros");

    }
}
