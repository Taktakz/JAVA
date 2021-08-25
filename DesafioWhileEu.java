package Meus_Exercicos;

import java.util.Scanner;

public class DesafioWhileEu {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int QDN = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1){
			System.out.println("Informe a nota(para sair -1)");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10){
				total += nota;
				QDN++;
			}else if(nota != -1){
				System.out.println("NOTA INVALIDA!!!");
			}
			
			
		}
		
		double media = total / QDN;
		System.out.println("Media é: " + media);
		
		entrada.close();
	}
}

