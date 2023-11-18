package ProvaQ1;

import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		
		double totalSaldoDevedor, jurosMensal, jurosAoMes, amortizacao, parcelaMensal;
				
		int totalDeMeses;
		
		double contadorPrestacao = 0;
		double contadorJuros = 0; 
		double contadorAmortizacao = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do empréstimo: R$ ");
		totalSaldoDevedor = scan.nextDouble();
		
		double saldoDevedorAtual = totalSaldoDevedor;
		
		System.out.println("Qual a taxa de juros ao mês em % (por exemplo, digite 2 caso queira informar 2%):  ");
		jurosAoMes = scan.nextDouble();
		
		System.out.println("Qual o tempo para pagamento, em meses: ");
		totalDeMeses = scan.nextInt();
		
		amortizacao = totalSaldoDevedor / totalDeMeses;
		
		jurosMensal = saldoDevedorAtual * (jurosAoMes/100);
		
		parcelaMensal = jurosMensal + amortizacao;
		
		saldoDevedorAtual = saldoDevedorAtual - amortizacao;	
		
		System.out.printf("Valor fixo da amortização = R$ %.2f, Saldo devedor total = R$ %.2f com um juros de %.1f ao mês", amortizacao, totalSaldoDevedor, jurosAoMes);
		System.out.println();
		
		for (int i = 1; i <= totalDeMeses; i++) {
			System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f| Saldo devedor: R$ %.2f", i, jurosMensal, parcelaMensal, saldoDevedorAtual);
						
			jurosMensal = saldoDevedorAtual * (jurosAoMes/100);
			
			parcelaMensal = jurosMensal + amortizacao;
			
			saldoDevedorAtual = saldoDevedorAtual - amortizacao;
			
			contadorPrestacao += parcelaMensal;
			
			contadorJuros += jurosMensal;
			
			contadorAmortizacao += amortizacao;			
			
			System.out.println();
		}
		
		System.out.printf("Total: Prestação R$ %.2f, Juros R$ %2f, Amortização R$ %.2f", contadorPrestacao, contadorJuros, contadorAmortizacao);
		
		scan.close();

	}
	
}
