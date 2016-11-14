/**
 * 
 */
package fi.agileo.testi;

/**
 * @author oppi
 *
 */
public class TestiLuokka2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kissa kissa1 = new Kissa();
Kissa kissa2 = new Kissa();
Koira koira = new Koira();

Kissa[] kissat = new Kissa[2];
kissat[0] = kissa1;
kissat[1] = kissa2;

kissa1.nimi = "Mirri";
kissa2.nimi = "Mörri";

koira.nimi = "Musti";

System.out.println("\n" + koira + "\n");

for (int i = 0; i < kissat.length; i++) {
	System.out.println(kissat[i]);
}

koira.jahtaa(kissa1);

kissa1.karkuun(koira);


	}

}
