
package ejercicio9;

import java.util.Scanner;



/**
 *
 * @author JuanJo
 */
public class ejercicio09 {

    public static void main(String[] args) {
       // Usando el Scanner 20255555555
        System.out.println("Holiss");
       System.out.print("sout\n");
       Fecha f1 = new Fecha(2,3,2024);
       Scanner sc = new Scanner(System.in).useDelimiter("\n");//que corte con enter
       System.out.print("Ingrese su nombre y apellido :\n");
       String ape,tuNombre= sc.next();  //"Maria Elizabeth";
       ape = sc.nextLine(); 
       System.out.println("\n\tHola "+ tuNombre+ " "+ ape);
       System.out.println("Ingrese el dia: ");
       int entradaAnio, entradaDia = sc.nextInt();
       do {  // mejor uso validar datos
           System.out.println("Un ingrese un anio valido por favor...");
           entradaAnio = sc.nextInt();
       } while(entradaAnio<0  || entradaAnio > 9999);
        System.out.println("Armamos la fecha: ");  
        //  armamos la fecha...
        Fecha f2 = new Fecha(entradaDia,sc.nextInt(),entradaAnio); //mes lee aca
        System.out.println("Fecha1 "+f1.toString() + "mes ingreso> "+f2.getMes());
        int cant = f1.calcularAnios(f2);  // ejercicio 9
        System.out.println("Diferencia > " + cant);
        //---------------------------------------------------------------
        System.out.println("Ingrese una letra> ");
        char z = sc.next().charAt(0);   // para tomar solo una letra
        System.out.println("Letra ingresada >> "+ z);
        //--------------------------------------------------------------- 
        System.out.println("Ingrese un nro de varios digitos Ej. 2756 lo desglosaremos... ");
        // 2756 =  2 umil + 7 centenas + 5 decenas+ 6 unidades
        int dig, num = sc.nextInt(); // 2756
        while (num>9) {
            dig = num%10;  // num = num%10;  6
            num/=10;       // num = num/10; 275
            System.out.println("Digito: " + dig);
        }
        System.out.println("cociente: " + num);
        // fin del codigo
    } 
}
