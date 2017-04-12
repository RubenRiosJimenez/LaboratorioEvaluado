package ubb.cl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStackTDD {

	private LabTestTDD pilaTDD;
	
	@Before
	public void setUp(){
		pilaTDD = new LabTestTDD();
	}
	
	@Test
	public void PilaEst·Vacia() {
		boolean PilaVacia = pilaTDD.estaVacia();
		
		assertEquals(PilaVacia,(true));
	}

}
