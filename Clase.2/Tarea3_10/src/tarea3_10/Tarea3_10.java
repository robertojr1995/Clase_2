/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_10;

import java.util.Scanner;

/**
 *
 * @author Roberto Jose
 */
public class Tarea3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String horosc = "vuelve a introducir.";
       Scanner teclado = new Scanner(System.in);
    
    System.out.print("introduce el mes de nacimiento (número): ");
    int mes = Integer.parseInt(teclado.nextLine());
    
    System.out.print("introduce el día de nacimiento: ");
    int dia = Integer.parseInt(teclado.nextLine());
    
    switch (mes){
      case 1:
        if ((dia >=1)&&(dia <= 19)){
          horosc = "Capricornio ";
        }
        else if ((dia >=20)&&(dia <= 31)){
          horosc = "Acuario";
        }
        break;
      case 2:
        if ((dia >=1)&&(dia <= 18)){System.out.print("introduce el mes de nacimiento (número): ");
          horosc = "Acuario";
        }
        else if ((dia >=19)&&(dia <= 29)){
          horosc = "Piscis";
        }
        break;
      case 3:
        if ((dia >=1)&&(dia <= 20)){
          horosc = "Piscis";
        }
        else if ((dia >=21)&&(dia <= 31)){
          horosc = "Aries ";
        }
        break;
      case 4:
        if ((dia >=1)&&(dia <= 19)){
          horosc = "Aries";
        }
        else if ((dia >=20)&&(dia <= 30)){
          horosc = "Tauro";
        }
        break;
      case 5:
        if ((dia >=1)&&(dia <= 20)){
          horosc = "Tauro ";
        }
        else if ((dia >=21)&&(dia <= 31)){
          horosc = "Géminis";
        }
        break;
      case 6:
        if ((dia >=1)&&(dia <= 20)){
          horosc = "Géminis";
        }
        else if ((dia >=21)&&(dia <= 30)){
          horosc = "Cáncer";
        }
        break;
      case 7:
        if ((dia >=1)&&(dia <= 22)){
          horosc = "Cáncer";
        }
        else if ((dia >=23)&&(dia <= 31)){
          horosc = "Leo ♌";
        }
        break;
      case 8:
        if ((dia >=1)&&(dia <= 22)){
          horosc = "Leo";
        }
        else if ((dia >=23)&&(dia <= 31)){
          horosc = "Virgo";
        }
        break;
      case 9:
        if ((dia >=1)&&(dia <= 22)){
          horosc = "Virgo";
        }
        else if ((dia >=23)&&(dia <= 30)){
          horosc = "Libra";
        }
        break;
      case 10:
        if ((dia >=1)&&(dia <= 22)){
          horosc = "Libra";
        }
        else if ((dia >=23)&&(dia <= 30)){
          horosc = "Escorpio";
        }
        break;
      case 11:
        if ((dia >=1)&&(dia <= 21)){
          horosc = "Escorpio";
        }
        else if ((dia >=22)&&(dia <= 30)){
          horosc = "Sagitario";
        }
        break;
      case 12:
        if ((dia >=1)&&(dia <= 22)){
          horosc = "Sagitario";
        }
        else if ((dia >=22)&&(dia <= 30)){
          horosc = "Capricornio";
        }
        break;
      default:
        horosc = "error.";
    }
    System.out.println("Su signo del zodiaco es: " + horosc);
    }
    }
    

