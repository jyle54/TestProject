/**
 * 
 */
package fi.agileo.testi;

/**
 * @author oppi
 *
 */
public class Koira {
	String nimi;
	Kissa jahdattava;
	
	public String toString() {
		return "Koira [nimi=" + nimi + "]";
		
	}

	public void jahtaa(Kissa kissa) {
		// TODO Auto-generated method stub
		jahdattava = kissa;
	}

	

}
