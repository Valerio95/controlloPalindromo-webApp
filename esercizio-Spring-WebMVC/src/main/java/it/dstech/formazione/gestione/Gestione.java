package it.dstech.formazione.gestione;

import java.util.ArrayList;

public class Gestione {

	public int contaParole (String testo) {
		String[] parole=testo.split(" ");
	int numeroParole =	parole.length;
	return numeroParole;
	}
	
	
	
	public ArrayList<String> listaPalindromi(String testo){
		ArrayList<String> lista =new ArrayList<String>();
		String[] parole=testo.split(" ");
		for(int i=0;i<parole.length;i++) {
		
			if(controlloPalindromo(parole[i])) {
				
				lista.add(parole[i]);
			}
		
		}

		return lista;
		
		
	}
	
	
	
	public  boolean controlloPalindromo (String parola) {
		char[] caratteri=	parola.toCharArray();
		int lunghezzaParola=parola.length()-1;

		for(int i=0;i<caratteri.length;i++) {
			if(caratteri[i]!=caratteri[lunghezzaParola]) {
				
				return false;
			}
			lunghezzaParola--;
		}
		return true;
	}
}
