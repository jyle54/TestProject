package fi.agileo.testi3;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Auto {
	
	@Mock
	Engine mocEngine; 

	@Before
	public void setUp() {
	when(mocEngine.getBrokenCylinders()).thenReturn(1);
	when(mocEngine.getNumOfCylinders()).thenReturn(16);
	when(mocEngine.getPower()).thenReturn("teho1");
		//	when(mockProfiili.muunnaHinta(anyDouble())).thenReturn(100.0);		
//		when(mockProfiili.muunnaHinta(200.0)).thenReturn(200.0);		
//		when(mockProfiili.muunnaHinta(300.0)).thenReturn(300.0);		
	}
	
	@Test
	public void test() throws VaaraArvoException {
		
		car opel = new car("Opel", "malli1", 160, mocEngine, "Mika");
		double paluuArvo = opel.laskeNopeus();
		//System.out.println("nopeus on " +paluuArvo);
		assertEquals(2400, paluuArvo, 0);
	}
	
	@Test(expected=VaaraArvoException.class)
	public void test2() throws VaaraArvoException  {
		
		Engine bensa = new Engine("teho2", 6, -2);
		car renault = new car("renault", "malli1", 160, bensa, "Mika");
		double paluuArvo = renault.laskeNopeus();
		System.out.println("Paluuarvo on " +paluuArvo);
		assertEquals(1280, paluuArvo, 0);
		
	}
	@Test(expected=VaaraArvoException.class)
	public void test3() throws VaaraArvoException  {
		
		Engine bensa = new Engine("teho2", -6, 2);
		car renault = new car("renault", "malli1", 160, bensa, "Mika");
		//double paluuArvo = renault.laskeNopeus();
		//System.out.println("Paluuarvo on " +paluuArvo);
		
	}

	@Test(expected=VaaraArvoException.class)
	public void test4() throws VaaraArvoException {
		
	car opel = new car(null, "malli1", 160, mocEngine, "Mika");
		}
	
	@Test(expected=VaaraArvoException.class)
	public void test5() throws VaaraArvoException {
		
	car opel = new car("Opel", null, 160, mocEngine, "Mika");
		}
	
	@Test(expected=VaaraArvoException.class)
	public void test6() throws VaaraArvoException {
		
	car opel = new car("Opel", "malli1", 160, mocEngine, null);
		}
	
	@Test(expected=VaaraArvoException.class)
	public void test7() throws VaaraArvoException {
		
	car opel = new car("Opel", "malli1", 0, mocEngine, "Mika");
		}
	
	@Test(expected=VaaraArvoException.class)
	public void test8() throws VaaraArvoException {
		
	car opel = new car("Opel", "malli1", 0, null, "Mika");
		}
	@Test(expected=VaaraArvoException.class)
	public void test9() throws VaaraArvoException {
		
	car opel = new car("", "malli1", 0, null, "Mika");
		}
	@Test(expected=VaaraArvoException.class)
	public void test10() throws VaaraArvoException {
		
	car opel = new car("Opel", "", 0, null, "Mika");
		}

	@Test(expected=VaaraArvoException.class)
	public void test11() throws VaaraArvoException {
		
	car opel = new car("Opel", "corsa", 0, null, "");
		}

}
