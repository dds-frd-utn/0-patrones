package org.utn.frd.patron.state;

public class ConcreteStateCansado implements State {

	@Override
	public void jugar() {
		System.out.println("Tengo Sue�o");
	}

	@Override
	public void comer() {
		System.out.println("Tengo Sue�o");
	}

	@Override
	public void dormir() {
		System.out.println("Estoy Durmiendo");
	}
}