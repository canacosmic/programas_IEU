import java.util.Scanner;
public class ejercicio3_semana3_IEU_fundProg {
 public static void main(String[] args) {
  System.out.println("Ingresa un número entero de filas: ");
  int filas = sc.nextInt();
  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

  for (int i = 1; i <= filas; i++){
   for (int j = 1; j<= i; j++){
    System.out.print(j + " ");
   }
   System.out.println();
  }
 }
}
