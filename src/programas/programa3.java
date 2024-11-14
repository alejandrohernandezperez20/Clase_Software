package programas;

import java.util.Scanner;

/*REALIZAR UN PROGRAMA QUE EJECUTE LA CARGA DEL LADO DE UN CUADRADO,
 * MUESTRE POR PANTALLA EL PERIMETRO DEL MISMO*/
public class programa3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lado,perimetro;
		try {
			System.out.println("Ingrese el lado del cuadrado: ");
			lado=sc.nextInt();
			perimetro=lado*4;
			System.out.println("El perimetro de un cuadrado es: "+perimetro);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR TIENES QUE ESCRIBIR NUMERO NO EN LETRA");
		}
	}

}
