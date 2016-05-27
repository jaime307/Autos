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
public class Main {

    public static void main(String arg[]) throws InterruptedException {
        String cadena1, dia1, hora2;
        char digito, car;
        int n, hora3, car1;
        double hora4;

        //Sacar el día de la semana de hoy
        Carro carro1 = new Carro();
//        dia1=carro1.obtenerDiaSemana();

        String[] dias = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        Date hoy = new Date();
        int numeroDia = 0;
        Calendar cal = Calendar.getInstance();
        cal.setTime(hoy);
        numeroDia = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("numero de día " + numeroDia);
        System.out.println("hoy es " + dias[numeroDia - 1]);
        dia1 = dias[numeroDia - 1];
//      return dias[numeroDia -1];

        //Sacar el dígito de la placa
        cadena1 = carro1.placa;
        n = cadena1.length();
        car = cadena1.charAt(n - 1);

        car1 = Integer.parseInt("" + cadena1.charAt(n - 1));
        System.out.println(car1);
        System.out.println("el ultimo digito es " + car);

        //
        hora2 = carro1.hora;
        System.out.println("la hora es " + hora2);
        hora3 = Integer.parseInt(hora2);

        hora4 = hora3 * 1.0;

//        int hora2=0;
//        hora2=Integer.parseInt(hora1);
        switch (car1) {
            case 0: {

//           if(car1==0) {
                System.out.println("Si ingresó 0");
                if (dia1.equals("Lunes")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");

                    }
                }
            }
            break;
//            if(car1==1) {
            case 1: {
                System.out.println("Si ingresó 1");
                if (dia1.equals("Lunes")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }
            }
            break;
//            if(car1==2) {
            case 2: {
                System.out.println("Si ingresó 2");
                if (dia1.equals("Martes")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }
            }
            break;
//             if(car1==3) {  
            case 3: {
                System.out.println("Si ingresó 3");
                if (dia1.equals("Martes")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }
            }
            break;
//                if(car1==4) {
            case 4: {
                System.out.println("Si ingresó 4");
                if (dia1.equals("Miercoles")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }
            }
            break;
//                if(car1==5) {
            case 5: {
                System.out.println("Si ingresó 5");
                if (dia1.equals("Miercoles")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }
            }
            break;
//                 if(car1==6) {
            case 6: {
                System.out.println("Si ingresó 6");
                if (dia1.equals("Jueves")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }
            }
            break;
//                 if(car1==7) {
            case 7: {
                System.out.println("Si ingresó 7");
                if (dia1.equals("Jueves")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }
            }
            break;
//                  if(car1==8) {
            case 8: {
                System.out.println("Si ingresó 8");
                if (dia1.equals("Viernes")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }
            }
            break;
//                 if(car1==9) {
            case 9: {
                System.out.println("Si ingresó 9");
                if (dia1.equals("Viernes")) {
                    if ((hora4 > 9 && hora4 < 7) || (hora4 > 16 && hora4 < 19)) {
                        System.out.println("No puede circular");
                    }
                }

            }
            break;
            default:
                System.out.println("Puede Circular");
        }
    }
}
