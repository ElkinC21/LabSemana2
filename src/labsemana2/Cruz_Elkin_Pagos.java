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
public class Cruz_Elkin_Pagos {
public static void main(String[]args){

    Scanner lea=new Scanner(System.in);
   
    System.out.print("Ingrese codigo del empleado: ");
    int codigo=lea.nextInt();
    lea.nextLine();
    System.out.print("Ingrese nombre del empleado: ");
    String nombre=lea.nextLine();
    System.out.print("Ingrese apellido del empleado: ");
    String apellido=lea.nextLine();
    System.out.print("Ingrese cantidad de horas trabajadas: ");
    int horas= lea.nextInt();
    System.out.println("Se muestran las siguientes categorias");
    System.out.print("1.$40 por hora extra//");
    System.out.print("2.$50 por hora extra//");
    System.out.print("3.$85 por hora extra//");
    System.out.println("4.$0");
    System.out.print("Ingrese categoria: ");
   int categoria=lea.nextInt();

int horas_normales=horas;   
int horas_extras=0;
double pagohoras_normales= 35.99;
double pagohoras_extras=0;
if(horas>40&&horas<=55){
    horas_normales=40;
    horas_extras=horas-40;
}else if(horas>55){
 horas_extras=horas-45;
 horas_normales=40;
}else{

}
   switch(categoria){
    case 1:
    pagohoras_extras=40;    
    break;
    case 2:
     pagohoras_extras=50;
     break;
    case 3:
     pagohoras_extras=85;
     break;
    case 4:
     pagohoras_extras=0;
     }
    
   double sueldo_neto=(horas_normales*35.99)+(horas_extras*pagohoras_extras);
   
    System.out.println("****Boleta de pago*****");
    System.out.println("Codigo del empleado: "+codigo);
    System.out.println("Nombre del empleado: "+ nombre);
    System.out.println("Apellido del empleado: "+apellido);
    System.out.println("Cantidad de horas trabajadas: "+horas);
    System.out.println("Sueldo base: $"+(horas_normales*35.99));
    System.out.println("Horas extras: "+ horas_extras);
    System.out.println("Pago horas extras: $"+(pagohoras_extras*horas_extras));
    System.out.println("Categoria: "+categoria);
    System.out.println("Sueldo neto: $"+ String.format("%.2f",sueldo_neto));

}
}
