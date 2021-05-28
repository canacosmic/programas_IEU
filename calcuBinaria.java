import java.util.Scanner;

public class calcuBinaria {

 static void suma(){
   
  long b1, b2;
  int i = 0, acarreo = 0;

  int[] suma = new int[10];

  Scanner scanner = new Scanner(System.in);

  System.out.print("ingresa el primer numero binario: ");
  b1 = scanner.nextLong();

  System.out.print("Ingresa el segundo numero binario: ");
  b2 = scanner.nextLong();

  scanner.close();

  while(b1 != 0 || b2 != 0){
   suma[i++] = (int) ((b1 % 10 + b2 % 10 + acarreo)%2);
   acarreo = (int) ((b1 % 10 + b2 % 10 + acarreo)/2);
   b1 = b1/10;
   b2 = b2/10;
  }

  if (acarreo != 0){
   suma[i++] = acarreo;
  }
  --i;

  System.out.print("Resultado:");

  while(i>=0){
   System.out.print(suma[i--]);
  }
  System.out.print("\n");
 }

 static void resta(){
  //codigo de resta aqui
  Scanner scanner = new Scanner(System.in);

  System.out.print("Ingrese el primer numero binario: ");
  String bin1 = scanner.nextLine();

  System.out.print("Ingrese el segundo numero binario: ");
  String bin2 = scanner.nextLine();

  int A = Integer.parseInt(bin1,2);
  int B = Integer.parseInt(bin2,2);

  Long suma = (long) A + (~B + 1);

  System.out.println("\nLa resta es: " + Long.toBinaryString(suma));  
  
  scanner.close();
 }

 static void andOp(){
  // codigo de AND aqui
  Scanner scanner = new Scanner(System.in);

  System.out.print("Ingrese el primer numero binario: ");
  String bin1 = scanner.nextLine();

  System.out.print("Ingrese el segundo numero binario: ");
  String bin2 = scanner.nextLine();

  int A = Integer.parseInt(bin1,2);
  int B = Integer.parseInt(bin2,2);

  System.out.print("A & B = " + (A & B));
 }

 static void orOp(){
  Scanner scanner = new Scanner(System.in);

  System.out.print("Ingrese el primer numero binario: ");
  String bin1 = scanner.nextLine();

  System.out.print("Ingrese el segundo numero binario: ");
  String bin2 = scanner.nextLine();

  int A = Integer.parseInt(bin1,2);
  int B = Integer.parseInt(bin2,2);

  System.out.print("A | B = " + (A | B));
 }

 static void notOp(){
  Scanner scanner = new Scanner(System.in);

  System.out.print("Ingrese el primer numero binario: ");
  String bin1 = scanner.nextLine();

  int A = Integer.parseInt(bin1,2);
  

  System.out.print("NOT A = " + (~A));
 }
 public static void main(String[] args){

  // Menú
  System.out.println("");
  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
  System.out.println("Bienvenidos a su Calculadora Binria");
  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
  System.out.println("");
  System.out.println("Al final del menu ingrese el character para realizar la acción deseada.");
  System.out.println("");
  System.out.println("1 - para sumar");
  System.out.println("2 - para la resta");
  System.out.println("3 - para AND");
  System.out.println("4 - para OR");
  System.out.println("5 - para NOT");
  System.out.println("S - para salir ");
  System.out.println("");
  // Fin menú

  // input del usuario
  System.out.println("introduzca su eleccion:");
  Scanner myObj = new Scanner(System.in);
  char input = myObj.next().charAt(0);
  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
  System.out.println("Su elecion fue " + input);
  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
  // din input del usuario

  switch (input) {
   case '1':
    //Codigo aqui y mandar llamar funcion de suma 
    //System.out.println("SUMA");
    suma();
    break;
   
   case '2':
    // codigo aqui para llamar la funcion de resta 
    //System.out.println("RESTA");
    resta();
    break;

   case '3':
   // codigo aqui para llamar a la funcion de AND
   //System.out.println("AND");
   andOp();
   break;

   case '4':
   // codigo aqui para mandar llamar funcion de OR
   System.out.println("OR");
   break;

   case '5':
   //System.out.println("nOt");
   notOp();
   break;

   case 'S':
    // codigo aqui para salir del programa 
    System.exit(0);

   default:
    break;
  }
 }
}
