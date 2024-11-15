package programas;

import java.util.Scanner;

/*
 * CREAR UN PROGRAMA QUE CARGUE (DIA,MES AÑO) POR TECLADO
 * MOSTRAR UN MENSAJE SI CORRESPONDE AL PRIMER TRIMESTRE DEL AÑO
 * (ENERO,FEBRERO O MARZO) CARGAR POR TECLADO VALOR NUMERICO DIA, MES  Y AÑO
 * 
 */
public class programa13 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dia,mes,año;
		System.out.println("ingrese numero de dia: ");
		dia=sc.nextInt();
		System.out.println("ingrese numero de mes: ");
		mes=sc.nextInt();
		System.out.println("ingrese numero de año: ");
		año=sc.nextInt();
		if(mes==1 ||  mes==2 || mes==3) {
			System.out.println("corresponde al primer trimestre: ");
		}
	}

}
