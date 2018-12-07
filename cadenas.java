import java.lang.Integer;
import java.lang.String;
import java.lang.Character;
public class cadenas{
	public static void main(String args[]){
		//String cadena = "3127";
		//int numero = 3254;
		//int numEntero = Integer.parseInt(cadena);
		//String numCadena = Integer.toString(numero);
		//System.out.println(numEntero);
		//System.out.println(numCadena);
		String sCadena = "1325";
		int suma = 0;
		int cont = 0;
		String digito = "";
		char[] aCaracteres = sCadena.toCharArray();
		for (int x=0;x<aCaracteres.length;x++){
			digito = Character.toString(aCaracteres[x]);
			cont = Integer.parseInt(digito);
			System.out.println(cont);
			suma = suma + cont;
			System.out.println(suma);
		}
		System.out.println(suma);
	}
}