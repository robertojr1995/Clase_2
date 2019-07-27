/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_3;

import java.util.Scanner;

/**
 *
 * @author Roberto Jose
 */
public class Tarea3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduce un número (del 1 al 7): ");
    int dia= 0;
    dia = Integer.parseInt(teclado.nextLine());
    switch (dia){
        case 1:
          System.out.print("Lunes");
          break;
        case 2:
          System.out.print("Martes");
          break;
        case 3:
          System.out.print("Miércoles");
          break;
        case 4:
          System.out.print("Jueves");
          break;
        case 5:
          System.out.print("Viernes");
          break;
        case 6:
          System.out.print("Sábado");
          break;
        case 7:
          System.out.print("Domingo");
          break;
        default:
          System.out.print("numero invalido");
    }
    }
    
}
