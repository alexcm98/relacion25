package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//entrada//
		       
				float c1 = 0.0f;
				float c2 = 0.0f;
				boolean error = true;
				String aux = "";
				Scanner sc = new Scanner(System.in);
				
				//entrada//
			do{	
			   System.out.println("introduce la longitud del primer cateto");
			   aux = sc.nextLine();
			   try {
				c1 = Integer.parseInt(aux);
				error = false;
			   } catch (Exception e) {
				System.out.println("error: no has introducido un numero");
				error = true;
			   }
		   } while (error == true);

			
			do{	
				   System.out.println("introduce la longitud del segundo cateto");
				   aux = sc.nextLine();
				   try {
					c2 = Integer.parseInt(aux);
					error = false;
				   } catch (Exception e) {
					System.out.println("error: no has introducido un numero");
					error = true;
				   }
			   } while (error == true);

		System.out.println("la hipotenusad del triangulo es de "+resultado(c1,c2));
	}
	
	
	public static float resultado(float c1,float c2){
		
		
		return c1*2 + c2*2;
	}

}
