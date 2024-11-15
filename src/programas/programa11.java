package programas;

import java.util.Scanner;

/*
 * DESARROLLARUN PROGRAMA DE LAS SIGUIENETES CARACTERISTICAS:
 * INGRESAN UN CONJUNTO n ALTURA DE PERSONAS POR TECLADO. MOSTRAR LA
 * ALTURA PROMEDIO DE LA PERSONAS
 */
public class programa11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,x;
		float altura,suma,promedio;
		System.out.println("cuantas personas hay: ");
		n=sc.nextInt();
		x=1;
		suma=0;
		while (x<=n) {
			System.out.println("ingrese la altura: ");
			altura=sc.nextFloat();
			suma+=altura;
			x++;
		}
		promedio=suma/n;
		System.out.println("altura promedio: "+promedio);
	}

}
