programa {
	funcao inicio() {
		real salarioB, adicionalN, horasEx, descontos, salLiquido
		
		escreva("qual o salário bruto?")
		leia(salarioB)
		
		escreva("Qual o valor do adicional noturno?")
		leia(adicionalN)
		
		escreva("Quanto em horas extras?")
		leia(horasEx)
		
		escreva("Quanto em descontos?")
		leia(descontos)
		
		salLiquido = salarioB + adicionalN + (horasEx * 5) - descontos
		
		escreva("o valor do salario liquido é ", salLiquido)
	}
}
