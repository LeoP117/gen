programa {
  funcao inicio() {

    inteiro vetor[10] = {2,5,1,3,4,9,7,8,10,6}, tamanho = 9, copia

    para(inteiro i = tamanho; i > 0; i--){
        para(inteiro j = tamanho;j > 0 ; j--){
          se(vetor[j] > vetor[j - 1]){
            copia = vetor[j]
            vetor[j] = vetor[j-1]
            vetor[j-1] = copia
          }
        }
    }
    para(inteiro i=0; i <= tamanho; i++){
      escreva(vetor[i]," ")
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */