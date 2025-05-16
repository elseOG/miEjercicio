package Calculadora;

public class Calculadora {
	float n1, n2;
	
	public Calculadora() {}
	
	public Calculadora(float x, float y) {
		this.n1 = x;
		this.n2 = y;
	}
	
	public float sumar() {
		return this.n1 + this.n2;
	}
	public float restar() {
		return this.n1 - this.n2;
	}
	public double multiplicar() {
		return this.n1 * this.n2;
	}
	public float dividir() {
		return this.n1 / this.n2;
	}
}
