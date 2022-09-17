package animales;

public class Halcon  extends Aves implements Cazador{
		private int dañoPicotazo = 100;
		private int dañoGarras = 50;
		private int campoVision; 
	public int getCampoVision() {
			return campoVision;
		}

		public void setCampoVision(int campoVision) {
			this.campoVision = campoVision;
		}

	public Halcon(String tipo, int numeroAlas, int campoVision) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	public Halcon(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	public int getDañoPicotazo() {
		return dañoPicotazo;
	}

	public void setDañoPicotazo(int dañoPicotazo) {
		this.dañoPicotazo = dañoPicotazo;
	}

	public int getDañoGarras() {
		return dañoGarras;
	}

	public void setDañoGarras(int dañoGarras) {
		this.dañoGarras = dañoGarras;
	}
	
	public void emboscar() {
		getDañoGarras();
		getDañoPicotazo();
		
	}

	public void asechar() {
		getCampoVision();
		
	}

	
	
	 
	
}
