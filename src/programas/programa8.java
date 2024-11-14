package programas;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * CREAR UN PROGRAMA QUE SE CARGUE POR TECLADO TRES
 * NUMEROS DISTINTOS, PARA MOSTRAR POR PANTALLA EL MAYOR
 * DE ELLOS 
 */

public class programa8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] num=new int[3];
		try {
			
			for(int i=0;i<num.length;i++) {
				System.out.println("ingrese "+(i+1)+":");
				num[i]=sc.nextInt();
				if((i+1)==num.length) {
					if(num[0]>num[1]) {
						if(num[0]>num[2]) {
							System.out.println(num[0]);
						}
					}else if(num[1]>num[0]) {
						if(num[1]>num[2]) {
							System.out.println(num[2]);
					}else if(num[2]>num[0]) {
						if(num[2]>num[1]) {
							System.out.println(num[2]);
					}
					/*Arrays.sort(num);
					System.out.println(num[num.length-1]);*/
				}
			}
		} catch(InputMismatchException e) {
			// TODO: handle exception
			System.out.println("ERROR TIENES QUE PONER EN NUMEROS");
		}
	}

}
