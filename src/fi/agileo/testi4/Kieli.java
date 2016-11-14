/**
 * 
 */
package fi.agileo.testi4;

import fi.agileo.testi.Kissa;

/**
 * @author oppi
 *
 */
public class Kieli {

	String name;
	String code;
	
	public Kieli() {
		
	}
	public Kieli(String n, String c){
		this.name = n;
		this.code = c;
	} 
	
	public void tulosta() {
		System.out.println("Kieli on " + this.name + " ja code on " +this.code);
	}
	
	public String toString() {
		return "Kieli on " + this.name + " ja code on " + this.code;
	} 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kieli Suomi = new Kieli();
Suomi.name = "Suomi";
Suomi.code = "fi";
Suomi.tulosta();

Kieli Ruotsi = new Kieli();
Ruotsi.name = "Ruotsi";
Ruotsi.code = "se";
Ruotsi.tulosta();

Kieli Englanti = new Kieli();
Englanti.name = "English";
Englanti.code = "com";
Englanti.tulosta();

Kieli[] kielet = new Kieli[3];

kielet[0] = Suomi;
kielet[1] = Ruotsi;
kielet[2] = Englanti;

for(int i=0;i<kielet.length; i++)
{
System.out.println("Kielet on " +kielet[i]);	
}
	}

}
