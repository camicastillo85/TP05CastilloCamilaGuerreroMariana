package ar.edu.ies6.informatica.punto01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//declaracion e iniciazion de datos
String nombrePais = "Argentina";
int edad = 26;
double altura = 7.5;
double precio = 360.79;
long telefono = 388462230;
double coseno = Math.cos(0.5);
int num1 = 10;
int num2 = 4;
int num3 = 8;
int num4 = 9;
int num5 = 7;
//calculo para sacar el promedio
double promedio = (num1 + num2 + num3 + num4 + num5) / 5.0;

System.out.println("Nombre del Pais " +  nombrePais);
System.out.println ("Altura del edificio es "  +altura);
System.out.println ("El precio del producto es "  + precio);
System.out.println("El numero de telefono es " + telefono);
System.out.println("El coseno de 0.5 es " + coseno);
System.out.println ("El promedio es " + promedio);
System.out.println("La edad de la persona es " + edad);
}
}