#language: pt
#enconding: UTF-8

@ManterCadastro
Funcionalidade: ManterCadastro

  Contexto:
    Dado que o usuario acesse o sistema

  @Cadastrar_Seguro_Sucesso
  Cenario: Cadastrar Novo Seguro Com Sucesso
    Quando o usuario preencher o formulario enter Vehicle Data
    E o usuario preencher o formulario enter Insurant Data
    E o usuario preencher o formulario enter Product Data
    E o usuario preencher o formulario Select Price Option
    E o usuario preencher o formulario Send Quote
    Entao o sistema me apresenta a mensagem

  @Cadastrar_Seguro_Campo_Name_Obrigatorio
  Cenario: Campo Name Obrigatorio
    Quando o usuario preencher o formulario enter Vehicle Data
    E o usuario preencher o formulario enter Insurant Data
    E o usuario preencher o formulario enter Product Data
    E o usuario preencher o formulario Select Price Option
    E o usuario nao preencher o name no formulario Send Quote
    Entao o sistema me apresenta a mensagem erro

  @Cadastrar_Seguro_Campo_Name_Obrigatorio
  Cenario: Campo Email Obrigatorio
    Quando o usuario preencher o formulario enter Vehicle Data
    E o usuario preencher o formulario enter Insurant Data
    E o usuario preencher o formulario enter Product Data
    E o usuario preencher o formulario Select Price Option
    E o usuario nao preencher o email no formulario Send Quote
    Entao o sistema me apresenta a mensagem erro
