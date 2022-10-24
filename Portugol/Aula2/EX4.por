programa {
  funcao inicio() {
    real salario 

    escreva ("escreva o seu salario  ")
    leia (salario )

    se (salario <0)
      escreva("o salario precisa ser um numero positivo ")
    se (salario <= 2000 e salario >0)
      escreva("o imposto de renda do seu salario È isento " )

    se (salario > 2000 e salario <= 3000)
      escreva("o imposto de renda do seu salario È " , (8/100)* salario)
    se ( salario  > 3000 e salario <= 4500)
      escreva("o imposto de renda do seu salario È " , (18/100)* salario)
se ( salario  > 4500)
      escreva("o imposto de renda do seu salario È " , (28/100)* salario)
    



    
  }
}