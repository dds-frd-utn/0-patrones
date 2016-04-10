package org.utn.frd.patron.state;

public class ConcreteStateCansado implements State {

	@Override
	public void jugar() {
		System.out.println("Tengo Sueño");
	}

	@Override
	public void comer() {
		System.out.println("Tengo Sueño");
	}

	@Override
	public void dormir() {
		System.out.println("Estoy Durmiendo");
	}
}