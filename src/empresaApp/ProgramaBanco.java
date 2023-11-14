package empresaApp;

import java.util.Locale;
import java.util.Scanner;

import object.Conta;

public class ProgramaBanco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;

		System.out.print("Insira o número da conta: ");
		int number = sc.nextInt();

		sc.nextLine();

		System.out.print("Insira o nome do dono: ");
		String nome = sc.nextLine();

		System.out.print("Deseja efeutar um deposito inicial? (s/n)");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {
			System.out.print("Insira um valor inicial para deposito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(number, nome, depositoInicial);
		} else {

			conta = new Conta(number, nome);
		}
		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(conta);

		System.out.println();
		System.out.print("Insira um valor para depósito: ");
		double vDeposito = sc.nextDouble();
		conta.deposito(vDeposito);
		
		System.out.println();
		System.out.println("Atualização nos dados da conta");
		System.out.print(conta);

		System.out.println();
		System.out.print("Insira um valor para saque: ");
		double vSaque = sc.nextDouble();
		conta.saque(vSaque);
		
		System.out.println();
		System.out.println("Atualização nos dados da conta");
		System.out.print(conta);

		sc.close();
	}

}
