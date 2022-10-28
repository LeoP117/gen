package mediaAluno;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		Double nota1, nota2, nota3, nota4, media;
		
		System.out.print("Digite a primeira nota");
		nota1 = leia.nextDouble(); 
		
		System.out.print("Digite a segunda nota");
		nota2 = leia.nextDouble(); 
		
		System.out.print("Digite a terceira nota");
		nota3 = leia.nextDouble(); 
		
		System.out.print("Digite a quarta nota");
		nota4 = leia.nextDouble(); 

		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.print("A media das suas notas é: " + media);


	}

}
