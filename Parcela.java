package ProvaQ2;

import java.util.Scanner;

public class Parcela {

	public static void main(String[] args) {
		
		double valorCarro;
		double valorParcela;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro: R$ ");
		valorCarro = scan.nextDouble();
		
		System.out.printf("O valor do carro é de: R$ %.2f", valorCarro);
		System.out.println();
		
		System.out.println("Digite o valor da parcela (maior ou igual a R$1000,00): R$ ");
		valorParcela = scan.nextDouble();
		
		if (valorParcela >= 1000.00) {
			double quantidadeParcela = valorCarro / valorParcela;
			System.out.printf("Seu carro custa R$ %.2f, assim é possível parcelar em %.2f vezes (tendo uma parcela mínima de R$ 1000,00).", valorCarro, quantidadeParcela);
			
		} else { 
			System.out.println("Valor de parcela inválido");
		}
		
		scan.close();

	}

}
