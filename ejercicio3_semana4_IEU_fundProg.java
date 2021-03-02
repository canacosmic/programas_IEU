import java.util.Scanner;

public class ejercicio3_semana4_IEU_fundProg {
 private static Scanner sc;

 public static void main(String[] args) {

  sc = new Scanner(System.in);
  double dolares;
  double pesos;
  int i;
  double[] valoresBase = {500.00,200.00,100.00,50.00,20.00,5.00,2.00,1.00,0.5};

  System.out.println(" ");
  System.out.println(" ");
  System.out.println("Ingresa la cantidad de dolares a cambiar a pesos: ");
  dolares = sc.nextFloat();
  System.out.println(" ");
  System.out.println(" ");
  pesos = dolares * 13.15;

  System.out.println("La cantidad equivalente de " + dolares + " en pesos mexicanos es de: " + pesos);

  System.out.println(" ");
  System.out.println(" ");

  do{

   for(i = 0; i < valoresBase.length && pesos != 0; i++){
    if(pesos >= valoresBase[i]){
     System.out.println("Cantidad de " + valoresBase[i] + "'s" + " : " + Math.round(pesos/valoresBase[i]));
    }
    pesos = pesos % valoresBase[i];
    }

  }while (pesos != 0);
  System.out.println(" ");
  System.out.println(" ");
  }
 }

