import java.util.Scanner;
public class vector{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		int[] numeros = new int[4]; //Declaracion del vector
		System.out.println("Lectura de los elementos del vector");
		//Llenado del vector
		for(i = 0; i< 4; i++){
			System.out.println("Numeros["+i+"]=");
			numeros[i] = sc.nextInt();
		}//Cierre de ciclo for
		//Imprimir el vector
		for(int j=0;j<numeros.length;j++){
			System.out.println("Arreglo del indice "+j+" es igual a: "+numeros[j]);
		}
	}
}//Llave final

//Clase 8, Codigo 1, Programacion 2, 29-10-2018 