/**
 * 
 */
package fi.agileo.testi2;

/**
 * @author oppi
 *
 */
public class pikseli extends pisteluokka2 {

	String xColor;
	String yColor;
	
	public pikseli(int luku1, int luku2, String x, String y) {
		super(luku1, luku2);
		this.xColor = x;
		this.yColor = y;
		// TODO Auto-generated constructor stub
	}

	public void setXcolor(String x) {
		this.xColor = x;
	}
	public void setYcolor(String y) {
		this.yColor = y;
	}
	public String getXcolor() {
		return this.xColor;
	}
	public String getYcolor() {
		return this.yColor;
	}
	public void tulosta() {
		System.out.println("X pisteen väri on: " + this.xColor + " ja y pisteen väri on:"
				+ " " + this.yColor);
	}
	
	public class uusi implements ohjelma {
		public void tulostaa() {
			System.out.println("Rajapinta toimii");
		}
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] taulukko = new int[2];
		for(int i=0;i<taulukko.length;i++) {
		int lkm = i+1;
			System.out.println("Anna " +lkm +" koordinaatti ");
		try {
			int luku = lue_kokonaisluku();	
			taulukko[i] = luku;
		// System.out.println("Kokonais luku on: " + luku1);	
			}
		// catch (NumberFormatException e) {
			catch (Exception e) { 
			System.out.println("Virheellinen luku");
			System.out.println("luvun pitää olla kokonaisluku");
		 }
		}
		int luku1 = taulukko[0]; 
		int luku2 = taulukko[1];
		String vari1 = "";
		String vari2 = "";
		pikseli pikseli = new pikseli(luku1, luku2, vari1, vari2);
		pikseli.setXcolor("sininen");
		pikseli.setYcolor("punainen");
		//	pisteluokka2 piste = new pisteluokka2(luku1, luku2);
		// piste.set_x(luku);
		System.out.println(pikseli);
		pikseli.tulosta();
		
	//	uusi y = new uusi();
	//	y.tulostaa();
		
	}

	
	}


