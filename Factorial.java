import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		int num = 0;
		int cont = 1;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Factorial de un numero");
		System.out.println("Introduzca el numero al cual desea hallar el factorial");
		num = entrada.nextInt();
		for(int i=num;i<=1;i--){
			cont = cont * i + cont;
		}
		System.out.println("El factorial de "+num+" es:"+cont);
	}
}