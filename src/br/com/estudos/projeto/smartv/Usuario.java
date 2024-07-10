package br.com.estudos.projeto.smartv;

public class Usuario {
	
	public static void main(String[] args) {
	
	Smartv smartv = new Smartv();
	
	 smartv.soundLess();
	 smartv.soundLess();
	 smartv.soundLess();
	 smartv.sound();
 
	
	 System.out.println("tv ligada? " + smartv.on);
	 System.out.println("canal atual? " + smartv.channel);
	 System.out.println("volume atual? " + smartv.sound);
	 
	 smartv.turnOn();
	 System.out.println("tv ligada? " + smartv.on);
	 
	 smartv.turnOff();
	 System.out.println("tv ligada? " + smartv.on);
	 
	 smartv.changeChannel3(34);
	 System.out.println("canal atual? " + smartv.channel);
	 
	 
	 
	}

}
