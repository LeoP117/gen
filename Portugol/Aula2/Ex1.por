programa {
  funcao inicio() {
    inteiro num1

    escreva("Digite um numeroo")
    leia(num1)
    
    se (num1%2 == 0 e num1 >= 0)
        escreva("O numero ", num1, " � par e positivo"
    senao
        se (num1%2 > 0 e num1 >= 0)
        escreva("O numero ", num1, " � impar e positivo")
        senao
          se (num1%2 == 0 e num1 < 0)
        escreva("O numero ", num1, " � par e negativo")
            senao 
               escreva("O numero ", num1, " � impar e negativo")  
                
  }
}
