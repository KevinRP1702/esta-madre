import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Menu");
			System.out.println("1.-");
			System.out.println("2.- Frases");
			System.out.println("3.- Numeros pares");
			System.out.println("4.- Salir");
			System.out.print("Opcion:");
			opcion = lector.nextInt();
			
			lector.nextLine();
			
			switch(opcion) {
			case 1:
				break;
				
			case 2:
				System.out.print("Ingrese la frase:");
				String input = lector.nextLine();
				
				Frases frase = new Frases(input);
				
				frase.palabras(input);
				break;
				
			case 3:
				System.out.print("Ingrese los numeros separados por espacios:"); 
				input = lector.nextLine();
				
				Numeros numeros = new Numeros(input);
				
				numeros.pares(input);
				break;
			}
		}while(opcion != 4);
		

	}

}
