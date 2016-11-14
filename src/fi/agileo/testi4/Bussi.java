/**
 * 
 */
package fi.agileo.testi4;

/**
 * @author oppi
 *
 */
public class Bussi {
	private static final int LUKUMAARA = 10;
	Matkustaja matkustajat[];
	int lukumaara=0;
	int matkustajia =0;
	
	public Bussi() {
		this.matkustajat = new Matkustaja[LUKUMAARA];
	}
	
	public Bussi(int maksimi) {
		this.matkustajat = new Matkustaja[maksimi];
	}
	
	public void lisaaMatkustajia(Matkustaja matkustaja) {
		matkustajat[matkustajia++] = matkustaja;		
			}
	
	public void poistaViimeinen() {
		matkustajia--;
		matkustajat[matkustajia] = null;
		
	}
	public int paikkojaVapaana() {
		int maksimi = matkustajat.length;
		lukumaara = maksimi-matkustajia;
		return lukumaara;
	}
	
	public String toString() {
		String merkit = "";
		for (Matkustaja jasen: this.matkustajat) {
			if (jasen == null) continue;
			merkit += " " + jasen.getNimi() + " " + jasen.paikanHinta + " "
					+ jasen.kohde;
			}
		return merkit;
	}
	public double yhteishinta() {
		double yhteishinta = 0;
		for (Matkustaja jasen: this.matkustajat) {
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matkustaja pekka = new Matkustaja("Pekka", 35.50, "Tampere");
		Matkustaja aino = new Matkustaja("Aino", 14.30, "Kerava");
		Matkustaja eki = new Matkustaja("Erkki",79.40, "Kuopio");
		Matkustaja virpi = new Matkustaja("Virpi", 18.70, "Järvenpää");
		Matkustaja aimo = new Matkustaja("Aimo", 52.80, "Jyväskylä");
		Matkustaja emmi = new Matkustaja("Emmi", 38.20, "Orivesi");
		Matkustaja onni = new Matkustaja("Onni", 35.50, "Tampere");
		
		Bussi pikabussi = new Bussi(20); // 20-paikkainen bussi
		pikabussi.lisaaMatkustajia(pekka);
		pikabussi.lisaaMatkustajia(aino);
		pikabussi.lisaaMatkustajia(eki);
		pikabussi.lisaaMatkustajia(virpi);
		pikabussi.lisaaMatkustajia(aimo);
		pikabussi.lisaaMatkustajia(emmi);
		
		int luku = pikabussi.matkustajia;
		int vapaana = pikabussi.paikkojaVapaana();
		System.out.println("Matkustajia on " +luku);
		System.out.println("Bussissa paikkoja vapaana " +vapaana);
		System.out.println(pikabussi);
		
		System.out.printf("Matkustajien liput maksavat yhteensä %.2f euroa",
		         pikabussi.yhteishinta());
		System.out.println();
		System.out.println();
		
		pikabussi.poistaViimeinen();
		int luku2 = pikabussi.matkustajia;
		System.out.println("Matkustajia on " +luku2);
		int vapaana1 = pikabussi.paikkojaVapaana();
		System.out.println("Bussissa paikkoja vapaana " +vapaana1);
		System.out.println(pikabussi);
		System.out.printf("Matkustajien liput maksavat yhteensä %.2f euroa",
		         pikabussi.yhteishinta());
		System.out.println();
		System.out.println();
		
		pikabussi.lisaaMatkustajia(onni);
		int luku3 = pikabussi.matkustajia;
		System.out.println("Matkustajia on " +luku3);
		int vapaana2 = pikabussi.paikkojaVapaana();
		System.out.println("Bussissa paikkoja vapaana " +vapaana2);
		System.out.println(pikabussi);
		System.out.printf("Matkustajien liput maksavat yhteensä %.2f euroa",
		         pikabussi.yhteishinta());
		System.out.println();
		
		
	}

	

}
