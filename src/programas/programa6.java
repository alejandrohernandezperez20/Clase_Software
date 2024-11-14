package programas;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * INGRESAR EL SUELDO DE UNA PERSONA, SI SUPERA LOS
 * 3000 EUROS MOSTRAR UN MENSAJE QUE INDIQUE QUE DEBE
 * PAGAR IMPUESTOS
 */
public class programa6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float sueldo;
		try {
			System.out.println("ingrese sueldo: ");
			sueldo=sc.nextFloat();
			if(sueldo>3000) {
				System.out.println("Esta persona debe pagar impuestos");
			}else {
				System.out.println("Esta persona no debe pagar impuestos");
			}
		} catch(InputMismatchException e) {
			System.out.println("ERROR TIENES QUE PONER EN NUMERO");
		}
	}

}
