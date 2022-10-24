programa {
  funcao inicio() {
  
  inteiro codigoProduto, quantidadePedido
  real valorProduto, valorTotal

  escreva("Digite o código do pedido")
  leia(codigoProduto)
  escreva("Quantidade de produtos")
  leia(quantidadePedido)
  
  
  escolha(codigoProduto){

    caso 1:
          valorProduto = 10.00
          valorTotal = valorProduto * quantidadePedido
          escreva("Pedido: ", quantidadePedido, " Cachorro quente")
          escreva("\n Total a pagar ", valorTotal)
      pare
      caso 2:
          valorProduto = 15.00
          valorTotal = valorProduto * quantidadePedido
          escreva("Pedido: ", quantidadePedido, " X-Salada")
          escreva("\n Total a pagar ", valorTotal)
      pare
      caso 3:
          valorProduto = 18.00
          valorTotal = valorProduto * quantidadePedido
          escreva("Pedido:", quantidadePedido, " X-bacon")
          escreva("\n Total a pagar ", valorTotal)
      pare
      caso 4:
          valorProduto = 12.00
          valorTotal = valorProduto * quantidadePedido
          escreva("Pedido: ", quantidadePedido, " Bauru")
          escreva("\n Total a pagar ", valorTotal)
      pare
      caso 5:
          valorProduto = 8.00
          valorTotal = valorProduto * quantidadePedido
          escreva("Pedido: ", quantidadePedido, " Refrigerante")
          escreva("\n Total a pagar ", valorTotal)
      pare
      caso 6:
          valorProduto = 8.00
          valorTotal = valorProduto * quantidadePedido
          escreva("Pedido: ", quantidadePedido, " Suco de laranja")
          escreva("\n Total a pagar ", valorTotal)
      pare
  }


  }
}
