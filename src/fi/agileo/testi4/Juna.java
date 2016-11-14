/**
 * 
 */
package fi.agileo.testi4;

/**
 * @author oppi
 *
 */
public class Juna {
	private static final int LUKUMAARA = 9; // 9 vaunua
	Vaunu vaunut[];
	int lukumaara=0;
	int vaunuja =0;
	
	public Juna() {
		this.vaunut = new Vaunu[LUKUMAARA];
		}
	
	
	public Juna(int maksimi) {
			this.vaunut = new Vaunu[maksimi];		
	}
	
	public void lisaaVaunu(Vaunu vaunu) {
		vaunut[vaunuja++] = vaunu;
	//	vaunu.lisaaMatkustajia(matkustaja);
			}
	public void lisaaMatkusta(Matkustaja m) {
		for (int i = 0; i < vaunuja; i++) {
			if (vaunut[i].lisaaMatkustajia(m)) // boolean palautus ja vaunun koko tarkistus
				return;
		}
		System.out.println("Junassa ei ollut tilaa");
	}
	
	
	public int vaunujaVapaana() {
		int maksimi = vaunut.length;
		lukumaara = maksimi-vaunuja;
		return lukumaara;
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
		
			
		Juna juna = new Juna(); // tilaa 9 vaunuille
		
		
		for (int i = 0; i < 9; i++) {
			Vaunu vaunu1 = new Vaunu();
			juna.lisaaVaunu(vaunu1);
		}
		int tila = juna.vaunujaVapaana();
		System.out.println("vaunuja vapaana " +tila);
		juna.lisaaMatkusta(pekka);
		juna.lisaaMatkusta(aimo);
		juna.lisaaMatkusta(virpi);
		juna.lisaaMatkusta(eki);
	
	}

}
