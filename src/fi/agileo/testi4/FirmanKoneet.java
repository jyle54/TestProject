/**
 * 
 */
package fi.agileo.testi4;

/**
 * @author oppi
 *
 */
public class FirmanKoneet {

	private static final int LUKUMAARA = 10; 
	Tietokone tietokoneet[];
	int maksimi;
	int koneitaHankittu =0;

	
	public FirmanKoneet(int lukumaara) {
        this.tietokoneet = new Tietokone[lukumaara];
        maksimi = lukumaara;
	}

	public FirmanKoneet() {
        this.tietokoneet = new Tietokone[LUKUMAARA];
        
	}


	public int getKoneitaHankittu() {
		return koneitaHankittu;
	}

	public void setKoneitaHankittu(int koneitaHankittu) {
		this.koneitaHankittu = koneitaHankittu;
	}

	
	public void lisaaKone(Tietokone kone) {
		if (koneitaHankittu < maksimi) {
		tietokoneet[koneitaHankittu++] = kone;
		}
		else {
		System.out.println("koneita maksimimäärä");	
		}
		}
	
	
	public double yhteishinta() {
		double hinta = 0;
		for (Tietokone jasen: this.tietokoneet){
		hinta += jasen.getHankintahinta();
		}
		return hinta;
	}
	public String toString() {
		String merkit = "";
		for (Tietokone jasen: this.tietokoneet){
			merkit += " " + jasen.getNimi() + " " +jasen.getIka() + " " + jasen.getHankintahinta();
			}
		return merkit;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tietokone kone = new Tietokone("HP Elitebook", 5, 650);
		Tietokone kone2 = new Tietokone("Apple macbook", 2, 1190);
		Tietokone kone3 = new Tietokone("Lenovo thinkbad", 3, 790);
		
		FirmanKoneet firma = new FirmanKoneet(3);
	//	int value = firma.getKoneitaHankittu();
	//	System.out.println(value);
		
		firma.lisaaKone(kone);
		firma.lisaaKone(kone2);
		firma.lisaaKone(kone3);
		
		double loppuhinta = firma.yhteishinta();
		int koneita = firma.getKoneitaHankittu();
		
		System.out.println(loppuhinta);
		System.out.println(koneita);
		
		System.out.println(firma);
		
	}

}
