/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carro;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Administrador
 */
public class Carro {
    //Variables nativas de la clase
    public String placa;
    public String fecha;
    public String hora;
    
    //constuctores
    public Carro(){
       placa="TBP224";
//       fecha="25/05/2016";
//       hora="17:25";
       Date d = new Date();
      Calendar c = new GregorianCalendar(); 
        c.setTime(d);

//String  hora;


hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
//System.out.println("La hora es: "+hora);
this.hora=hora;
    }
    
    public Carro(String placa,String fecha,String hora){
     this.placa=placa;
     this.fecha=fecha;
     
    }
    
    
    
    
//   public void obtenerDiaSemana(){
//      String[] dias={"Domingo","Lunes","Martes", "Miércoles","Jueves","Viernes","Sábado"};
//      Date hoy=new Date();
//      int numeroDia=0;
//      Calendar cal= Calendar.getInstance();
//      cal.setTime(hoy);
//      numeroDia=cal.get(Calendar.DAY_OF_WEEK);
//      System.out.println("numero de día "+ numeroDia );
//      System.out.println("hoy es "+ dias[numeroDia - 1]);
//      //return dias[numeroDia -1];
//    }
    }
    

