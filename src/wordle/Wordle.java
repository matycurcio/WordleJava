package wordle;

import java.util.Random;

public class Wordle {
	String [] listaDePalabras;
	char [] coloresLetras;
	String palabra;
	
	public Wordle (String [] lista) {
		this.listaDePalabras = lista;
		this.palabra = aleatoria();
		this.coloresLetras = new char [5];
	}	
	public String aleatoria () {
		Random r = new Random ();
		int posRandom = r.nextInt(listaDePalabras.length);
		palabra = listaDePalabras[posRandom];
		return palabra;
	}	
	public boolean estaContenida(char caracter) {
		return this.palabra.contains(String.valueOf(caracter));
	}
	public boolean estaEnPosicion(char caracter, int posicion) {
		return this.palabra.charAt(posicion) == caracter;
	}	
	public void verificarPalabra (String input) {
		for (int i=0; i < input.length(); i++) {
			if (estaContenida(input.charAt(i)) && estaEnPosicion(input.charAt(i),i)) {
				coloresLetras[i] = 'v';
			}
			else if (estaContenida(input.charAt(i))) {
				coloresLetras[i] = 'a';
				} else {
					coloresLetras[i] = 'g';
				}
		}
	}	
	public String[] getListaDePalabras() {
		return listaDePalabras;
	}
	public void setListaDePalabras(String[] listaDePalabras) {
		this.listaDePalabras = listaDePalabras;
	}
	public char[] getColoresLetra() {
		return coloresLetras;
	}
	public void setColoresLetras(char[] colorLetra) {
		this.coloresLetras = colorLetra;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
}
