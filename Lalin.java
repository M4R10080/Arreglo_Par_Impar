import java.util.Scanner;
public class Lalin{
   public static void main(String args[]){
   Scanner leer = new  Scanner(System.in);
   int numeros[] = new int[10];
   int pares[] = new int[10];
   int impares[] = new int[10];
   int menor, mayor;
   
   //Almacen 
   System.out.println("Ingrese los numeros de su preferencia");
   for(int x=0; x<10; x++){
      System.out.printf("numero ingresado en la celda [%d]: ",x);
      numeros[x] = leer.nextInt();
   
   }
   //imprime los numeros del arreglo
   System.out.println("\nLos numeros en el arreglo son");
   for(int x=0; x<10; x++){
      System.out.printf(" celda[%d] numero ingresado [%d] \n",x, numeros[x]);
   }

   //pares
   System.out.println("Los numeros pares en el arreglo son");
   for(int x=0; x<10; x++){
      pares[x] = numeros[x];
      if(pares[x] % 2 == 0){
      System.out.printf("celda[%d] numero par[%d] \n",x,pares[x]);
      
      }
   }
   //impares
      System.out.println("Los numeros impares en el arreglo son");
   for(int x=0; x<10; x++){
      impares[x] = numeros[x];
      if(impares[x] % 2 == 1){
         System.out.printf(" celda[%d] numero impar[%d]\n ",x,impares[x]);
      
      }
   }
   menor = numeros[0];
   //menor
   System.out.println("Numero menor");
   for(int x=0; x<10; x++){
      if(numeros[x] < menor){ 
         menor = numeros[x];
      }
   }
   System.out.printf("El numero menor es el[%d]:\n",menor);
   
   mayor = numeros[0];
   //mayor
   System.out.println("Numero mayor");
   for(int x=0; x<10; x++){
      if(numeros[x] > mayor){ 
         mayor = numeros[x];
      }
   }
   System.out.printf("El numero mayor es el[%d]:\n",mayor);
   System.out.print("Mario Eduardo Ventura Alvarez [MEVA]");
   }
}