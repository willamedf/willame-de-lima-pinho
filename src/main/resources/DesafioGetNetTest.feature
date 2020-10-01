# language: pt
# encoding: UTF-8
@DesafioGetNet
Funcionalidade: Desafio GetNet

  Contexto: 
    Dado que esteja no site "https://site.getnet.com.br/"

  @CE001_DesafioGetNet
  Cenario: CE001 - Consultar FAQ com sucesso
    Quando eu clicar no campo pesquisa
    E digitar "superget"
    E clicar em procurar
    E seleciono a opcao desejada
    Entao verifico de o modal foi aberto com a opcao escolhida
