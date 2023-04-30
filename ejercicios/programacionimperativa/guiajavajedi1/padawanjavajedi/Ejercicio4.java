package programacionimperativa.guiajavajedi1.padawanjavajedi;

public class Ejercicio4 {

    //Ejercicio  Promedio de edad: 

    public static void main(String[] args) {
        
    //Guarde en diferentes espacios de memoria distintos valores de edad y nombres de personas
    String[] nombres = {"Victor", "Paola", "Angel", "Jonas"};
    int[] edades = {47, 38, 18, 19};

    //luego saque su promedio
    
    int sumaEdades = 47+38+18+19;
    double promedioEdades = sumaEdades / 4;
     
    //imprima por pantalla el nombre de la persona, su edad. 

     for (int i = 0; i < nombres.length; i++) {
      
              System.out.println(nombres[i] + ": " + edades[i] + " años");
    }
      
    //Por último imprimir el promedio de sus edades.
    // Imprimir promedio
          System.out.println("El promedio de edades es: " + promedioEdades);
    }
  }
