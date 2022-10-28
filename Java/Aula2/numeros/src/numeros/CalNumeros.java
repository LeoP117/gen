package numeros;

import java.util.Scanner;

public class CalNumeros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite o primeiro numero");
		n1 = leia.nextInt();
		
		System.out.print("Digite o segundo numero");
		n2 = leia.nextInt();
		
		System.out.print("Digite o terceiro numero");
		n3 = leia.nextInt();
		
		
		if(n1 > n2 && n1 > n3) {
			System.out.print(n1 +" é o maior numero");			
		}else{
			if(n2 > n3 && n2 > n1 ) {
				System.out.print(n2 +" é o maior numero");			
			}else{
				
			}if(n3 > n2 && n3 > n1 ) {
				System.out.print(n3 +" é o maior numero");			
			}else{
				
			}
		}
				
				
				
				
	}

}
