package difNumeros;

import java.util.Scanner;

public class diferenca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3, numero4, difer;
		
		System.out.print("Digite o primeiro numero");
		numero1 = leia.nextInt();
		
		System.out.print("Digite o segundo numero");
		numero2 = leia.nextInt();
		
		System.out.print("Digite o terceiro numero");
		numero3 = leia.nextInt();
		
		System.out.print("Digite o quarto numero");
		numero4 = leia.nextInt();
		
		difer = (numero1*numero2) - (numero3*numero4);
		
		
		System.out.print("A diferença entre os numeros é: " + difer);
		
		
		
	}

}
