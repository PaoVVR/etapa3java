package programacionimperativa.guiajavajedi1.iniciadojavajedipractica;

public class Ejercicio2 {
    public static void main(String[] args) {

//ejercicio 2 Suma de dos números bis: 

    //Se les solicita que guarden dos números enteros
    int numUno = 3;
    int numDos = 8;

    //los sumen. 
    int resultado = numUno + numDos;

    String paridad = (resultado % 2 == 0) ? "es par":"es impar"; 

    //El resultado guardarlo, mostrarlo por pantalla 
    //junto con un mensaje que indique si se trata de un número par o impar.
    //El mensaje debe tener el siguiente formato:"El resultado es “ {Resultado} “y es” {paridad}

    System.out.println("Ejercicio 2 Suma de dos números Bis:" + "\n El resultado de la suma es: " + resultado + "\n Este número:" + paridad);
}
}
