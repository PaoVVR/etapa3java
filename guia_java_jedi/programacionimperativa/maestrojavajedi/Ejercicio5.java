package programacionimperativa.maestrojavajedi;

import java.util.Scanner;

public class Ejercicio5 {

//Ejercicio 5 Cálculo de la energía cinética:  

    public static void main(String[] args) {
    //Escribir un programa en Java que calcule la energía cinética de un objeto en movimiento, dados su masa y su velocidad.
    //Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa del objeto y v es la velocidad.   
    //Muestre el resultado por pantalla

   Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el valor de la masa y velocidad: ");

    int masa= sc.nextInt();

    int velo= sc.nextInt();
     

    sc.close();

    //la energía cinética es proporcional a la mitad de la masa del cuerpo, multiplicada por el cuadrado de la velocidad de movimiento.
    
    System.out.println("La energia cinética de un objeto en movimiento, dados su masa que es de " + masa + " kilogramos y su velocidad que es de " + velo  + " metros por segundo es igual a " + (masa/2 ) * (velo * velo) + " julios");
}
}
