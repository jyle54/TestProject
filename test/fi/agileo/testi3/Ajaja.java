package fi.agileo.testi3;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Ajaja {

	@Mock
	car moccar;
	
	@Before
	public void setUp() {
	when(moccar.laskeNopeus()).thenReturn(100.0);
			
//		when(mockProfiili.muunnaHinta(300.0)).thenReturn(300.0);		
	}
	
	@Test
	public void test() throws VaaraArvoException  {
		Driver driver = new Driver(moccar,"Mika", Behaviour.agressiivinen);
		double paluuArvo = 0;
		paluuArvo = driver.aja(10);
		assertEquals(1000, paluuArvo,0);
	}
	
	@Test
	public void test2() throws VaaraArvoException {
		Driver driver = new Driver(moccar,"Juha", Behaviour.tavallinen);
		double paluuArvo = 0;
		paluuArvo = driver.aja(10);
		//System.out.print(paluuArvo);
		assertEquals(700, paluuArvo,0);
	}
	@Test
	public void test3() throws VaaraArvoException  {
		Driver driver = new Driver(moccar,"Juha", Behaviour.rauhallinen);
		double paluuArvo = 0;
		paluuArvo = driver.aja(10);
		//System.out.print(paluuArvo);
		assertEquals(400, paluuArvo,0);
	}
	
	@Test(expected=VaaraArvoException.class)
	public void test4() throws VaaraArvoException  {
		Driver driver = new Driver(moccar,null, Behaviour.rauhallinen);
		}
// nimi on null
	@Test(expected=VaaraArvoException.class)
	public void test5() throws VaaraArvoException  {
		Driver driver = new Driver(null,"Juha", Behaviour.rauhallinen);
		}
// ajaja on null
	@Test()
	public void test6() throws VaaraArvoException  {
		Engine moottori = new Engine("teho1", 16, 1);
		car opel = new car("Opel", "malli1", 160, moottori, "Mika");
		String nimi = opel.getDriver();
		Driver driver = new Driver(opel,nimi, Behaviour.rauhallinen);
		}
	
	@Test(expected=VaaraArvoException.class)
	public void test7() throws VaaraArvoException  {
		Driver driver = new Driver(moccar,"", Behaviour.rauhallinen);
		}
	// tyhja nimi
}
