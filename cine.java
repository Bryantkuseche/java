import java.util.Scanner;
public  class cine{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int cant_asientos_adultos, cant_asientos_ninos, sum_asientos_adultos, sum_asientos_ninos, opcion;
		int num_boletos = 0, total_boletos = 0;
		int sala[][] = new int [5][5];
		//Llenado de la sala
		//0 para niños, 1 para adultos, 2 para asientos vacios
		for(int i = 0; i< 4; i++){
			for(int j = 0; j<4; j++){
				sala[i][j] = 2;
			}
		}
		System.out.println("Sistema de facturacion de sala de cine");
		System.out.println("Ingrese el tipo de boleto que va a realizar");
		System.out.println("1. Boleto para Niño");
		System.out.println("2. Boleto para Adulto");
		opcion = entrada.nextInt();
		switch(opcion){
			case 1: //Opcion de carga para niños
				System.out.print("Introduzca la cantidad de boletos que desea adquirir: ");
				num_boletos = entrada.nextInt();
				total_boletos = num_boletos * 200;
				//Impresion de factura
				System.out.println("Total a Pagar por "+num_boletos+": "+total_boletos);
				System.out.println("Las butacas asignadas son las siguientes: ");
				//recorrido por la matriz para imprimir las butacas
				for(int i = 0;i < 3; i++){
					for(int j = 0; j < num_boletos; j++){
						if(sala[i][j]==2){
							sala[i][j] = 1;
							System.out.println("Butaca: "+i+","+j);
						}
						else {
							System.out.println("Lamentablemente, no quedan butacas libres, espere a la proxima funcion");
						}
					}
				}
			break;
			case 2:
				System.out.print("Introduzca la cantidad de boletos que desea adquirir: ");
				num_boletos = entrada.nextInt();
				total_boletos = num_boletos * 400;
				//Impresion de factura
				System.out.println("Total a Pagar por "+num_boletos+": "+total_boletos);
				System.out.println("Las butacas asignadas son las siguientes: ");
				//recorrido por la matriz para imprimir las butacas
				for(int i = 1;i < 4; i++){
					for(int j = 0; j < num_boletos; j++){
						if(sala[i][j]==2){
							sala[i][j] = 1;
							System.out.println("Butaca: "+i+","+j);
						}
						else {
							System.out.println("Lamentablemente, no quedan butacas libres, espere a la proxima funcion");
						}
					}
				}
			break;
			default:
				System.out.println("Opcion invalida");
			break;
		}
	}
}//llave final