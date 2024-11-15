package programas;

import java.util.Scanner;

/*
 * DESARROLLAR UN PROGRAMA QUE PERMITA DE 10 VALORES POR TECLADO
 * NOS MUESTRE POSTERIORMENTE LA SUMA DE LOS VALORES INGRESADOS Y SU PROMEDIO
 */
public class programa10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,suma,valor,promedio;
		x=1;
		suma=0;
		while(x<=10) {
			System.out.println("Ingresar un valor");
			valor=sc.nextInt();
			suma+=valor;
			x++;
		}
		promedio=suma/10;
		System.out.println("la suma de los valores: "+suma+" y el promedio "+promedio);
	}

}
