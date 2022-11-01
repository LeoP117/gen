package ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1; 
		Boolean vali = false;
		int[] vetor = new int[] {1, 2, 3, 5, 4, 7, 9, 8};
		
		System.out.println("Digite um numero");
		
		num1 = leia.nextInt();
		
		for(int indice = 0; indice < vetor.length; indice ++) {
			
			if (vetor[indice] == num1 ) {
				System.out.println("O numero " + num1 + "está localizado na posição " + indice);
				vali = true;
				
			}
			
			if (vali == false) {
				System.out.println("o numero " + num1 + " não foi encontrado");
			}
			
		}
		
		
	}

}
