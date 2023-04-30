package programacionimperativa.guiajavajedi1.iniciadojavajedipractica;

public class Ejercicio7 {

    //Ejercicio 7 Multiplicación: 

    public static void main(String[] args) {
        
    //Se le solicita que guarde dos números reales y los multiplique.

    double numReal1 = 0.5;
    
    double numReal2 = 3.6;

    double multiplicacion1 = numReal1 * numReal2;

     //luego guardar otros dos números enteros y multiplcarlos.

     double numReal3 = 7.3;

     double numReal4 = 5.1;

     double multiplicacion2 = numReal3 * numReal4;
     
    //Guarde en un espacio de memoria la suma entre estas dos multiplicaciones.

    double suma = multiplicacion1 + multiplicacion2;


    //¿Que resultado le da? ¿Entero o real? ¿Por qué?

    System.out.print("Ejercicio 7 Multiplicación:" + "\n El resultado de la suma de las dos multiplicaciones es: " + suma + "\n Es un número real porque ambas multiplicaciones arrojan un resultado real ");
}
}
