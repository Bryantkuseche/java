import java.util.Scanner;
public class Triangulo{
	public static void main(String args[]){
		Integer lado1=0, lado2=0, lado3=0;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Calculadora de triagulos");
		System.out.println("");
		System.out.println("Ingresa el primer lado ");
		lado1=entrada.nextInt();
		System.out.println("");
		System.out.println("Ingrese el Segundo lado ");
		lado2=entrada.nextInt();
		System.out.println("");
		System.out.println("Ingrese el tercer lado" );
		lado3=entrada.nextInt(); //NextInt para obtener el entero por parte del usuario
		if(lado1.equals(lado2) && lado1.equals(lado3)){ //Operador de comparacion And (&&)
			System.out.println("El triangulo es Equilatero "); //Sentencia if si es verdadera
		}
		else if(lado1.equals(lado2) && lado1 != lado3){ //sentencia if else para anidar varias sentencias
				System.out.println("El triangulo es isoceles");
		}
		else{
			System.out.println("El triangulo es escaleno"); //Sentencia else si es falso
		}
	}
} //Llave final
//Codigo 3, Clase 2, programacion 2, 8-10-2018