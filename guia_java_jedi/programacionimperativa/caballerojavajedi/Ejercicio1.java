package programacionimperativa.caballerojavajedi;

public class Ejercicio1 {

//Ejercicio 1 Obtener porcentaje:

    public static void main(String[] args) {

    //Dados dos números, uno real y el otro entero. 

    int numEntero = 8;

    double numReal = 0.5;


    //Obtenga el porcentaje que indique el segundo número del primer número.  

    double porcentaje = (numReal * 100.0) / numEntero;
        
        System.out.println("El porcentaje del segundo número que es " + numReal + " del primer número que es " + numEntero + " es igual a " + porcentaje+ " %");
    }
}
