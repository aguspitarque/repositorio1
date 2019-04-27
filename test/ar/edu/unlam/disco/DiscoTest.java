package ar.edu.unlam.disco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class DiscoTest {
	
	@Test
	public void verificarQueSeanIguales() {
		Disco discoUno = new Disco(3,5,20,45,100);
		discoUno.setRadioInterior(8);
		discoUno.setRadioExterior(16);
		Disco discoDos = new Disco(8,16,20,45,100);
		
		discoUno.verificarDiscoValido();
		discoDos.verificarDiscoValido();
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = discoUno.equals(discoDos);
		
		assertEquals(valorEsperado,valorObtenido);
		

	}
	
}
