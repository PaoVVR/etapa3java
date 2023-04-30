package programacionimperativa.maestrojavajedi;

import java.util.Scanner;

public class Ejercicio6 {

//ejercicio 6 Cálculo de la velocidad final:   

    public static void main(String[] args) {
        
    //Escribir un programa en Java que calcule la velocidad final de un objeto en caída libre, 
    //dados su velocidad inicial, la aceleración de la gravedad y el tiempo transcurrido. 

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el valor de la velocidad inicial y el tiempo transcurrido: ");
     
    double g = 9.8;

    int v_i = sc.nextInt();

    int t = sc.nextInt();
     

    sc.close(); 

    //Utilizar la fórmula: v_f = v_i + g * t, 
    //donde v_f es la velocidad final, v_i es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo transcurrido. 
    //Muestre el resultado por pantalla

    System.out.println("La velocidad final de un objeto en caída libre, cuya velocidad inicial es de " + v_i  + " metros por segundo y el tiempo transcurrido en dicha caida es de " + t + " segundos es igual a " + (v_i + g )* t );
    
    
    }
}
