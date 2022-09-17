package animales;

public class AnimalCreator {
	public static Cazador crearCazador(String cazador) {
				switch(cazador) {
				case "halcon":
					return new Halcon(cazador);
				default:
					return "no es un cazador";
				}
				
				
	}
}
