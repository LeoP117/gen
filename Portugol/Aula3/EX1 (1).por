programa
{
	
	funcao inicio()
	{
		inteiro num1, num2, cont = 1

		escreva("Digite um numero entre 1 e 10")
		leia(num1)

		se (num1 > 10)
		   escreva("Digite um numero de 1 a 10")
          senao
		enquanto	(cont<11)
	     {
		  num2 = num1 * cont
		  escreva("\n", num2)
		  cont = cont + 1

			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */