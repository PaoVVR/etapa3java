package programacionimperativa.iniciadojavajedipractica;

public class Ejercicio4 {
   //Ejercicio 4 Cálculo de divisibilidad: 
    public static void main(String[] args) {
        //Se le solicita que guarden dos números enteros y los sumen.
        int numUno = 9;

        int numDos = 3;

        int resultado = numUno + numDos;

        //determine si el primer número es divisible por el segundo número.

        String divisivilidad = (numUno % numDos == 0) ? "es divisible":"no es divisible"; 
        //muestre el resultado.   
        System.out.println("Ejercicio 4 Cálculo de divisibilidad:\n " + numUno + " " + divisivilidad + " por " + numDos + "\n El resultado de la suma de ambos numeros es igual a " + resultado); 
    }
}
