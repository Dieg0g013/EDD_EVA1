
package eva1_7_arreglos_size;
public class EVA1_7_ARREGLOS_SIZE {
   public static void main(String[] args) {
      int[] original = new int[10];
      for(int i = 0; i < original.length; i++) {//Llenar con datos aleatorios
      original[i] = (int)(Math.random() * 100);
   }
   for (int i = 0; i < original.length; i++) {//Imprimir
      System.out.print("[" + original[i] + "]");
   
   }
System.out.println("");
//Cambiar el tamano no se puede
//Respaldo
int[] copia = original;//Copio la direccion de arreglo original
original = new int[5];
System.out.println(original);
//Transferir la informacion
for (int i = 0; i < original.length; i++){//Imprimir arreglo "Modificado"
   System.out.print("[" + original[i] + "]");
}
for(int i = 0; i < original.length;i++){
   System.out.print("[" + original[i] + "]");
}
   }
}
