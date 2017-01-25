package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//entrada//
		
		float km = 0.0f;
		float m = 0.0f;
		boolean error = true;
		String aux = "";
		Scanner sc = new Scanner(System.in);
		
		//entrada//
	do{	
	   System.out.println("introduce los kilometros por hora");
	   aux = sc.nextLine();
	   try {
		km = Integer.parseInt(aux);
		error = false;
	   } catch (Exception e) {
		System.out.println("error: no has introducido un numero");
		error = true;
	   }
   } while (error == true);
	
	
	System.out.println("los kilometros hora equivalen a :"+metros(km)+"metros por segundo");
		
	}
	
	public static float metros(float km){
		
		
		return (km*1000)/3600;
	}

}
