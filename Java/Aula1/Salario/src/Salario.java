import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salar, abono, resul;
		
		System.out.print("Digite o salário: ");
		salar = leia.nextFloat();
		
		System.out.print("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		resul = salar + abono;
		
		System.out.print("O valor do seu salário mais abono é: " + resul);
				
	}

}
