/**
 * 
 */
package fi.agileo.testi3;

/**
 * @author oppi
 *
 */
public class AutoKisat {

	/**
	 * @param args
	 * @throws VaaraArvoException 
	 */
	public static void main(String[] args) throws VaaraArvoException {
		// TODO Auto-generated method stub
Engine moottori = new Engine("teho1", 16, 1);
Engine bensa = new Engine("teho2", 16, 2);
Engine disel = new Engine("teho3", 16, 3);

car opel = new car("Opel", "malli1", 160, moottori, "Mika");
car renault = new car("Renault", "clio", 170, bensa, "Timo");
car mersu = new car("mersu", "malli2", 200, disel, "Juha");


Driver ajaja1 = new Driver(opel, "Mika", Behaviour.agressiivinen);
Driver ajaja2 = new Driver(renault, "Timo", Behaviour.rauhallinen);
Driver ajaja3 = new Driver(mersu, "Juha", Behaviour.tavallinen);
	}

}
