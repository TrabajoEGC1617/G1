package test;

import org.junit.Test;

import services.Suma;

public class SumaTest {

	@Test
	public void sumaEnterosTest(){
		System.out.println(Suma.sumaEnteros(1, 2));
	}
	
	@Test
	public void sumaRealesTest(){
		System.out.println(Suma.sumaReales(2.4, 100.1));
	}
}
