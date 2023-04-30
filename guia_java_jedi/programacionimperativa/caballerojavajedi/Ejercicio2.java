package programacionimperativa.caballerojavajedi;

import java.util.Scanner;

public class Ejercicio2 {

//Ejercicio 2 Conversión de dólares a pesos:
    
    public static void main(String[] args) {

     //Escribir un programa en Java que solicite al usuario una cantidad en dólares   

        int convertir = 462;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dólares a convertir: ");

        int dolares = sc.nextInt();

        sc.close();
        
        int pesos = dolares * convertir;

        //y muestre el equivalente en pesos, utilizando una tasa de cambio fija.
        
        System.out.println("$" + dolares + " dólares son equivalentes a $" + pesos + " pesos");
    }

    }



