package modelo;

public class Circulo implements AreaCalculavel {
	private double raio;
	
	@Override
	public double calculaArea() {
		
		return Math.PI * this.raio * this.raio;
	}

}
