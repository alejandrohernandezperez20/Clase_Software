package programas;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * SE INGRESAN TRES NOTAS DE ALUMNOS, SI EL PROMEDIO
 * ES MAYOR O IGUAL A SIETE MOSTRAR UN MENSAJE DE APROBADO
 */
public class programa7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] notas=new int[3];
		float promedio=0,suma=0;
		try {
			for(int i=0;i<notas.length;i++) {
				System.out.println("ingrese "+(i+1)+":");
				notas[i]=sc.nextInt();
				suma+=notas[i];
				if((i+1)==notas.length) {
					promedio=suma/3;
				}
			}
			if(promedio>=7) {
				System.out.println("Certificacion de aprobado");
			}else {
				if(promedio>=4) {
					System.out.println("Certificado de asistencia");
				}else {
					System.out.println("No aprobo");
				}
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("ERROR DEBE SER EN NUMERO");
		}
	}

}
