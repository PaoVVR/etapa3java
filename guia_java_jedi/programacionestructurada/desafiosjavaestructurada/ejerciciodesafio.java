package programacionestructurada.desafiosjavaestructurada;

import java.util.Scanner;

public class ejerciciodesafio {
   
    public static void main(String[] args) {
        
        //Desafio! 
        //Realizar un programa y guarden en una variable la edad de un cliente y determine si es un niño (menor a 13 años),
        // adolescente (entre 13 y 18 años)adulto joven (entre 18 y 35 años) 
        //o adulto (mayor a 35 años).

      Scanner input = new Scanner(System.in);

      int edad;

      System.out.print("Ingrese la edad del cliente: ");
      
      edad = input.nextInt();

      if (edad < 13) {
         System.out.println("El cliente es menor de edad.");
      }
      else if (edad >= 13 && edad <= 18) {
         System.out.println("El cliente es un adolescente.");
      }
      else if (edad > 18 && edad <= 35) {
         System.out.println("El cliente es un adulto joven.");
      }
      else {
         System.out.println("El cliente es un adulto.");}
      }
}
