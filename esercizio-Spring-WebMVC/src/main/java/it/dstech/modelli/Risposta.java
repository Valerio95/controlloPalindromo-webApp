package it.dstech.modelli;

import java.util.ArrayList;
import java.util.List;

public class Risposta {
private int numeroParole;
private int numeroPalindromi;
private List<String> listaPalindromi= new ArrayList<String>();;
public int getNumeroParole() {
	return numeroParole;
}
public void setNumeroParole(int numeroParole) {
	this.numeroParole = numeroParole;
}
public int getNumeroPalindromi() {
	return numeroPalindromi;
}
public void setNumeroPalindromi(int numeroPalindromi) {
	this.numeroPalindromi = numeroPalindromi;
}

public List<String> getListaPalindromi() {
	return listaPalindromi;
}
public void setListaPalindromi(List<String> listaPalindromi) {
	this.listaPalindromi = listaPalindromi;
}
@Override
public String toString() {
	return "Risposta [numeroParole=" + numeroParole + ", numeroPalindromi=" + numeroPalindromi + ", listaPalindromi="
			+ listaPalindromi + "]";
}



}
