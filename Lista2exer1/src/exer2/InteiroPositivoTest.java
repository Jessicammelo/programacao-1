package exer2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InteiroPositivoTest {

	@Test
	final void testCasoTeste02() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(20);
		long result = 231356448489L;
		assertEquals(result, ip.fatorial());
	}
	
	final void testDivisoresInteiros() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(14);
		String result = "Os divisores são1,2,3";
		assertEquals(result,ip.divisoresInteiros());
	}

}
