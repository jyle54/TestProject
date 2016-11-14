/**
 * 
 */
package fi.agileo.testi2;

import java.util.Scanner;

/**
 * @author oppi
 *
 */
public class Palindromi {

	private static Scanner input = new Scanner(System.in);
	String sana; 
	
	public Palindromi(String sana) {
		this.sana = sana;
	}
	
	public String getSana() {
		return sana;
	}

	public void setSana(String sana) {
		this.sana = sana;
	}

	public boolean palautus(String merkkijono) {
		sana = merkkijono;
		String tulos = kaanna(sana);
		if (tulos.equals(merkkijono)) {
			return true;
		}
		else
			return false;
	    // return merkkijono.equals(kaanna(merkkijono));
	}
	
	public static String kaanna(String merkkijono) {
	    String tulos = "";
	    for (int i = 0; i < merkkijono.length(); i++) {
	        char merkki = merkkijono.charAt(i);
	        tulos = merkki + tulos;
	    }
	    return tulos;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Anna sana: ");
		String sana = input.nextLine();
		Palindromi palindromi = new Palindromi(sana);
		//String tulos = palindromi.getSana();
		if (palindromi.palautus(sana)) {
		    System.out.println("Sana on palindromi.");
		} else {
		    System.out.println("Sana ei ole palindromi.");
		}
	}

}
