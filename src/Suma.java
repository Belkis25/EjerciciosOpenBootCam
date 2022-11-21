import java.util.Scanner;

public class Suma {

    /* Ejercicio 1:
    •	Crear una función con tres parámetros que sean números que se suman entre sí.
    •	Llamar a la función en el main y darle valores.

    */

    public static void main(String[] args) {

      double num1, num2, num3;


      System.out.println("Sistema  Para Sumar Tres Numeros");

        Scanner in =  new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = in.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = in.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = in.nextInt();



        System.out.println(" El resultado de la suma es: " + sumar(num1, num2, num3));



    }


    public static double sumar(double num1, double num2, double num3){

        return num1 + num2 + num3;
    }

}
