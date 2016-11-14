package fi.agileo.testi3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Moottori {

	@Test
	public void test() throws VaaraArvoException {
		Engine engine = new Engine("Moottori1", 6,1);
		
		engine.meneRikki();
		int paluuArvo = 0;
		paluuArvo = engine.meneRikki();
		System.out.println(paluuArvo);
		assertTrue(paluuArvo <= 6 && paluuArvo >0);
	}
	
	@Test(expected=VaaraArvoException.class)
	public void test2() throws VaaraArvoException {
		Engine engine = new Engine("Moottori1", 6,-1);
		// rikkinäisiä sylintereitä negatiivinen määrä
	}
	
	@Test(expected=VaaraArvoException.class)
	public void test3() throws VaaraArvoException {
		Engine engine = new Engine("Moottori1", -6, 1);
		// sylintereitä negatiivinen määrä
	}
	
	@Test(expected=VaaraArvoException.class)
	public void test4() throws VaaraArvoException {
		Engine engine = new Engine(null, 6, 1);
		// moottori on null
	}

	@Test(expected=VaaraArvoException.class)
	public void test5() throws VaaraArvoException {
		Engine engine = new Engine("Moottori1", 3,4);
		// rikkinäisiä sylintereitä enemmän kuin toimivia
	}
	
}
