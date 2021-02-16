class Ejercicio3 {
 public static void main(String args[]) {
  int x = 3;
  double y = 5.0;
  byte z_byte;
  int z_int;
  double z_double;
  float z_float;


  z_float = 200 * (float) y + (float) x;
  System.out.println("z en float = " + z_float);

  z_byte = (byte) z_float;
  System.out.println("z en byte = " + z_byte);

  z_int = (int) z_float;
  System.out.println("z en int = " + z_int);

  z_double = (double) z_float;
  System.out.println("z en double = " + z_double);
 }

}
