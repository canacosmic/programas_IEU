import java.util.Scanner;
class Ejercicio1_semana3_IEU_fundProg {

 static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
  // Input del usuario
  System.out.println("Ingresa un número entero: ");
  int num = sc.nextInt();
  // Checando si es positivo o negativo
  if (num >= 0) {
   System.out.println("El número ingresado es positivo.");
  } 
  else {
   System.out.println("El número ingresado es negativo.");
  }
  // Checando si es par o impar 
  if (num % 2 == 0){
   System.out.println("El número ingresado es par.");
  }
  else{
   System.out.println("el número ingresado es impar.");
  }
  // imprimiendo el valor absoluto
  System.out.println("El valor absoluto de " + num + " es: " + Math.abs(num));
 }
}