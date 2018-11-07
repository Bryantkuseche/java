import java.util.Scanner;
public class Nombres{
	public static void main(String args[]){
		String nombre1="",nombre2="";
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingresa el 1er nombre");
		nombre1=entrada.nextLine();
		System.out.println("");
		System.out.println("Ingrese el 2do nombre");
		nombre2=entrada.nextLine();
		if(nombre1.equals(nombre2)){ //Equals es una palabra reservada para verficar si son o no iguales
			System.out.println("Los nombres son iguales"); //Sentencia if si es verdadera
		}
		else {
			System.out.println("Los nombres NO son iguales"); // sentencia else si es falsa
		}
	}
}
//Codigo 1, Clase 2, programacion 2, 8-10-2018