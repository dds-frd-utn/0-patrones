package org.utn.frd.patron.state;

public class Mascota {
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void juga() {
		state.jugar();
	}

	public void come() {
		state.comer();
	}
	
	public void dormi() {
		state.dormir();
	}
}