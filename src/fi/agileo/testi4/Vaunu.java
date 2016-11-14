/**
 * 
 */
package fi.agileo.testi4;

/**
 * @author oppi
 *
 */
public class Vaunu {
	private static final int LUKUMAARA = 2;
	Matkustaja vaunu[];
	
	int lukumaara=0;
	int matkustajia =0;
	
	public Vaunu() {
		this.vaunu = new Matkustaja[LUKUMAARA];
		}
	
	
	public Vaunu(int maksimi) {
		this.vaunu = new Matkustaja[maksimi];		
	}
	
	public boolean lisaaMatkustajia(Matkustaja matkustaja) {
		if (matkustajia < LUKUMAARA) {
		vaunu[matkustajia++] = matkustaja;
		return true;
		}
		else return false;
			}
	
	public void poistaViimeinen() {
		matkustajia--;
		vaunu[matkustajia] = null;
		
	}
	public int paikkojaVapaana() {
		int maksimi = vaunu.length;
		lukumaara = maksimi-matkustajia;
		return lukumaara;
	}
	
	public String toString() {
		String merkit = "";
		for (Matkustaja jasen: this.vaunu) {
			if (jasen == null) continue;
			merkit += " " + jasen.getNimi() + " " + jasen.paikanHinta + " "
					+ jasen.kohde;
			}
		return merkit;
	}
	public double yhteishinta() {
		double yhteishinta = 0;
		for (Matkustaja jasen: this.vaunu) {
			if (jasen == null) continue; // if arrays is longer than it has passangers
			yhteishinta += jasen.paikanHinta;
			}
		// TODO Auto-generated method stub
		return yhteishinta;
	}


	public int getMatkustajia() {
		return matkustajia;
	}


	public void setMatkustajia(int matkustajia) {
		this.matkustajia = matkustajia;
	}


	public Matkustaja[] getVaunu() {
		return vaunu;
	}


	public void setVaunu(Matkustaja[] vaunu) {
		this.vaunu = vaunu;
	}

	
}
