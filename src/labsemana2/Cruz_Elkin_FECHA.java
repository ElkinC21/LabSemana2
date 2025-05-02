/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsemana2;
import java.util.Scanner;
/**
 *
 * @author elkin
 */
public class Cruz_Elkin_FECHA {
 public static void main(String[]args){
 
 Scanner lea=new Scanner(System.in);
 
     System.out.print("Ingrese la fecha 1 utilizando el siguiente formato Dia/Mes/Año: ");
     String fecha1=lea.nextLine();
     System.out.print("Ingrese la fecha 2 utilizando el siguiente formato Dia/Mes/Año: ");
     String fecha2=lea.nextLine();
     
     
     int  dia1=Integer.parseInt(fecha1.substring(0,2));
     int  mes1=Integer.parseInt(fecha1.substring(3,5));
     int año1=Integer.parseInt(fecha1.substring(6));
 
     if (dia1<1||dia1>31||mes1<1||mes1>12) {
            System.out.println("Fecha 1 no es valida");
            return;
        }
     int dia2=Integer.parseInt(fecha2.substring(0,2));
     int mes2=Integer.parseInt(fecha2.substring(3,5));
     int año2=Integer.parseInt(fecha2.substring(6));

   if (dia2<1||dia2>31||mes2 <1||mes2> 12) {
            System.out.println("Fecha 2 no es inválida.");
           return;
        }
     int  diasfecha1= año1*360+mes1*30+dia1;
  int diasfecha2= año2*360+mes2*30+dia2;
  int diferencia_dias=0;

  if(diasfecha1>=diasfecha2){
diferencia_dias=diasfecha1-diasfecha2;
 
}else{
diferencia_dias=diasfecha2-diasfecha1;
}
     System.out.println("Primera fecha ingresada: "+fecha1);
     System.out.println("Segunda fecha ingresada: "+fecha2);
     System.out.println("Diferencia de dias entre las dos fechas: "+ diferencia_dias);
 
 
 
 
 }  
}
