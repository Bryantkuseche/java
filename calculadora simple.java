import java.util.Scanner; 
public class Calculadora{
	public static void main(String args[]){
		int num1=0;
		int num2=0; 
		resultado=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero para sumar:");
		num1=entrada.nextInt();
		System.out.println("");
		System.out.println("Introduce un numero para sumar:");
		num2=entrada.nextInt();
		resultado=num1+num2;
		System.out.println("La suma de los dos numeros es:"+resultado);
	}
}