/**
 * 
 */
package fi.agileo.testi2;
// harjoitus 6
/**
 * @author oppi
 *
 */
public class funktiot2 {
	double[] table = new double[4];
	// private int length;

	public funktiot2(double luku1, double luku2, double luku3, double luku4) {
		this.table[0] = luku1; 
		this.table[1] = luku2;
		this.table[2] = luku3;
		this.table[3] = luku4;
		
	}
	
	public void setTableitem1(double item){
		this.table[0] = item;
	}
	public void setTableitem2(double item2){
		this.table[0] = item2;
	}
	public void setTableitem3(double item3){
		this.table[0] = item3;
	}
	public void setTableitem4(double item4){
		this.table[0] = item4;
	}
	public double getTableItem1() {
		return this.table[0];
	}
	public double getTableItem2() {
		return this.table[1];
	}
	public double getTableItem3() {
		return this.table[2];
	}
	public double getTableItem4() {
		return this.table[3];
	}

	public double summa(double luku1, double luku2, double luku3, double luku4) {
	      double summa = 0;
	      for (int i=0; i<table.length; i++) {
	          summa = summa + table[i];
	                  }
	      return summa;
	      }
	
    public double ka(double summa) {
     double ka = summa / 4;
     return ka;
     }

    public double haj(double ka) {
    	double p = 0; // poikkeama
		for (int i=0;i<table.length;i++)
		{
			p = p + Math.pow(ka - table[i], 2);
			
		}
			return Math.sqrt(p/table.length);
			
		}
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	double[] taulukko = {10,20,30,40.5};
		//	double[] taulukko = new double[args.length];
		//	for(int i=0; i<args.length; i++)
		//	{
		//		taulukko[i] = Double.parseDouble(args[i]);
				
		//	}
			funktiot2 taulukko = new funktiot2(10, 20, 30, 40.5);
		//	taulukko.setTableitem1(10);
		//	taulukko.setTableitem2(20);
		//	taulukko.setTableitem3(30);
		//	taulukko.setTableitem4(40.5);
			
			double item1 = taulukko.getTableItem1();
			double item2 = taulukko.getTableItem2();
			double item3 = taulukko.getTableItem3();
			double item4 = taulukko.getTableItem4();
			
			double summa = taulukko.summa(item1, item2, item3, item4);
			System.out.println("Summa on " + summa);
			
			
			
			double keskiarvo = taulukko.ka(summa);
			System.out.println("ka arvo on " + keskiarvo);
			
			double keskihajonta = taulukko.haj(keskiarvo);
		    System.out.println("keskihajonta on " + keskihajonta);
			
		}

		
	
}

