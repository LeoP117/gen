import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite um numero" );
		numero1 =  leia.nextInt();
		
		System.out.print("Digite o segundo numero" );
		numero2 =  leia.nextInt();
		
		System.out.print("\n" +  numero1 + "+" + numero2 + "=" + (numero1 + numero2));
		System.out.print("\n" +  numero1 + "-" + numero2 + "=" + (numero1 - numero2));
		System.out.print("\n" +  numero1 + "*" + numero2 + "=" + (numero1 * numero2));
		System.out.print("\n" +  numero1 + "/" + numero2 + "=" + (numero1 / numero2));
		
		
		

	}

}
