package programas;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * REALIZAR UN PROGRAMA QUE LEA CUATRO VALORES UNICOS NUMERICOS E INFORME 
 * SU SUMA Y PROMEDIO
 * 
 */

public class programa5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float[] num =new float[4];
		float suma=0,promedio=0;
		try {
			for(int i=0;i<4;i++) {
				System.out.println("ingrese "+(i+1)+": ");
				num[i]=sc.nextFloat();
				suma+=num[i];
				if((i+1)==4) {
					promedio=suma/4;
				}
			}
			DecimalFormat df=new DecimalFormat("0.00");
			System.out.println("la suma de los cuatro valores es: "+suma);
			System.out.println("el promedio de los cuatro valores es es: "+df.format(promedio));
		}catch(InputMismatchException e) {
			System.out.println("ERROR TIENES QUE PONER EN NUMERO");
		}
	}

}
