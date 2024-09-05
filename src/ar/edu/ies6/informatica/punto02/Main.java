package ar.edu.ies6.informatica.punto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ingreso de datos por consola	
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Ingrese un numero entero");
	    //numero par e impar
			int num = scanner.nextInt() ;
		if(num % 2 == 0) {
	     System.out.println("El numero es par. El triple del numero es " + (num * 3));
		}
		else {
		System.out.println("El numero es impar. El doble del numero es " + (num * 2));
		} 

	    scanner.close();
	    }

}
