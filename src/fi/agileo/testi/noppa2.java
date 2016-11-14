/**
 * 
 */
package fi.agileo.testi;
// Harjoitus 3b
/**
 * @author oppi
 *
 */
public class noppa2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int toisto = 1000;
int lkm = 0;
for (int i=0;i<toisto;i++) {
	int tulos = 1 + (int)( Math.random() * 6 );
	if (tulos == 6)
	{
		lkm++;
	}
	System.out.println("Tulos on: " +tulos);
} 
double tod = ((double)lkm / toisto) * 100;
System.out.println("6 todennäköisyys on: " + tod);

	}

}
