package Meus_Exercicos;

import java.util.Scanner;


public class exerAndre {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ol� Andre vamos comparar quem � o maioral?'-'");
		
		System.out.println("Digite o primeiro valor: ");
		int val1 = entrada.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int val2 = entrada.nextInt();
		
		if(val1 > val2) {
			System.out.println(val1 + "!" + "\nEssa � o maior valor!");
			
		}else {
			System.out.println(val2 + "!" + "\nEssa � o Maior Valor!");
		}
		
		
		
		entrada.close();
		
		
		
	}	
} 
