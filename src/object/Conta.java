package object;

public class Conta {

	private int number;
	private String nome;
	private double saldo;
		
	public Conta(int number, String nome, double saldo) {
		super();
		this.number = number;
		this.nome = nome;
		this.saldo = saldo;
	}
	

	public Conta(int number, String nome) {
		super();
		this.number = number;
		this.nome = nome;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= (valor + 5.0);

	}
	
	public String toString() {
		return "Conta: " + number + ", Dono: " + nome + ", Saldo: R$" + String.format("%.2f", saldo);
	}
}
