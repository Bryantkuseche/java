import java.util.Scanner; 
public class Calculadora{
	public static void main(String args[]){
		int num1=0;
		int num2=0; 
		double total=0;
		Scanner entrada=new Scanner(System.in);
		//Suma de numeros
		System.out.println("Introduce un primer numero para sumar:");
		num1=entrada.nextInt();
		System.out.println("Introduce un segundo numero para sumar:");
		num2=entrada.nextInt();
		total=num1+num2;
		System.out.println("La suma de los dos numeros es:"+total);
		//Resta de numeros
		System.out.println("Resta de numeros");
		System.out.println("Introduce un primer numero para restar:");
		num1=entrada.nextInt();
		System.out.println("Introduce un segundo numero para restar:");
		num2=entrada.nextInt();
		total=num1-num2;
		System.out.println("La resta de los dos numeros es:"+total);
		//Multiplicacion de numeros
		System.out.println("Multiplicacion de numeros");
		System.out.println("Introduce un primer numero para multiplicar:");
		num1=entrada.nextInt();
		System.out.println("Introduce un segundo numero para multiplicar:");
		num2=entrada.nextInt();
		total=num1*num2;
		System.out.println("La Multiplicacion de los dos numeros es:"+total);
		//Division de numeros
		System.out.println("Division de numeros");
		System.out.println("Introduce un primer numero para dividir:");
		num1=entrada.nextInt();
		System.out.println("Introduce un segundo numero para dividir:");
		num2=entrada.nextInt();
		total=num1/num2;
		System.out.println("La division de los dos numeros es:"+total);
		//Cuadrado de un numero
		System.out.println("Numero al cuadrado");
		System.out.println("Introduce el numero el cual vas a elevar al cuadrado:");
		num1=entrada.nextInt();
		total=Math.pow(num1,2);
		System.out.println("el cuadrado del numero es:"+total);
		//Cubo de un numero
		System.out.println("Numero al cubo");
		System.out.println("Introduce el numero el cual vas a elevar al cubo:");
		num1=entrada.nextInt();
		total=Math.pow(num1,3);
		System.out.println("El cubo del numero es:"+total);
		//Raiz cuadrada
		System.out.println("Raiz cuadrada");
		System.out.println("Introduce el numero el cual hallaras su raiz cuadrada:");
		num1=entrada.nextInt();
		total=Math.pow(num1,0.5);
		System.out.println("la raiz cuadrada del numero es:"+total);
		//raiz cubica
		System.out.println("Raiz cubica");
		System.out.println("Introduce el numero el cual hallaras su raiz cubica:");
		num1=entrada.nextInt();
		total=Math.pow(num1,0.3);
		System.out.println("la raiz cubica del numero es:"+total);



	}
}