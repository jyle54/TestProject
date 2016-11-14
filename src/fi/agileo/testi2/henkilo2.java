/**
 * 
 */
package fi.agileo.testi2;



/**
 * @author oppi
 *
 */
public class henkilo2 {

	String etuNimi;
	String sukuNimi;
	String puhNumero;
	String ammatti;
	String osoite;
	
	public henkilo2(String enimi, String snimi, String n, String a, String o) {
		this.etuNimi = enimi;
		this.sukuNimi = snimi;
		this.puhNumero = n;
		this.ammatti = a;
		this.osoite = o;
	}
	public void set_etuNimi(String enimi) {
		this.etuNimi = enimi;
	}
	public void set_sukuNimi(String snimi) {
		this.sukuNimi = snimi;
	}
	public void set_puhNumero(String numero) {
		this.puhNumero = numero;
	}
	public void set_ammatti(String ammatti) {
		this.ammatti = ammatti;
	}
	public void set_osoite(String osoite) {
		this.osoite = osoite;
	}
	
	public String getetuNimi() {
		return this.etuNimi;
	} 
	public String getSukuNimi() {
		return this.sukuNimi;
	}
	public String getpuhNumero() {
		return this.puhNumero;
	}
	public String getAmmatti() {
		return this.ammatti;
	} 
	public String getOsoite() {
		return this.osoite;
	}
	
	public String haeEtuNimi() {
		return etuNimi;
	}
	public String haeSukuNimi() {
		return sukuNimi;
	}
	
	
	
	
	}

