package modelo;

import interfaces.Conta;
import interfaces.ContaTributavel;
import interfaces.Tributavel;

public class ContaCorrente implements ContaTributavel{
	private double saldo;
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calcularTributos() {
		return  this.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return "" + this.calcularTributos();
	}

	@Override
	public void saca(double valor) {
		this.saldo -=valor;		
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}
	
}
