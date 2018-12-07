import java.lang.Integer;
import java.util.Scanner;
import java.lang.Character;
import java.lang.String;
public class capicua{
	public static boolean capicua(String numero){
		char[] digitos = numero.toCharArray();
		int index = digitos.length; //Con este hallamos el ultimo indice del arreglo, asi no nos importa 
		char[] digitos_al_reves = new char[index]; //arreglo para voltear el numero
		int cont = 0;
		for(int i=(index-1);i>=0;i--){ //ojo, si es menor estricto no llega al final
			digitos_al_reves[cont] = digitos[i]; //lo volteamos
			cont++;
		}
		int sum_index = 0;
		for(int i=0;i<index;i++){
			if(digitos[i] == digitos_al_reves[i]){ //comparamos indice por indice y lo sumamos
				sum_index++;
			}
		}
		if(sum_index == index){ //si la suma es igual al indice que diga que si, si no, que no
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Introduzca un numero para validar si es capicua o no: ");
		numero = entrada.nextInt();
		String digito = Integer.toString(numero);
		if(capicua(digito)){
			System.out.println("Es capicua!");
		}
		else{
			System.out.println("No es capicua!");
		}
	}
}