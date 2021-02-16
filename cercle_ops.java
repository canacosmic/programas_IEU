import java.util.Scanner;

class cercle_ops
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      final double pi = Math.PI;

      System.out.print("Ingresa el radio del circulo (usar un valor entero): ");
      
      int r = sc.nextInt();
      //Area
      double area = pi * (r * r);
      System.out.println("El area del circulo es: " + area);

      //Circunferencia
      double circunferencia = pi * 2*r;
      System.out.println( "La circunferencia del circulo es: " + circunferencia);
   }
}