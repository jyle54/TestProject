/**
 * 
 */
package fi.agileo.testi2;

/**
 * @author oppi
 *
 */
public class Yhteystieto {
	private String etu;
    private String suku;

    public Yhteystieto(String etu, String suku) {
        this.etu = etu;
        this.suku = suku;

}

	public String getEtu() {
		return etu;
	}

	public void setEtu(String etu) {
		this.etu = etu;
	}

	public String getSuku() {
		return suku;
	}

	public void setSuku(String suku) {
		this.suku = suku;
	}

    public String toString() {
        return suku + ", " + etu + "\t";
    }
}
