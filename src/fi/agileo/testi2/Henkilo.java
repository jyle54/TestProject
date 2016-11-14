/**
 * 
 */
package fi.agileo.testi2;
// Harjoitus 5
/**
 * @author oppi
 *
 */
public class Henkilo {

	/**
	 * @param args
	 */
private String nimi;
private int ika;
private int pituus;
private int paino;

public Henkilo() {
	
}

public Henkilo(String nimi, int ika, int pituus, int paino) {
	this.nimi = nimi;
	this.ika = ika;
	this.pituus = pituus;
	this.paino = paino;
}

public void aseta_ika(int arvo) {
	this.ika = arvo;
}

public void aseta_paino(int paino) {
	this.paino = paino;
}

public void aseta_pituus(int pituus) {
	this.pituus = pituus;
}

public void aseta_nimi(String nimi) {
	this.nimi = nimi;
}

public String palauta_nimi() {
	return this.nimi;
}

public int palauta_ika() {
	return this.ika;
}
public int palauta_pituus() {
	return this.pituus;
}
public int palauta_paino() {
	return this.paino;
}

public void tulosta() {
	System.out.println("Henkilön ika on " +this.ika);
}

public String toString() {
	return "Henkilön nimi on " + this.nimi + " ,ika on " + this.ika + 
			" ,pituus on " + this.pituus + " ja paino on " +this.paino;
} 

}
