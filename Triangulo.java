package ProvaQ3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de asteriscos da base do triângulo: ");
		int base = scan.nextInt();
		
		int i = 0;
		
		String asterisco = "";
						
		do {
			i += 1;
			asterisco += "*";
			
			if(i % 2 != 0) {
				System.out.println(asterisco);
				
			}
		} while (i < base);
		
		scan.close();
	}
}
