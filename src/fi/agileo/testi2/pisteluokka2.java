/**
 * 
 */
package fi.agileo.testi2;

import java.util.Scanner;

/**
 * @author oppi
 *
 */
public class pisteluokka2 {
	static Scanner lukija  = new Scanner(System.in);
	public static int lue_kokonaisluku() {
//			throws NumberFormatException {
	String luku = lukija.nextLine();
	return Integer.parseInt(luku);
	}
	private int xPOS;
	private int yPOS;

	public pisteluokka2(int luku1, int luku2) {
		this.xPOS = luku1;
		this.yPOS = luku2;
	}

	public void set_x(int x) {
		this.xPOS = x;
	}
	public void set_y(int y) {
		this.yPOS = y;
	}
	public int get_x() {
		return this.xPOS;
	}
	public int get_y() {
		return this.yPOS;
	}

	public String toString() {
		return "X piste on: " + this.xPOS + " ja y piste on: " + this.yPOS;
	}
	
	
	interface ohjelma {
		public void tulostaa();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] taulukko = new int[2];
		for(int i=0;i<taulukko.length;i++) {
		int lkm = i+1;
			System.out.println("Anna " +lkm +" koordinaatti ");
		try {
			int luku = lue_kokonaisluku();	
			taulukko[i] = luku;
		// System.out.println("Kokonais luku on: " + luku1);	
			}
		// catch (NumberFormatException e) {
			catch (Exception e) { 
			System.out.println("Virheellinen luku");
			System.out.println("luvun pitää olla kokonaisluku");
		 }
		}
		int luku1 = taulukko[0]; 
		int luku2 = taulukko[1];
		pisteluokka2 piste = new pisteluokka2(luku1, luku2);
		// piste.set_x(luku);
		System.out.println(piste);
		
	}

}
