/**
 * 
 */
package fi.agileo.testi2;
// harjoitus 7
/**
 * @author oppi
 *
 */
public class pisteluokka {
private int xPOS;
private int yPOS;

public pisteluokka() {
	
}

public void set_x(int x) {
	this.xPOS = x;
}
public void set_y(int y) {
	this.yPOS = y;
}
public int get_x() {
	return this.xPOS;
}
public int get_y() {
	return this.yPOS;
}

public String toString() {
	return "X piste on: " + this.xPOS + " ja y piste on: " + this.yPOS;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
pisteluokka piste = new pisteluokka();
piste.set_x(10);
piste.set_y(20);

System.out.println(piste);		
	}

}
