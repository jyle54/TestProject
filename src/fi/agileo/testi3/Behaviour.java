package fi.agileo.testi3;

public enum Behaviour {
agressiivinen(1),
tavallinen (0.7),
rauhallinen (0.4);

private final double arvo;
	

 Behaviour(double arvo) {
	this.arvo = arvo;
	
}


public double getArvo() {
	return arvo;
}
 
}
