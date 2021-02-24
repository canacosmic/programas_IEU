class Ejercicio1_semana4_IEU_fundProg{
 public static void main(String[] args){
  System.out.println(" X |   Y ");
  System.out.println("-----------");

  for (int i = - 5; i <= 5; ++i){
   double base = i;
   double exp = 2;

   double a = 4;
   double b = Math.pow(base, exp);
   double c = 3 * base;
   
   double y = a * b + c + 1 ;

   System.out.println( i + " | " + y + " ");
   System.out.println("-----------");

  }
 }
}