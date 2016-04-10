package org.utn.frd.patron.state;

public class Test {
	public static void main(String arg[]) {
		try {
			// creo una mascota con estado feliz
			State feliz = new ConcreteStateFeliz();
			State cansado = new ConcreteStateCansado();
			State aburrido = new ConcreteStateAburrido();
			Mascota mascota = new Mascota();
			mascota.setState(feliz);
			
			System.out.println("Estado Feliz");
			mascota.come();
			mascota.juga();
			mascota.dormi();
			
			System.out.println("Estado Aburrido");
			mascota.setState(aburrido);
			mascota.come();
			mascota.juga();
			mascota.dormi();
			
			System.out.println("Estado Cansado");
			mascota.setState(cansado);
			mascota.come();
			mascota.juga();
			mascota.dormi();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}