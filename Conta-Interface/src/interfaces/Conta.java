package interfaces;

public interface Conta {
	
	public void deposita(double valor);
	public void saca(double valor);
	public void  atualiza(double taxa);
	public double getSaldo();
}
