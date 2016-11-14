/**
 * 
 */
package fi.agileo.testi4;

/**
 * @author oppi
 *
 */
public class Matkustaja {
	String nimi;
	double paikanHinta;
	String kohde;
	
	public Matkustaja() {
		
	}
	
	public Matkustaja(String n, double hinta, String kohde) {
		this.nimi = n;
		this.paikanHinta = hinta;
		this.kohde = kohde;
	}
	
	
	public String getNimi() {
		return nimi;
	}


	public void setNimi(String nimi) {
		this.nimi = nimi;
	}


	public double getPaikanHinta() {
		return paikanHinta;
	}


	public void setPaikanHinta(double paikanHinta) {
		this.paikanHinta = paikanHinta;
	}


	public String getKohde() {
		return kohde;
	}


	public void setKohde(String kohde) {
		this.kohde = kohde;
	}

	public String toString() {
		return this.nimi + " matkustaa paikkaan " + this.kohde + " hintaan "
				+ this.paikanHinta;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matkustaja pekka = new Matkustaja();
		pekka.setNimi("Pekka");
		pekka.setKohde("Tampere");
		pekka.setPaikanHinta(35.50);
		System.out.println(pekka);
		
		Matkustaja aino = new Matkustaja();
		aino.setNimi("Aino");
		aino.setKohde("Kerava");
		aino.setPaikanHinta(14.30);
		System.out.println(aino);
		
		Matkustaja erkki = new Matkustaja();
		erkki.setNimi("Erkki");
		erkki.setKohde("Kuopio");
		erkki.setPaikanHinta(79.40);
		System.out.println(erkki);
		
		Matkustaja virpi = new Matkustaja("Virpi",18.70, "Järvenpää");
		System.out.println(virpi);
		Matkustaja aimo = new Matkustaja("Aimo",52.80, "Jyväskylä");
		System.out.println(aimo);
	}

}
