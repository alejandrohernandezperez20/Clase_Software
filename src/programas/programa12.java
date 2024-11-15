package programas;

import java.util.Scanner;

/*
 * CONFECCIONAR UN PROGRAMA QUE LEA POR TECLADO
 * TRES NUMEROS DISTINTOS Y NOS MUESTRE EL MAYOR
 */
public class programa12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("ingrese primer valor: ");
		num1=sc.nextInt();
		System.out.println("ingrese segundo valor: ");
		num2=sc.nextInt();	
		System.out.println("ingrese tercer valor: ");
		num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2);
		}else{
			System.out.println(num3);
		}
	}
}
