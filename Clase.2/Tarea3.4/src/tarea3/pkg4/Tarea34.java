/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Roberto Jose
 */
public class Tarea34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int eurosH = 12;
    int eurosE = 16;
    int totalS;
    int horasE;
    int horasT =0;
    Scanner teclado = new Scanner (System.in);
   
    System.out.print("introduce las horas trabajadas: ");
    horasT = Integer.parseInt(teclado.nextLine());
    
    if (horasT <= 40){
      totalS = horasT*eurosH;
      System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d euros", horasT, totalS);
    } 
    else if (horasT > 40){
      horasE = horasT - 40;
      totalS = 40*eurosH + horasE*eurosE;
      System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d euros", horasT, totalS);
    }
    }
    }
    

