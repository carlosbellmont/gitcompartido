package gitcompartido;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opc=0;
		
		do {
			try {
				System.out.println("1-Operaci�n de Carlos");
				opc=Integer.parseInt(teclado.nextLine());
				switch(opc){
					case 1:
						ClaseDeCarlos.escribir();
						break;
				
				}	
			} catch (Exception e) {
				System.out.println("Introduce un n�mero v�lido");
			}
			
		}while(opc!=5);
			

		
        teclado.close();
	}

}