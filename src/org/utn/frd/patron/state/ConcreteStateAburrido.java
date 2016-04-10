package org.utn.frd.patron.state;

public class ConcreteStateAburrido implements State {

	@Override
	public void jugar() {
		System.out.println("Estoy Jugando");
	}

	@Override
	public void comer() {
		System.out.println("Estoy Aburrido");
	}

	@Override
	public void dormir() {
		System.out.println("Estoy Aburrido");
	}
}