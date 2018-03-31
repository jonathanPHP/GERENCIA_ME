package main;

import model.Carro;
import model.Roda;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Roda r1 = new Roda(null, null);
		Roda r2 = new Roda(null, null);
		Roda r3 = new Roda(null, null);
		Roda r4 = new Roda(null, null);
		
		Carro c = new Carro();
		
		c.addRoda(r1);
		c.addRoda(r2);
		c.addRoda(r3);
		c.addRoda(r4);
		
	}

}
