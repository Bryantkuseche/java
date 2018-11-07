import java.util.Scanner;
public class ejer1{
	public static void main(String args[]){
		int cont = 0;
		System.out.println("Suma de los numeros pares");
		for(int i = 1; i<=100;i++){
			if(i%2==0){
				cont = cont + i;
			}
		}
		System.out.print(cont+" ");
	}
}