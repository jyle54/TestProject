/**
 * 
 */
package fi.agileo.testi2;
// harjoitus 5
/**
 * @author oppi
 *
 */
public class testiluokka3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Henkilo pekka = new Henkilo("Pekka", 40, 170 , 80);
	
	Henkilo lasse = new Henkilo();
	lasse.aseta_nimi("Lasse");
	lasse.aseta_ika(23);
	lasse.aseta_paino(45);
	lasse.aseta_pituus(160);
	
	
	System.out.println(pekka);
	pekka.tulosta();
	
	System.out.println(lasse);
	lasse.tulosta();
	}

}
