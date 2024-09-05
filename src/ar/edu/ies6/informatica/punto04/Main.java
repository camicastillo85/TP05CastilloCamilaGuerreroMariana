package ar.edu.ies6.informatica.punto04;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ingreso de datos
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese un numero del 1 hasta el 9");
        int num = scanner.nextInt();
//Verificacion del numero ingresado   
        if (num >= 1 && num <= 9) {
	System.out.println("La tabla del numero " + num + " es: " );
//Mostrar la tabla del numero
	for (int i = 1; i <= 10; i++) {
		System.out.println(num + "x" + i + "=" + (num * i));	
	}
//Mostrar elmensaje del numero si esta mal	
  }else { System.out.println("El numero ingresado esta fuera del rango"); 
	
	}
scanner.close();  
}
}