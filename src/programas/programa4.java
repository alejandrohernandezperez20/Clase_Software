package programas;

import java.util.Scanner;

/*
 * SE DEBE DESARROLLAR UN PROGRAMA QUE PIDA EL INGRESO DEL PRECIO DE
 * UN ARTICULO Y LA CANTIDAD QUE LLEVA EL CLIENTE,MOSTRAR LO QUE DEBE
 * ABONAR EL COMPRADOR
 * 
 * */
public class programa4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cantidad;
		float precio;
		float importe;
		try {
			System.out.println("ingrese la cantidad de articulos a llevar: ");
			cantidad=sc.nextInt();
			System.out.println("ingrese el valor unitario de articulos a llevar: ");
			precio=sc.nextFloat();
			importe=precio*cantidad;
			System.out.print("importe total a pagar es : "+importe);
		}catch(Exception e) {
			System.out.print("Error TIENE QUE SER EN NUMEROS");
		}
	}

}
