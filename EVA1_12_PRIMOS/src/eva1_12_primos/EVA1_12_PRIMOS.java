
package eva1_12_primos;

import java.util.Scanner;

public class EVA1_12_PRIMOS {
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner cap = new Scanner(System.in);
      int num;
      
      System.out.println("Ingresa un numero");
      num = cap.nextInt();
      
      int primero=0;
      for (int i = 1; i<= num; i++){
         if (num % i==0){
            primero++;
         }
         
      }
      System.out.println("Resultado1");
      if(primero==2){
         System.out.println(num + "Es primo");
      } else {
         System.out.println(num + "No es primo");
      }
      int segundo=0;
      for (int i = 2; i * i <= num; i++) {
         if (num % i ==0){
            segundo++;
            break;
         }
      }
       System.out.println("Resultado2");
       if (num  > 1 && segundo == 0) {
          System.out.println(num + "Es primo");
          
      } else {
          System.out.println(num + "No es primeo");
       }
   }
   
}
