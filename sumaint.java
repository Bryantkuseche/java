import java.lang.String;
import java.lang.Character;
import java.lang.Integer;
import java.util.Scanner;
public class sumaint{
	//funcion para hallar la suma interna de un numero
	public static Integer suma_interna(String numero){
		int resultado = 0; //es el numero que devolveremos al final de la funcion
		char[] digitos = numero.toCharArray(); //convertimos el numero en cifras
		String digito = ""; //variable buffer para convertir
		int index = digitos.length; //obtenemos el largo del vector
		for(int i=0;i<index;i++){
			digito = Character.toString(digitos[i]); //convertimos cada indice en una cadena String
			resultado = resultado + Integer.parseInt(digito);  //sumamos
		}
		return resultado; //salida
	}
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int suma = 0;
		String numero ="";
		System.out.println("Introduzca el numero el cual desea hallar su suma interna: ");
		numero = entrada.nextLine();
		suma = suma_interna(numero);
		System.out.println("La suma interna del numero "+numero+" es: "+suma);
	}
}