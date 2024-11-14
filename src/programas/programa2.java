package programas;

import java.util.Scanner;

/*RELAIZAR LA CARGA DE DOS NUMERO ESNTEROS POR TECLADO E IMPRIMIR
SU SUMA*/
public class programa2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num1,num2,suma,producto;
		try {
			System.out.println("Ingrese primer valor: ");
			num1=teclado.nextInt();
			System.out.println("Ingrese segundo valor: ");
			num2=teclado.nextInt();
			suma=num1+num2;
			producto=num1*num2;
		System.out.println("la suma de los dos valores es: "+suma+"\nla multiplicacion de los dos valoreses: "+producto);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR TIENES QUE PONER NUMEROS NO EN LETRA");
		}
	}

}
