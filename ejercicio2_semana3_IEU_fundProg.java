import java.util.Scanner;
public class ejercicio2_semana3_IEU_fundProg {
 static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
  System.out.println("- Ingrese los siguientes datos solicitados del paciente -");

  System.out.println("Ingresa un número de cama del paciente: ");
  int cama = sc.nextInt();

  System.out.println("Ingresa el nombre del paciente: ");
  String nombre = sc.next();

  System.out.println("Ingresa la edad del paciente: ");
  int edad = sc.nextInt();

  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

  System.out.println("Indique el sintoma del paciente: ");
  System.out.println(" Si tiene dolor de cabeza digite 1");
  System.out.println(" Si tiene dolor de estomago digite 2");
  int sintoma = sc.nextInt();

  System.out.println("Indique la temperatura del paciente: ");
  float temp = sc.nextFloat();

  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

  if (sintoma == 1 && temp > 38){
   System.out.println("El paciente tiene gripa");
  }
  else if (sintoma == 2 && temp > 30){
   System.out.println("El paciente tiene tifoidea");
  }
  else {
   System.out.println("El paciente es dado de alta");
  }
 }
}