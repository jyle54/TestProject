/**
 * 
 */
package fi.agileo.testi;
import java.util.Scanner;
// harjoitus 3
/**
 * @author oppi
 *
 */
public class noppa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija  = new Scanner(System.in);
		
		
		System.out.println("Anna nopan heittomaara");
		int lukumaara = lukija.nextInt();
		
		int[] tulostaulukko = new int[13];
		
		for (int i=0;i<lukumaara;i++) {
		// arpoo tuloksen 1 ja 6 väliltä
		int tulos1 = 1 + (int)( Math.random() * 6 );
		int tulos2 = 1 + (int)( Math.random() * 6 );
		int summa = tulos1 + tulos2;
		tulostaulukko[summa]++;
		}
		
		for (int i=0;i<tulostaulukko.length;i++) {
		System.out.println("tulos on " + i + ": " +tulostaulukko[i]);
		}
		
		
		
		lukija.close();
	}

}
