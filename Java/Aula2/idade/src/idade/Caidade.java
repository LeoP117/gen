package idade;

import java.util.Scanner;

public class Caidade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade; 
		
		System.out.print("Digite sua idade");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.print("Sua idade é " + idade + " infantil" );
		}else{
			if (idade >= 15 && idade <= 17) {
				System.out.print("Sua idade é " + idade + " junenil" );
			}else{
				if (idade >= 18 && idade <= 25) {
					System.out.print("Sua idade é " + idade + " adulto" );
				}else{
					
				}
			}
		}
		
		
		
		
		
	}

}
