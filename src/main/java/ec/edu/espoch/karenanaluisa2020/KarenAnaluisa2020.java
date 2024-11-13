/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.karenanaluisa2020;

import java.util.Scanner;

/**
 *
 * @author SO-LAB1-PC14
 */
public class KarenAnaluisa2020 {

    public static void main(String[] args) {
       int[]puntuaciones;
       puntuaciones=new int[7];
       int totalPuntos;
       int promPuntuacion;
       int punMax;
       int punMin;
       
       
        for (int i = 0; i < 7; i++) {
            System.out.println("ingrese la p");
            
        }
              
      int[]puntuacionesdias = new int[7];
      
      Scanner sc = new Scanner(System.in);
     int dato=0;
     int i=0;
     
      System.out.println("ingrese la puntuacion el primer dia:");
        System.out.println("ingrese la puntuacion el segundo dia:");
        System.out.println("ingrese la puntuacion el tercer dia:");
        System.out.println("ingrese la puntuacion el cuarto dia:");
        System.out.println("ingrese la puntacion el quinto dia: ");
        System.out.println("ingrese la puntuacion el sexto dia");
        System.out.println("ingrese la puntuacion el septimo dia");
        dato=sc.nextInt(i);
        if (dato>0) {
        puntuacionesdias[i]=dato;
         i++;
        } else {
            System.out.println("el valor es negativo,ingrese nuevamente el valor");
        }
        while(i<7)
        //3
        
        
        System.out.println("1.Calcular el total de puntuaciones de la semana");
        System.out.println("2.Calcular el promedio de puntuaciones y mostrar los dias por encima y por debajo del promedio");
        System.out.println("3.Mostrar el dia con la puntuacion mas alta y el dia con la puntuacion mas baja ");
        System.out.println("4.Calcular el total de puntuaciones acumuladas durante los primeros cuatro dias y los ultimos cuatro dias");
        System.out.println("5.Salir");
        
        System.out.println("Selecciona una opcion:");
       int opcion=0;
      
        switch (opcion) {
            case 1:
                System.out.println("1.Calcular el total de puntuaciones de la semana:");
               for(int j=0; j<7; j++){
           int totalPunto;
               
                   totalPuntos=(totalPunto+j);
                  
               System.out.println("total de puntuacion:"+totalPunto);  
                  }
            break;
        }
    
            case 2: 
                System.out.println("2.Calcular el promedio y mostrar dias por encima y por debajo del promedio");
               for (int h = 0; h < 7; h++) {
              promPuntuacion=(totalPunto/7);
    
}
            
                
                
            break;
    
            case 3:
            System.out.println("3.Mostrar el dia ");
        
    
                
               
            
            
            
  

            
      
       
        
            
            }
        
    
            
        }
             

