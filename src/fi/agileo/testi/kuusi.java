/**
 * 
 */
package fi.agileo.testi;

/**
 * @author oppi
 *
 */
public class kuusi {
// harjoitus 1b
	/**
	 * @param args
	 */
	public static void main(String[] args) {
      
int korkeus = 5;
int jalka = 3;

// tulostetaan kuusi
for (int rivi=1; rivi<=korkeus; rivi++) {
// valilyonnit
for (int tyhjä=korkeus-rivi; tyhjä > 0; tyhjä--)
System.out.print(" ");
// tahdet
for (int tähtiä=rivi*2-1; tähtiä >0; tähtiä-- )
System.out.print("*");
System.out.println(); //kun koko rivi on tulostettu, vaihdetaan riviä
}
               
//tulostetaan jalka

for (int rivi1=1; rivi1<=jalka; rivi1++) {

for (int tyhjä=3; tyhjä > 0; tyhjä--)
System.out.print(" ");
for (int tähtiä=3; tähtiä >0; tähtiä-- )
System.out.print("*");
System.out.println(); 
}
   }
   
}

