/**
 * 
 */
package fi.agileo.testi2;

import java.util.ArrayList;





/**
 * @author oppi
 *
 */
public class puhelinluettelo {

	//String nimi;
	ArrayList<henkilo2> jasenet;
	
	public puhelinluettelo() {
		this.jasenet = new ArrayList<>();
	}
	public void lisaaJasen(henkilo2 henkilo) {
		this.jasenet.add(henkilo);
	}
	public void poistaJasen(henkilo2 henkilo) {
		this.jasenet.remove(henkilo);
	}
	public String toString() {
	        String puhJasenet = "";

	        for (henkilo2 jasen : this.jasenet) {
	        	puhJasenet += "  " + jasen.getetuNimi() + " " + jasen.getSukuNimi() + " " + 
	        			jasen.getpuhNumero() + jasen.getAmmatti() + jasen.getOsoite() + "\n";
	        }
	        
	        return puhJasenet;
	       }
	
	public String haeEtuNimi(String nimi) {
		String henkilo = "";
		for (henkilo2 jasen : this.jasenet) {
		    if (nimi.equals(jasen.getetuNimi())) {
		    	henkilo +=jasen.getetuNimi() + " " + jasen.getSukuNimi() + " " + 
	        			jasen.getpuhNumero() + jasen.getAmmatti() + jasen.getOsoite();
			return henkilo;
		    }
		}
		return null;
	    }
	
	public String haeSukuNimi(String nimi) {
		String henkilo = "";
		for (henkilo2 jasen : this.jasenet) {
		    if (nimi.equals(jasen.haeSukuNimi())) {
		    	henkilo +=jasen.getetuNimi() + " " + jasen.getSukuNimi() + " " + 
	        			jasen.getpuhNumero() + jasen.getAmmatti() + jasen.getOsoite();
		    	return henkilo;
		    }
		}
		return null;
	    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puhelinluettelo puh = new puhelinluettelo();
		
		henkilo2 pekka = new henkilo2("Pekka", "Mottola", "040-555555 ", "insinoori ", "tupatie 1 ");
		henkilo2 matti = new henkilo2("Matti", "Alahuhta", "040-555777 ", "autonkuljettaja ", "sepäntie 2 ");
		henkilo2 juha = new henkilo2("Juha", "Tera", "050-555888 ", "opettaja ", "alatie 11 ");
		henkilo2 lauri = new henkilo2("Lauri", "Huhta", "050-545234 ", "lahihoitaja ", "tupatie 5 ");
		
		puh.lisaaJasen(pekka);
		puh.lisaaJasen(matti);
		puh.lisaaJasen(juha);
		puh.lisaaJasen(lauri);
		
		System.out.println(puh);
		
		String etunimi = puh.haeEtuNimi("Pekka");
		System.out.println("Haetaan etunimellä: Pekka");

		if (etunimi == null) {
		    System.out.println("Henkilöä ei löytynyt etunimellä!");
		} else {
		    System.out.println("Henkilö: " + etunimi);
		}
		
		String sukunimi = puh.haeSukuNimi("Alahuhta");
		System.out.println("Haetaan sukunimellä: Alahuhta");

		if (sukunimi == null) {
		    System.out.println("Henkilöä ei löytynyt sukunimellä!");
		} else {
		    System.out.println("henkilö: " + sukunimi);
		}
		
	}

}
