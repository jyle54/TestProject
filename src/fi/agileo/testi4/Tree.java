/**
 * 
 */
package fi.agileo.testi4;

/**
 * @author oppi
 *
 */
public class Tree {

	private String laji;
	private double vuosikasvu;
	private int ika;
	
	public Tree() {
		
	}
	
	private void lisaaVuosia(int i) {
		// TODO Auto-generated method stub
		ika +=i;
	}
	
	
	public String toString() {
		double korkeus = this.ika * this.vuosikasvu;
		return "Puun laji on " + this.laji + "Puun korkeus on " + korkeus; 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree manty = new Tree();

		 manty.laji = "Mänty";

		 manty.vuosikasvu = 0.4;

		 manty.ika = 12;

		 System.out.println(manty);     // tulostaa puun lajin ja korkeuden tällä hetkellä (0.4 m*12=4.8 m)

		 manty.lisaaVuosia(5); // lisää ikää 5 vuodella

		 System.out.println(manty); // tulostaa puun lajin ja korkeuden tällä hetkellä (0.4 m*17=6.8 m)
	
	Tree kuusi = new Tree();
	kuusi.laji = "Kuusi";
	kuusi.vuosikasvu = 0.6;
	kuusi.ika = 12;
	System.out.println(kuusi);
	kuusi.lisaaVuosia(5);
	System.out.println(kuusi);
	
	Tree koivu = new Tree();
	koivu.laji = "Koivu";
	koivu.vuosikasvu = 0.8;
	koivu.ika = 12;
	System.out.println(koivu);
	koivu.lisaaVuosia(5);
	System.out.println(koivu);
	

	}
	

}
