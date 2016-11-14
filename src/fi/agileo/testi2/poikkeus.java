/**
 * 
 */
package fi.agileo.testi2;

import java.util.Scanner;

/**
 * @author oppi
 *
 */
public class poikkeus {
int luku;
int koko;
	
	public poikkeus(int luku, int koko)  {
		this.luku = luku;
		this.koko = koko;
	
	}
	
static Scanner lukija  = new Scanner(System.in);
public static int lue_kokonaisluku() {
int luku = lukija.nextInt();


if (luku < 0)
{
	throw new IllegalArgumentException("Arvosanan tulee olla välillä 0-100 tai 1000-5000");
}
else if (luku > 100 && luku < 1000)
	throw new IllegalArgumentException("Arvosanan tulee olla välillä 0-100 tai 1000-5000");
else if (luku > 5000)
	throw new IllegalArgumentException("Arvosanan tulee olla välillä 0-100 tai 1000-5000");
else

	return luku;
}

public static int tee_taulukko() {
	int koko = lukija.nextInt();
	return koko;
}

/*
public class RajaPoikkeus extends Exception
{
  public RajaPoikkeus() {
    super("virhe! rajat ylitetty");
  }
  public RajaPoikkeus(int ar,int yr) {
    super("virhe!rajat"+ar+","+yr+"ylitetty");
  }
  }
  */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Anna taulukon koko");
		int koko = tee_taulukko();
		int[] taulukko = new int[koko];

for (int i=0;i<taulukko.length;i++) {
System.out.println("Anna kokonaisluku 0-100 tai 1000-5000");
 try {
	int luku = lue_kokonaisluku();		
	System.out.println("Kokonais luku on: " + luku);	
	taulukko[i] = luku;
	}
 catch (Exception e) {
	System.out.println(e.getMessage());
 }

}

for (int j=0;j<taulukko.length;j++){
System.out.println("Kokonais luvut ovat: " + taulukko[j]);
}
		}
/*
catch (NumberFormatException e) {
    System.out.println(e);
}
*/
	}

