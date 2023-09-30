package ar.edu.unahur.EmpresaLaPerseverancia;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void empleadoTemporario80HorasEsposaSinHijosCobra161000() {
		//Preparacion
		EmpleadoPlantaTemporaria jorgeRamirez = new EmpleadoPlantaTemporaria(1342, "Jorge Ramirez", 0);
		jorgeRamirez.esCasado();
		Integer valorEsperado = 161000;
		Integer valorObtenido;
		//Ejecucion
		valorObtenido = jorgeRamirez.cobrarSueldo(80);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void empleadoPermanenteNoGerente160HorasSinEsposaSinHijosY4AniosAntiguedadCobra484000() {
		//Preparacion
		EmpleadoPlantaPermanente carlosFernandez = new EmpleadoPlantaPermanente(1256, "Carlos Fernandez", 0) ;
		carlosFernandez.setAniosAntiguedad(4);
		Integer valorEsperado = 484000;
		Integer valorObtenido;
		//Ejecucion
		valorObtenido = carlosFernandez.cobrarSueldo(160);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void empleadoPermanenteNoGerente80HorasEsposaDosHijosY6AniosAntiguedadCobra251000() {
		//Preparacion
		EmpleadoPlantaPermanente marioGonzalez = new EmpleadoPlantaPermanente(1122, "Mario Gonzalez", 2) ;
		marioGonzalez.setAniosAntiguedad(6);
		marioGonzalez.esCasado();
		Integer valorEsperado = 251000;
		Integer valorObtenido;
		//Ejecucion
		valorObtenido = marioGonzalez.cobrarSueldo(80);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void gerente160HorasEsposaUnHijoY10AniosAntiguedadCobra658000() {
		//Preparacion
		Gerente albertoMartinez = new Gerente(12, "Alberto Martinez", 1) ;
		albertoMartinez.setAniosAntiguedad(10);
		albertoMartinez.esCasado();
		Integer valorEsperado = 658000;
		Integer valorObtenido;
		//Ejecucion
		valorObtenido = albertoMartinez.cobrarSueldo(160);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
}
