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
public class Cruz_Elkin_Clases {
 public static void main(String[]args){
 
     Scanner lea = new Scanner(System.in);
  
  System.out.print("Ingrese fecha (dia, DD/MM): ");
     String fecha_actual=lea.nextLine();

     int coma=fecha_actual.indexOf(',');
     if(coma==-1){
         System.out.println("Formato incorrecto");
         lea.close();
         return;
     }
     String dia=fecha_actual.substring(0,coma).trim().toLowerCase();
     String fecha2=fecha_actual.substring(coma+1).trim();

int barra=fecha2.indexOf('/');
     if(barra==-1){
   System.out.println("Formato incorrecto");
  return;
     }
  int dia_numero=Integer.parseInt(fecha2.substring(0,barra));
     int mes=Integer.parseInt(fecha2.substring(barra+1));

     if(!(dia.equals("lunes")||dia.equals("martes")||dia.equals("miercoles")||dia.equals("jueves")||dia.equals("viernes"))||dia_numero<1||dia_numero>31||mes<1||mes>12){
     System.out.println("El dia o fecha no es valida");
         return;
     }switch (dia) {
         case "lunes", "martes", "miercoles" -> {
             System.out.print("Se tomaron examenes hoy? (si/no): ");
             String examenes = lea.nextLine().trim().toLowerCase();
             if (examenes.equals("si")) {
                 System.out.print("Aprobados: ");
                 int aprobados = Integer.parseInt(lea.nextLine().trim());
                 System.out.print("Reprobados: ");
                 int reprobados = Integer.parseInt(lea.nextLine().trim());
                 double porcentaje = aprobados * 100.0 /(aprobados + reprobados);
                 System.out.println("Porcentaje aprobados: "+porcentaje +"%");
             }
         }
         case "jueves" -> {
             System.out.print("% Asistencia: ");
             double asistencias = Double.parseDouble(lea.nextLine().trim());
             System.out.println(asistencias > 50 ? "asistio la mayoria" : "no asistio la mayoria");
         }
         case "viernes" -> {
             if (dia_numero == 1 && (mes == 1||mes == 7)) {
                 System.out.println("Comienzo de nuevo ciclo");
                 System.out.print("Alumnos: ");
                 int cantidad = Integer.parseInt(lea.nextLine().trim());
                 System.out.print("Precio por alumno: $ ");
                 double precio =Double.parseDouble(lea.nextLine().trim());
                 System.out.println("Ingreso total: $"+(cantidad * precio));
             }
         }
         default -> {
         }
     }

    
 }
}
  
   
 