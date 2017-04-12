package ubb.cl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStackTDD {

	private LabTestTDD pilaTDD;
	boolean PilaNoVacia;
	
	@Before
	public void setUp(){
		pilaTDD = new LabTestTDD();
		
	}
	
	@Test
	public void PilaEst·Vacia() {
		boolean PilaVacia = pilaTDD.estaVacia();
		
		assertEquals(PilaVacia,(true));
	}
	@Test
	public void AgregarTresStackNoEst·Vacia(){
		PilaNoVacia = pilaTDD.agregarTres();
		
		pilaTDD.AgregarNumero(3);
		
		assertEquals(PilaNoVacia,(false));
	}
	@Test
	public void AgregarUnoYDosStackNoEstaVacia(){
		 PilaNoVacia= pilaTDD.agregarUnoYDos();
		 
		 pilaTDD.AgregarNumero(1);
		 pilaTDD.AgregarNumero(2);
		
		assertEquals(PilaNoVacia,(false));
	}

}
