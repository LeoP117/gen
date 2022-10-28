package calculoSalario;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double salarioB, adicionalN, horaE, desconto, total;
		
		System.out.print("Digite o valor do salário");
		salarioB = leia.nextDouble();
		
		System.out.print("Digite o valor do adicional noturono");
		adicionalN = leia.nextDouble();
		
		System.out.print("Digite o valor da horas extra");
		horaE = leia.nextDouble();
		
		System.out.print("Digite o valor total do desconto");
		desconto = leia.nextDouble();
		
		total = (salarioB + horaE + adicionalN) - desconto;
		
		System.out.print("O valor do seu salário é: " + total);
		
		

	}

}
