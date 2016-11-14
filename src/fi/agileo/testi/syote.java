/**
 * 
 */
package fi.agileo.testi;
import java.util.Scanner;
// harjoitus 2
/**
 * @author oppi
 *
 */
public class syote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner lukija  = new Scanner(System.in);
		int[] arvosana = new int[6];
		
		while (true) {
		System.out.println("Anna nimi");
		String nimi = lukija.nextLine();	
		if (nimi.isEmpty())
		{
			break;
		}
		System.out.println("Anna arvosana");
		int luku = lukija.nextInt();
		lukija.nextLine();
		
		arvosana[luku]++;
		}
		for (int i=0; i<arvosana.length; i++) {
		System.out.println(i + ": ");
		for (int j=0; j<arvosana[i]; j++)
		{
			System.out.println("*");
			
		}
		lukija.close();
		}
		
		
		
		}

	}


