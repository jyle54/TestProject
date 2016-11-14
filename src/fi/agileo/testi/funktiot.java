/**
 * 
 */
package fi.agileo.testi;

/**
 * @author oppi
 *
 */
public class funktiot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	double[] taulukko1 = new double[args.length];
	//	double[] taulukko = {10,20,30,40.5};
		double[] taulukko = new double[args.length];
		for(int i=0; i<args.length; i++)
		{
			taulukko[i] = Double.parseDouble(args[i]);
			
		}
		
		double tulos = sum(taulukko);
		System.out.println("Summa on " + tulos);
		
		double keskiarvo = ka(taulukko);
		System.out.println("ka arvo on " + keskiarvo);
		
		double keskihajonta = haj(taulukko);
		System.out.println("keskihajonta on " + keskihajonta);
		
	}

	public static double sum(double[] taulu)
	{
		double summa=0;
		for(int i=0;i<taulu.length;i++) {
	    summa = summa +taulu[i]; 
		}
		 return summa;
	}
	
	public static double ka(double[] taulu){
		
		double summa = 0; 
			
		double ka= 0;
		
		for(int i=0;i<taulu.length;i++) {
		    summa = summa +taulu[i]; 
			}
		ka = summa / taulu.length;
		return ka;
	}
	
	public static double haj(double[] taulu){
	double ka = 0;
	ka = ka(taulu);
	double p = 0; // poikkeama
	for (int i=0;i<taulu.length;i++)
	{
		p = p + Math.pow(ka - taulu[i], 2);
		
	}
		return Math.sqrt(p/taulu.length);
		
	}
	
	}
	

