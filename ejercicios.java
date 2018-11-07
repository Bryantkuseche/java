import java.util.Scanner; 
public class ejercicios{
	public static void main(String args[]){
		int opcion = 0;
		int cont = 0;
		int j = 1;
		int num = 0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca un numero para mostrar un ejercicio resuelto");
		System.out.println("1. Suma de los cien primeros pares");
		System.out.println("2. Suma de los cincuenta primeros impares");
		System.out.println("3. Suma de los multiplos de 3 del 1 al 30");
		System.out.println("4. Bonus");
		opcion = entrada.nextInt();
		switch(opcion){
			case 1:
				System.out.println("Suma de los cien primeros pares");
				for(int i=1;i<=100;i++){
					if(i % 2 == 0){
						cont=cont+i;
					}
				}
				System.out.println("Suma total: " +cont);
				break;
				case 2:
					System.out.println("Suma de los cincuenta numeros pares");
					for(int i=1;i<50;i++){
						if(i% 2 != 0){
							cont = cont + i;
						}
					}
					System.out.println("Suma total: " +cont);
				break;
				case 3:
					System.out.println("Suma de los multiplos de 3 del 1 al 30");
					for(int i=1;i<=30;i++){
						if(i%3==0){
							cont = cont + i;
						}
					}
					System.out.println("Suma total: " +cont);
				break;
				case 4:
					System.out.println("Mostrar un numero si esta dentro del 1 y el 100");
					System.out.println("Si es menor de 50 mostrar hacia atras y si no lo contrario");
					System.out.println("Introduzca un numero");
					num = entrada.nextInt();
					if(num > 1 & num < 50){
						for(int i=50;i>=1;i--){
							System.out.println(i+ " ");
						}
					}
					else{
						for(int i=50;i<=100;i++){
							System.out.println(i+ " ");
						}
					}
				break;
				default:
					System.out.println("Opcion invalida");
				break;
			}
		}
	}
//Codigo 4, Clase 4, Programacion 2 15-10-2018