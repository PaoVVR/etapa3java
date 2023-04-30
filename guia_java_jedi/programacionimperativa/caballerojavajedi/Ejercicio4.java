package programacionimperativa.caballerojavajedi;

import java.util.Scanner;

public class Ejercicio4 {

//Ejercicio 4 Conversión de libras esterlinas a dólares: 

    public static void main(String[] args) {

    //Escribir un programa en Java que solicite al usuario una cantidad en libras esterlinas
    //y muestre el equivalente en dólares, utilizando una tasa de cambio fija.

    double convertir = 1.26;

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de libras esterlinas a convertir:");

    double libras = sc.nextDouble();

    sc.close();
    
    double dolares = libras * convertir;
    
    
    System.out.println("£ " + libras + " libras son equivalentes a $" + dolares + " dolares");

    }
}
