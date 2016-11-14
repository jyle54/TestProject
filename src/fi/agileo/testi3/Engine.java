/**
 * 
 */
package fi.agileo.testi3;

/**
 * @author oppi
 *
 */
public class Engine {
private String power;
private int numOfCylinders;
private int brokenCylinders;

public Engine(String power, int numOfCyl, int broken) throws VaaraArvoException {
	this.power = power;
	this.numOfCylinders = numOfCyl;
	this.brokenCylinders = broken;
	
	if (numOfCylinders < 0) {
		throw new VaaraArvoException();
	}
	
	if (brokenCylinders < 0) {
		throw new VaaraArvoException();
	}
	
	if (numOfCylinders < brokenCylinders )
	{
		throw new VaaraArvoException();
	}
	
	if (power == null) {
		throw new VaaraArvoException();
	}
}

public String getPower() {
	return power;
}

public void setPower(String power) {
	this.power = power;
}

public int getNumOfCylinders() {
	return numOfCylinders;
}

public void setNumOfCylinders(int numOfCylinders) {
	this.numOfCylinders = numOfCylinders;
}

public int getBrokenCylinders() {
	return brokenCylinders;
}

public void setBrokenCylinders(int brokenCylinders) {
	this.brokenCylinders = brokenCylinders;
}

public int meneRikki() {
	brokenCylinders = 1 + (int)( Math.random() *
	(numOfCylinders -brokenCylinders) );
	
	return brokenCylinders; 
}

}
