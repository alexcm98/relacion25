import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLESS//
		Scanner sc = new Scanner(System.in);
		int c= 0;
		int f = 0;
		boolean error = true;
		String aux = "";
		
	System.out.println(grados(c,f));
	}
	
	public static int grados(int c,int f){
		//variables//
		Scanner sc = new Scanner(System.in);
		
		boolean error = true;
		String aux = "";
		//entrada//
		do{
			System.out.println("introduces el numero de grados actuales");
			aux = sc.nextLine();
			try{
				c = Integer.parseInt(aux);
				error = false;
			}catch(Exception e){
				System.out.println("error: no has introducido un numero");
				error = true;	
			}
		}while(error == true);
		
		//proceso//
		f = 32+(9*c/5);
		return f;
	}

}
