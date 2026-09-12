
package eva1_8_arreglos_objetos;
public class EVA1_8_ARREGLOS_OBJETOS {
   public static void main(String[] args) {
      ejemplo[] arreglo;
      //System.out.print("Arreglo = " + arreglo)
      arreglo = new ejemplo[2];
      System.out.println("Arreglo = " + arreglo);
      System.out.println("Arreglo[0] = " + arreglo[0]) ;
      System.out.println("Arreglo[1] = " + arreglo[1]) ;
      arreglo[0] = new ejemplo();
      arreglo[1] = new ejemplo();
      System.out.println("arreglo[0] - " + arreglo[0]);
      System.out.println("arreglo[0] - " + arreglo[1]);
   }
   
}
class ejemplo{
   int i=5;
}
