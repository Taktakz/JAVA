package Meus_Exercicos;

import java.util.Scanner;

public class MotorValor {
	
	public static void main(String[] args) {
			

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Boa Tarde!");
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s %d anos%n", nome, sobrenome, idade);
		
		entrada.close();	
		
			final double moto = 12500;
			
			
				double MaoDeObra = 2000;
				double motor = 3000;
				double pJT = 743.90;
				double pJC = 483.90;
				double pgar = 429.00;
				double pTLe = 877.00;
			
				double valorFinal = moto + motor + pJT + pJC + pgar + pTLe + MaoDeObra;
				System.out.println("O valor ficou em: " + valorFinal);
				
				
				
				
	}
}
