package programacionimperativa.padawanjavajedi;


public class Ejercicio3 {

    //Ejercicio 3 Caracteres:

    public static void main(String[] args) {
        //Guarde en distintos espacios de memoria los caracteres de su nombre en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? ¿Qué es unicode? 

        char primerLetra = 80;

        char segundaLetra = 97;

        char tercerLetra = 111;

        char cuartaLetra = 108;

        char quintaLetra = 97;

        System.out.println("Ejercicio 3 caracteres:\n\n" + primerLetra + segundaLetra + tercerLetra + cuartaLetra + quintaLetra + "\n\nNo se puede usar comillas dobles en char porque en este formato se debe usar comillas simples, a diferencia de los strings." + "\n\nUnicode es un sistema de codificación de caracteres utilizado por los equipos informáticos para el almacenamiento y el intercambio de datos en formato de texto. Asigna un número único a cada carácter de los principales sistemas de escritura del mundo." );

    }
}
