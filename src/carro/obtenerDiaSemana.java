/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carro;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class obtenerDiaSemana {

    public obtenerDiaSemana() {
    }

   // public static void main(String arg[]) throws InterruptedException{
  public static String obtenerDiaSemana1(){
      String[] dias={"Domingo","Lunes","Martes", "Miércoles","Jueves","Viernes","Sábado"};
      Date hoy=new Date();
      int numeroDia=0;
      Calendar cal= Calendar.getInstance();
      cal.setTime(hoy);
      numeroDia=cal.get(Calendar.DAY_OF_WEEK);
      System.out.println("numero de día "+ numeroDia );
      System.out.println("hoy es "+ dias[numeroDia - 1]);
      return dias[numeroDia -1];
   }
    
    
}
//}
