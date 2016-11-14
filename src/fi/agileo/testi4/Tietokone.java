/**
 * 
 */
package fi.agileo.testi4;

/**
 * @author oppi
 *
 */
public class Tietokone {
	private String nimi;
	private int ika;
	private double hankintahinta;
	
	public Tietokone(String n, int ika, int hinta) {
		this.nimi = n;
		this.ika = ika;
		this.hankintahinta = hinta;
	}
	
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public int getIka() {
		return ika;
	}

	public void setIka(int ika) {
		this.ika = ika;
	}

	public double getHankintahinta() {
		return hankintahinta;
	}

	public void setHankintahinta(double hankintahinta) {
		this.hankintahinta = hankintahinta;
	}

	public String toString() {
		return "Tietokoneen nimi on " + this.nimi + " koneen ika on " +this.ika + 
				"koneen hinta on " + this.hankintahinta;
	} 
	/**
	 * @param args
	 */

}
