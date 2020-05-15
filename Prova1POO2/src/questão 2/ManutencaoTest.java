package Prova1;
//Jéssica Maria de Melo e Danielle Fernanda Deola
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ManutencaoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		Veiculo v = new Veiculo();
		v.setPlaca("XYZ-9753");
		v.setModelo("Furgão Renault");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate d = LocalDate.parse("10/06/2014", f);
		v.setDataAquis(d);
		Manutencao m = new Manutencao();
		m.setNumero(4);
		m.setDescricao("Troca do pára-brisas");
		m.setCusto(603);
		m.setTempo(1);
		v.addManutencao(m);
		assertTrue(v.getIndiceSucateamento() == 0f);
		assertTrue(m.getCustoMedioDiario() == 603f);
	}
	
	@Test
	void test2() {
		Veiculo v = new Veiculo();
		v.setPlaca("XYZ-9753");
		v.setModelo("Furgão Renault");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate d = LocalDate.parse("10/06/2014", f);
		v.setDataAquis(d);
		Manutencao m = new Manutencao();
		m.setNumero(8);
		m.setDescricao("Substituição do cardan");
		m.setCusto(3002);
		m.setTempo(18);
		v.addManutencao(m);
		assertTrue(v.getIndiceSucateamento() == 0f);
	}
	
	@Test
	void test3() {
		Veiculo v = new Veiculo();
		v.setPlaca("XYZ-9753");
		v.setModelo("Furgão Renault");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate d = LocalDate.parse("10/06/2014", f);
		v.setDataAquis(d);
		Manutencao m = new Manutencao();
		m.setNumero(16);
		m.setDescricao("Troca de filtro de ar do ar-condicionado");
		m.setCusto(89);
		m.setTempo(2);
		v.addManutencao(m);
		assertTrue(v.getIndiceSucateamento() == 0f);
	}

}
