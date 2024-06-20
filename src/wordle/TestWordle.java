package wordle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TestWordle {
	Wordle juego;
	String palabraTest;
	String [] listaDePalabras;
	
	@Before
	public void setUp() throws Exception {
		juego = new Wordle(listaDePalabras);
		palabraTest ="barco";
		juego.setPalabra(palabraTest);
	}

	@Test
	public void testEstaContenida() {
		assertTrue(juego.estaContenida('r'));
	}

	@Test
	public void testEstaEnPosicion() {
		assertTrue(juego.estaEnPosicion('a', 1));
	}
	
}
