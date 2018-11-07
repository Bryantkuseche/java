import java.util.Scanner;
public class fibo2{
	public static void main(String argsv[]){
		Scanner entrada = new Scanner(System.in);
		int num1, num2, i, num3;
		int cant_par, cant_impar,suma_par,suma_impar;
		num1= 0;
		num2 = 0;
		cant_par=0;
		cant_impar=0;
		suma_par=0;
		suma_impar=0;
		System.out.println("Introduce el numero al cual le hallara el fibonacci");
		num3 = entrada.nextInt();
		System.out.print("La serie de fibonacci para el numero "+num3+" es: ");
		for(i=0;i<num3;i++){
			if(i==0){
				num1=0;
				num2=0;
			}
			else if(i== 1 | i==2){
				num1=1;
				num2=1;
			}
			else{
				num2 = num1 + num2;
				num1 = num2 - num1;
			}//fin de fibonacci
			if(num2%2 == 0){
				cant_par= cant_par + 1;
				suma_par= suma_par + num2;
			}
			else{
				cant_impar=cant_impar + 1;
				suma_impar= suma_impar + num2;
			}
			System.out.print(num2+" ");
		}
		System.out.println();
		System.out.println("Cantidad de numeros pares: "+cant_par);
		System.out.println("Suma total de los numeros pares: "+suma_par);
		System.out.println("Cantidad de numeros impares: "+cant_impar);
		System.out.println("Suma total de los numeros impares: "+suma_impar);
	}
}
