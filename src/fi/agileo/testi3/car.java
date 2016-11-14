package fi.agileo.testi3;

public class car {
private String mark;
private String model;
private int topSpeed;
Engine engine;
private String driver;

public car(String mark, String model, int Speed, Engine engine, String driver) throws VaaraArvoException {
	this.mark = mark;
	this.model = model;
	this.topSpeed = Speed;
	this.engine = engine;
	this.driver = driver;
	if (mark == null || mark == "") {
		throw new VaaraArvoException();
	}
	
	if (model == null || model == "") {
		throw new VaaraArvoException();
	}
	
	if (driver == null || driver =="") {
		throw new VaaraArvoException();
	}
	
	if (topSpeed == 0) {
		throw new VaaraArvoException();
	}
	
	if (engine == null) {
		throw new VaaraArvoException();
	}
	
}

public String getMark() {
	return mark;
}

public void setMark(String mark) {
	this.mark = mark;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getTopSpeed() {
	return topSpeed;
}

public void setTopSpeed(int topSpeed) {
	this.topSpeed = topSpeed;
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

public String getDriver() {
	return driver;
}

public void setDriver(String driver) {
	this.driver = driver;
}
 
public double laskeNopeus() {
	int paluuArvo = 0;
	paluuArvo = (engine.getNumOfCylinders() - engine.getBrokenCylinders()) * topSpeed; 
	return paluuArvo;
}

}
