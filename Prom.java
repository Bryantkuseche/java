import java.util.Scanner;
public class Prom{
	public static void main(String args[]){
		Integer nota1=0, nota2=0, nota3=0;
		Integer resultado=0;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Calculadora de promedios");
		System.out.println("");
		System.out.println("Ingresa la primera nota ");
		nota1=entrada.nextInt();
		System.out.println("");
		System.out.println("Ingrese la segunda nota ");
		nota2=entrada.nextInt();
		System.out.println("");
		System.out.println("Ingrese la tercera nota " );
		nota3=entrada.nextInt(); //NextInt para obtener el entero por parte del usuario
		resultado=(nota1+nota2+nota3)/3;
		if(resultado >= 14){ //Operador de comparacion And (&&)
			System.out.println("Aprobado con "+resultado+" puntos");
		} //Sentencia if si es verdadera
		else{
			System.out.println("Reprobado con "+resultado+" puntos");
		}
	}
} //Llave final
//Codigo 4, Clase 2, programacion 2, 8-10-2018