programa {
  funcao inicio() {
    inteiro idade

    escreva("Digite a sua idade")
    leia(idade)

    se (idade >= 16 e idade < 18)
        escreva("Você está apta a votar e o voto é facultativo")
    senao
        se (idade >= 18 e idade < 65)
            escreva("Você está apta a votar e o voto é obrigatório")
        senao
           se (idade >= 65)
              escreva("Você está apta a votar e o voto é facultativo")
            senao
                escreva("A pessoa não está apta a votar.")    
    
  }
}
