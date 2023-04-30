package programacionimperativa.caballerojavajedi;

import java.util.Scanner;

public class Ejercicio3 {

    //Ejercicio 3 Conversión de euros a dólares:

    public static void main(String[] args) {
    //Escribir un programa en Java que solicite al usuario una cantidad en euros y muestre el equivalente en dólares
    //utilizando una tasa de cambio fija.

    double convertir = 245.36;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros a convertir: ");

        double euros = sc.nextDouble();

        sc.close();
        
        double pesos = euros * convertir;
    
    System.out.println("€" + euros + " euros son equivalentes a $" + pesos + " pesos");
}
}
