package gitcompartido;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opc=0;
		// prueba 2
		do {
			try {
				System.out.println("1-Operación de Carlos");
				opc=Integer.parseInt(teclado.nextLine());
				switch(opc){
					case 1:
						ClaseDeCarlos.escribir();
						break;
					case 2:
						ClaseDeAdrianO.escribir();
						break;

					case 3:
						ClaseDeCarlos.ClaseDeR.escribir();
						break;
					default:
						ClaseDeRamiro.escribir();

 'master' of https://github.com/carlosbellmont/gitcompartido.git
				
				}	
			} catch (Exception e) {
				System.out.println("Introduce un número válido");
			}
			
		}while(opc!=5);
			

		
        teclado.close();
	}

}