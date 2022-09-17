package main;

import animales.Aves;
import animales.Halcon;

public class Main {
	public static void main(String[] argas) {
			Aves hawk = new Halcon(null);
			
			Halcon h2 = (Halcon) new Aves(null);
			
			hawk.alimentarse();
			
		h2.setDañoGarras(100);
		h2.setDañoPicotazo(1000);
		
		
		
	}
}
