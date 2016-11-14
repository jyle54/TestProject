/**
 * 
 */
package fi.agileo.testi;

/**
 * @author oppi
 *
 */
class Computer {
	private String display; 
	int numberOfProsessors; // 1,2,4 CPU
	String model; // Elitebook
	private String name; // hp
	String[] neworkConnections; // wlan, ethernet, etc
	
	public Computer(String name, String model, int numberOfProsessors, String netdevice1, String netdevice2) {
		this.name = name;
		this.model = model;
		this.numberOfProsessors = numberOfProsessors;
		this.neworkConnections = new String[2];
		this.neworkConnections[0] = netdevice1;
		this.neworkConnections[1] = "ethernet";
	}
	public Computer() {
		this.neworkConnections = new String[2];
		this.neworkConnections[0] = "wlan";
		this.neworkConnections[1] = "ethernet";
	}
	
	public String toString() {
		return this.name + "," + this.model + "," + this.numberOfProsessors
				+ "," + this.neworkConnections[0] + "," + this.neworkConnections[1];
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setProsessors(int number) {
		this.numberOfProsessors = number;
	} 
	public void setNetwork(String eka, String toka ) {
		this.neworkConnections[0] = eka;
		this.neworkConnections[1] = toka;
	}
	public void setNetworkdevice1(String eka) {
		this.neworkConnections[0] = eka;
	}

	public void setNetworkdevice2(String toka) {
		this.neworkConnections[0] = toka;
	}

	public String getName() {
		return this.name;
	}
	public String getModel() {
		return this.model;
	}
	public int getProsessors() {
		return this.numberOfProsessors;
	}
	public String getnetdevice1() {
		return this.neworkConnections[0];
	}
	public String getnetdevice2() {
		return this.neworkConnections[1];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Computer hp = new Computer();
hp.setName("hp");
hp.setModel("Elitebook");
hp.setProsessors(2);
hp.setNetworkdevice1("wlan");
hp.setNetworkdevice2("eth");


System.out.println(hp);
System.out.println("hp:n nimi on " + hp.getName());
System.out.println("hp:n model on " + hp.getModel());


Computer apple = new Computer("apple", "mac", 16, "wlan", "eth");
System.out.println(apple);

	}

}
