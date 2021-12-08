#language: pt
#enconding: UTF-8

@ManterCadastro
Funcionalidade: ManterCadastro

  Contexto:
    Dado que o usuario acesse o sistema

  @Cadastrar_Seguro
  Cenario: Cadastrar novo seguro
    Quando o usuario selecionar a make "BMW"
    E o usuario selecionar o model "Scooter"
    E o usuario informar o cylinder capacity "250"
    E o usuario informar engine performace "2000"
    E o usuario informar a date of manufacture com uma data valida
    E o usuario selecionar number of seats "2"
    E o usuario marcar right hand drive com yes
    E o usuario selecionar number of seats motorcycle "1"
    E o usuario selecionar fuel type "Petrol"
    E o usuario informar o playload com "1000"
    E o usuario informar o total weight com "2000"
    E o usuario informar a list price com "15000"
    E o usuario informar a license plate number com "PQA-2021"
    E o usuario infomar annual mileage com "20000"
    Quando o usuario acionar o botao next da aba vehicle
    Entao o sistema apresenta a aba enter insurant data
    E o usuario informa o first name "Carlos"
    E o usuario informa o last name "Brito"
    E o usuario informar a date of birth com uma data valida
    E o usuario marcar gender com male
    E o usuario informar o street address com "lago sul"
    E o usuario selecionar o country com "Brazil"
    E o usuario informar o zip code com "71675310"
    E o usuario informar a city com "brasilia"
    E o usuario selecionar a occupation com "Employee"
    E o usuario marcar hobbies com cliff diving
    E o usuario informar o website com "http://sampleapp.tricentis.com/101/app.php"
    E o usuario selecionar arquivo para anexo
    Quando o usuario acionar o botao next da aba insurant
    Entao o sistema apresenta a aba enter product data
    E o usuario informar a start date com uma data valida
    E o usuario selecionar insurance sum com "3.000.000,00"
    E o usuario selecionar marit rating com "Super Bonus"
    E o usuario selecionar damage insurance com "No Coverage"
    E o usuario marcar Optional Products com euro protection
    E o usuario selecionar Courtesy car com "Yes"
    E o usuario acionar o botao next da aba product
    Entao o sistema apresenta a aba select price option
    E o usuario marcar a opcao ultimate
    E o usuario acionar o botao nextda aba select price option
    Entao o sistema apresenta a aba send quote
    E o usuario informar o email "cedbbrito@gmail.com"
    E o usuario informar o phone "61985030785"
    E o usuario informar o username "Carlos"
    E o usuario informar o password "Kadu123"
    E o usuario confirmar o passaword "Kadu123"
    E o usuario informar um comments "Quero agradecer a participação no processo seletivo e parabenizar a aplicação desenvolvida para o desafio técnico!! Atenciosamente Carlos Bomfim"
    E o usuario acionar o botao next da aba send quote
    Entao o sistema me apresenta a mensagem "Sending e-mail success!"



