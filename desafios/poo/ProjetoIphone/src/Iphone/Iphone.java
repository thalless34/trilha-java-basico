package Iphone;

import Iphone.os.IOS;

public class Iphone {

	public static void main(String[] args) {
		
		IOS ios = new IOS();
		IOS safari = ios;
		IOS musica = ios;
		
		safari.exibirPagina("facebook.com");
		musica.play();
		

	}

}
