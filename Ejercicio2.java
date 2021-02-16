import java.util.Scanner;

class Ejercicio2
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Ingrese un número entero: ");
      int input = sc.nextInt();

      int i = 1;
      int suma;
      int resta;
      int multi;
      float multiDIV;
      float div;


      System.out.println("La SUMA del numero ingresado con los primeros 5 numeros positivos es:");
      for(i = 1; i <= 5; i++)
      {
       suma = i + input;
       System.out.println(i + "+" + input + "=" + suma);
      }

      System.out.println("La RESTA del numero ingresado con los primeros 5 numeros positivos es:");
      for(i = 1; i <= 5; i++)
      {
       resta = input - i;
       System.out.println(input + "-" + i + "=" + resta);
      }

      System.out.println("La MULTIPLICACIÓN del numero ingresado con los primeros 5 numeros positivos es:");
      for(i = 1; i <= 5; i++)
      {
       multi = input * i;
       System.out.println(input + "*" + i + "=" + multi);
      }

      System.out.println("La DIVISIÓN en 3 del numero ingresado multiplicado por i es:");
      for(i = 1; i <= 5; i++)
      {
       multiDIV = input * i;
       div = multiDIV / 3;

       System.out.printf("La DIVISIÓN en 3 del numero ingresado multiplicado por " + i + " es: %.2f" + '\n', div);
      }
   }
}