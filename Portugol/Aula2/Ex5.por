programa {
  funcao inicio() {
    cadeia num1, num2, num3

    escreva("Digite o tipo1")
    leia(num1)
    escreva("Digite o tipo 2")
    leia(num2)
    escreva("digite o tipo 3")
    leia(num3)

    //Vertebrado
    se (num1 == "vertebrado" e num2 == "ave" e num3 == "carnivoro")
       escreva("� a Aguia")
    senao se (num1 == "vertebrado" e num2 == "ave" e num3 == "onivoro")
       escreva("� uma pomba")
    senao se (num1 == "vertebrado" e num2 == "mamifero" e num3 == "onivoro")
       escreva("� o homem")
    senao se (num1 == "vertebrado" e num2 == "mamifero" e num3 == "herbivoro") 
       escreva("� a vaca")  

    //Invertebrado 
    se (num1 == "invertebrado" e num2 == "inseto" e num3 == "hematofogo")
       escreva("� a Pulga")
    senao se (num1 == "invertebrado" e num2 == "inseto" e num3 == "herbivoro")
       escreva("� a Lagarta")
    senao se (num1 == "invertebrado" e num2 == "anelideo" e num3 == "hematofogo")
       escreva("� a Sanguessuga")
    senao se (num1 == "invertebrado" e num2 == "anelideo" e num3 == "onivoro") 
       escreva("� uma Minhoca") 


  }
}
