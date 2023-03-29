package aplication;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double calcularArea() {
		return altura * largura;
	}
	
	public double calculaPerimetro() {
		return (altura * 2) + (largura *2);
	}
	
	public double calculaDiagonal( ) {
		return Math.sqrt(altura * altura + largura * largura);
	}
}
