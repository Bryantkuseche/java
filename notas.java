import java.util.Scanner;
public class notas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,largo,acumulador;
		double promedio;
		System.out.println("Introduzca el largo del vector");
		largo = sc.nextInt();
		int[] notas = new int[largo];
		//llenado del vector
		for(i=0;i<largo;i++){
			System.out.print("Introduzca el valor para el indice: "+i+": ");
			notas[i]=sc.nextInt();
		}
		promedio = 0.0;
		acumulador = 0;
		//Recorrido para sumar datos
		for(i=0;i<notas.length;i++){
			acumulador = acumulador + notas[i];
		}
		promedio = acumulador / largo;
		System.out.println("El promedio de notas es: "+promedio);
	}
}