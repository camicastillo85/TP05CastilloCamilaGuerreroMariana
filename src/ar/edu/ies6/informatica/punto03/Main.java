package ar.edu.ies6.informatica.punto03;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//entrada por el usuario
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un numero entero del 0 al 10");
	int num = scanner.nextInt();
//Verificar el numero
	if (num >= 0 && num <= 10) {
		int factorial = 1;

//calculo del factorial
	int i = num;
	while (i > 1 ) {
		factorial *= i;
		i--;
	}
//mostrar resultado
	System.out.println("El factorial de : " + num + "es: " + factorial);
	}else { System.out.println("El numero ingresado esta fuera del rango ");
	
	}	
	scanner.close();
	}
	
	}


