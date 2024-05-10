
public class Numeros {

	String numeros; 
	String[] pares;
	int indicePar = 0;
	
	public Numeros(String numeros) {
		this.numeros = numeros;
	}
	
	public void pares(String numeros) {
		String[] valores = numeros.split("\\s+");
		
		int cont = 0;
		
		for(int i = 0; i < valores.length; i++)
		{
			if((Integer.valueOf(valores[i]) % 2) == 0) {
				cont++;
			}
		}
		
		pares = new String [cont];
		for(int i = 0; i < valores.length; i++)
		{
			if((Integer.valueOf(valores[i]) % 2) == 0) {
				pares[indicePar] = valores[i];
				indicePar++;
				
			}
		}
		
		System.out.println("Valores de la lista que son pares: ");
		for(int i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}
	}
}
