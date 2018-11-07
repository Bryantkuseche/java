import java.util.Scanner;
public class Edad{
	public static void main(String args[]){
		String nombre1="",nombre2="";
		Integer age=0;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingresa el 1er nombre");
		nombre1=entrada.nextLine();
		System.out.println("");
		System.out.println("Ingrese el 2do nombre");
		nombre2=entrada.nextLine();
		System.out.println("");
		System.out.println("Introduce tu edad "+nombre1);
		age=entrada.nextInt(); //NextInt para obtener el entero por parte del usuario
		if(age>=18){ //Operador de comparacion mayor o igual que
			System.out.println("Eres mayor de edad "+nombre1); //Sentencia if si es verdadera
		}
		else {
			System.out.println("Eres menor de edad "+nombre2); // sentencia else si es falsa
		}
	}
} //Llave final
//Codigo 2, Clase 2, programacion 2, 8-10-2018