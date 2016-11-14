/**
 * 
 */
package fi.agileo.testi3;

/**
 * @author oppi
 *
 */
public class Driver {
car ajaja;	
String name;
Behaviour luonne;

public Driver(car ajaja, String name, Behaviour luonne) throws VaaraArvoException{
	this.ajaja = ajaja;
	this.name = name;
	this.luonne = luonne;
	if (name == null || name == "") {
		throw new VaaraArvoException();
	}
	if (ajaja == null) {
		throw new VaaraArvoException();
	}
	 
}

public car getAjaja() {
	return ajaja;
}

public void setAjaja(car ajaja) {
	this.ajaja = ajaja;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Behaviour getLuonne() {
	return luonne;
}

public void setLuonne(Behaviour luonne) {
	this.luonne = luonne;
}
public double aja(double tuntia)  {
	double paluuArvo = 0;
	double ajotapa = luonne.getArvo();
	paluuArvo = ajaja.laskeNopeus() * tuntia * ajotapa; 
	return paluuArvo;
}


}
