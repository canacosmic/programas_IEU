/**
 * ejercicio2_semana4_IEU_fundProg
 */
import java.util.Scanner;

public class ejercicio2_semana4_IEU_fundProg {
 private static Scanner sc;

 public static void main(String[] args) {

  int num;
		sc = new Scanner(System.in);		
		System.out.println("Ingresa un número entero: ");
		num = sc.nextInt();
		numPerf (num);
 }
 public static void numPerf (int num) {
		int i;
  int sum = 0;
		for(i = 1 ; i < num ; i++) {
			if(num % i == 0)  {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.format("%d es un numero perfecto", num);
		}
		else {
			System.out.format("%d no es un numero perfecto", num);
		}
	}
}
