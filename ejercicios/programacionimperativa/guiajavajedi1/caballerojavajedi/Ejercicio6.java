package programacionimperativa.guiajavajedi1.caballerojavajedi;

import java.util.Scanner;

public class Ejercicio6 {

//Ejercicio 6 Conversión de bitcoins a dólares:  

    public static void main(String[] args) {

    //Escribir un programa en Java que solicite al usuario una cantidad en bitcoins 
    //y muestre el equivalente en dólares, utilizando una tasa de cambio fija. 

    double convertir = 29382.40;

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de bitcoins a convertir:");

    double bitcoins = sc.nextDouble();

    sc.close();
    
    double dolares = bitcoins * convertir;
    
    
    System.out.println("Bitcoin" + bitcoins + " bitcoins son equivalentes a $" + dolares + " dolares");
    
    
    }
}
