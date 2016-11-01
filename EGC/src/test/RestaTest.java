package test;

import org.junit.Test;

import services.Resta;

public class RestaTest {

	@Test
	public void restaEnteraTest(){
		System.out.println(Resta.restaEntera(3, 7));
	}
	
	@Test
	public void restaRealTest(){
		System.out.println(Resta.restaReal(10.2, 2.0));
	}
	
}
