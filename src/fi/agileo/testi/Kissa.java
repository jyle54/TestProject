/**
 * 
 */
package fi.agileo.testi;

/**
 * @author oppi
 *
 */
public class Kissa {
String nimi;
Koira jahtaaja;

public void karkuun (Koira koira) {
	jahtaaja = koira;
}


public String toString() {
	return "Kissa [nimi=" + nimi + "]";
} 


}
