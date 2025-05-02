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
public class Cruz_Elkin_Tiempo {
 public static void main(String[]args){
 
 Scanner lea= new Scanner(System.in);

     System.out.print("Ingrese cantidad de segundos : ");
     int segundos_total=lea.nextInt();
     
int horas = segundos_total >0? segundos_total / 3600:0;
int sobrante = segundos_total>0?segundos_total-(horas*3600):0;
int minutos= sobrante> 0 ? sobrante / 60 : 0;
int segundos= sobrante>0?sobrante-(minutos * 60) : 0;

 String resultado= segundos_total<=0?"No se permite este valor": "Horas:"+horas+" Minutos:"+minutos+ " Segundos:"+segundos;
 
 System.out.println(resultado);   
         }
 
    
}
