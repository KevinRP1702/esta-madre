
public class Frases {
	
	String frase;
	
	public Frases(String frase) {
		this.frase = frase;
	}
	
	public void palabras(String frase) {
		String[] palabras = frase.split("\\s+");
		
		System.out.println("Palabras incluidas en la frase:");
		for(int i = 0; i < palabras.length; i++)
		{
			System.out.println(palabras[i] + " - Longitud: " + palabras[i].length());
		}
	}
}
