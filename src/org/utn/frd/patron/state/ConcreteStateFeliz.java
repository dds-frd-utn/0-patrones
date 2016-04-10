package org.utn.frd.patron.state;

public class ConcreteStateFeliz implements State {

	@Override
	public void jugar() {
		System.out.println("Estoy Jugando");
	}

	@Override
	public void comer() {
		System.out.println("Estoy Comiendo");
	}

	@Override
	public void dormir() {
		System.out.println("Estoy Durmiendo");
	}
}