import java.util.Scanner;
public class ejercicio2{
	public static void main(String args[]){
		int filas=0,columnas=0,contador=0, valor=0;
		Scanner entrada = new Scanner(System.in);
		//Creacion de la matriz
		System.out.println("¿Cuantas filas deseas?");
		filas = entrada.nextInt();
		System.out.println("¿Cuantas columnas deseas?");
		columnas = entrada.nextInt();
		int numeros[][] = new int [filas][columnas];
		//Recorrido para el llenado de la matriz
		for(int i=0;i<filas;i++){
			for(int j=0;j<columnas;j++){
				System.out.println("Ingrese el valor "+i+","+j+" de la matriz");
				numeros[i][j] = entrada.nextInt();
			}
		}
		//Recorrido para mostrar la matriz
		System.out.println("La matriz "+filas+" x "+columnas+" es asi: ");
		for(int i=0;i<filas;i++){
			for(int j=0;j<columnas;j++){
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		//recorrido de la diagonal principal
		System.out.println("La diagonal principal esta compuesta por los siguientes numeros: ");
		for(int i=0;i<filas;i++){
			switch(i){
				case 0:
					System.out.println(numeros[i][i]);
				break;
				case 1:
					System.out.println("  "+numeros[i][i]+"  ");
				break;
				case 2:
					System.out.println("    "+numeros[i][i]);
				break;
			}
		}
		System.out.println("El recorrido en L es el siguiente: ");
		//Recorrido en L
		for(int i=0;i<filas;i++){
			System.out.println(numeros[i][0]);
		}
		for(int i=1;i<columnas;i++){
			System.out.print(numeros[2][i]+" ");
		}
		System.out.println();
		System.out.println("El recorrido en T es el siguiente: ");
		//Recorrido en T
		for(int i=0;i<filas;i++){
			System.out.print(numeros[0][i]+" ");
		}
		System.out.println();
		int medio = columnas / 2;
		for(int i=1;i<filas;i++){
			System.out.println("  "+numeros[i][medio]+"  ");
		}
		//Recorrido en Z
		for(int i=0;i<filas;i++){
			System.out.print(numeros[0][i]+" ");
		}
		System.out.println();
		int max = filas - 2;
		for(int i = max;i>=0;i--){
			System.out.println(numeros[i][i]);
		}
		for(int i= 1;i<filas;i++){
			System.out.print(numeros[filas-1][i]+" ");
		}

	}

}
/* Hacer el recorrido en T, L, Z, Promedio de la suma de todos, si es mayor de 16 aprobado, sumatoria de la diagonal principal*/