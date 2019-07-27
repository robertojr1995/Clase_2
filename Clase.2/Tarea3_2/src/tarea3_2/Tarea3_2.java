/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_2;

import java.util.Scanner;

/**
 *
 * @author Roberto Jose
 */
public class Tarea3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        int hora= 0;
         System.out.print("Por favor, introduce la hora: ");
    hora = Integer.parseInt(teclado.nextLine());
    if ((hora >= 6)&&(hora <= 12)){
      System.out.print("Buenos días.");
    } 
    else if ((hora >= 13)&&(hora <= 20)){
      System.out.print("Buenas tardes.");
    } 
    else if ((hora >= 21)&&(hora <= 23)){
      System.out.print("Buenas noches.");
    } 
    else if ((hora >= 0)&&(hora <= 5)){
      System.out.print("Buenas noches.");
    } 
    else {
      System.out.print("No introdujo algo valido.");
    }
    }
    
}
