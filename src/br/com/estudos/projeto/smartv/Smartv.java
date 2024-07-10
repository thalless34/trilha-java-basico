package br.com.estudos.projeto.smartv;

public class Smartv {

	boolean on = false;
	int channel = 1;
	int sound = 14;
	
	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = false;
	}
	public void sound() {
		sound++;
		System.out.println("aumentando volume para: " + sound);
	}
	public void soundLess() {
		sound--;
		System.out.println("diminuindo volume para: " + sound);
	}
	public void changeChannel() {
		channel++;
	}
	public void changeChannel2() {
		channel--;
	}
	public void changeChannel3(int channelNumber) {
		channel = channelNumber;
	}

}
