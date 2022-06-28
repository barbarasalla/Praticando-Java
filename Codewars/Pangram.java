package Desafios;

public class Pangram {
	
	public static void main(String[] args) {
		
		String s = "The quick brown fox jumps over the lazy dog";
		boolean [] alfa = new boolean [26];
		int index=0;
		boolean pangram = true;
		
		s = s.toLowerCase(); // transformar todos os caracteres em minusculos
		
		for(int i=0; i< s.length(); i++) {
			
			char c = s.charAt(i); //Guardar cada caractere no c  
			
			if (c >= 'a' && c <='z') { // verificar se c está entre a e z
				index = c - 'a';				
			}			
			alfa[index] = true; //Guardar o indice de cada letra no array alfa
			
		}
		
		for (int i=0; i < alfa.length; i++) {
			if(alfa[i] == false) {	
				pangram = false;
			}
		}	
		
		System.out.println(pangram);
	
	}

	
}
