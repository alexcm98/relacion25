package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio = 0.0f;
		double longitud = 0.0f;
		double area = 0.0f;
		boolean error = true;
		String aux = "";
		Scanner sc = new Scanner(System.in);
		// entrada//

		do {
			System.out.println("introduces el numero del radio");
			aux = sc.nextLine();
			try {
				radio = Integer.parseInt(aux);
				error = false;
			} catch (Exception e) {
				System.out.println("error: no has introducido un numero");
				error = true;
			}
		} while (error == true);
		// salida//

		System.out.println("la longitud del circulo es de " + longitud(radio));

		System.out.println("el area del circulo es de " + area(radio));

	}

	public static double longitud(double radio) {

		return 2 * Math.PI * radio;

	}

	public static double area(double radio) {

		return Math.PI * (radio * 2);
	}

}
