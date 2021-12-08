$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/FT_001_ManterCadastroSeguro.feature");
formatter.feature({
  "name": "ManterCadastro",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@ManterCadastro"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario acesse o sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.queOUsuarioAcesseOSistema()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar novo seguro",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ManterCadastro"
    },
    {
      "name": "@Cadastrar_Seguro"
    }
  ]
});
formatter.step({
  "name": "o usuario selecionar a make \"BMW\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioSelecionarAMake(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar o model \"Scooter\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioSelecionarOModel(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o cylinder capacity \"250\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioInformarOCylinderCapacity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar engine performace \"2000\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioInformarEnginePerformace(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a date of manufacture com uma data valida",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioInformarADateOfManufactureComUmaDataValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar number of seats \"2\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioSelecionarNumberOfSeats(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario marcar right hand drive com yes",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioMarcarRightHandDriveComYes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar number of seats motorcycle \"1\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioSelecionarNumberOfSeatsMotorcycle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar fuel type \"Petrol\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioSelecionarFuelType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o playload com \"1000\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioInformarOPlayloadCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o total weight com \"2000\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioInformarOTotalWeightCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a list price com \"15000\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioInformarAListPriceCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a license plate number com \"PQA-2021\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioInformarALicensePlateNumberCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario infomar annual mileage com \"20000\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioInfomarAnnualMileageCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario acionar o botao next da aba vehicle",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.DadosVeiculosSteps.oUsuarioAcionarOBotaoNextDaAbaVehicle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a aba enter insurant data",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oSistemaApresentaAAbaEnterInsurantData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informa o first name \"Carlos\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioInformaOFirstName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informa o last name \"Brito\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioInformaOLastName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a date of birth com uma data valida",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioInformarADateOfBirthComUmaDataValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario marcar gender com male",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioMarcarGenderComMale()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o street address com \"lago sul\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioInformarOStreetAddressCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar o country com \"Brazil\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioSelecionarOCountryCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o zip code com \"71675310\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioInformarOZipCodeCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a city com \"brasilia\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioInformarACityCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar a occupation com \"Employee\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioSelecionarAOccupationCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario marcar hobbies com cliff diving",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioMarcarHobbiesComCliffDiving()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o website com \"http://sampleapp.tricentis.com/101/app.php\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioInformarOWebsiteCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar arquivo para anexo",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioSelecionarArquivoParaAnexo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario acionar o botao next da aba insurant",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.DadosSeguroSteps.oUsuarioAcionarOBotaoNextDaAbaInsurant()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a aba enter product data",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.DadosProdutoSteps.oSistemaApresentaAAbaEnterProductData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a start date com uma data valida",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosProdutoSteps.oUsuarioInformarAStartDateComUmaDataValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar insurance sum com \"3.000.000,00\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosProdutoSteps.oUsuarioSelecionarInsuranceSumCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar marit rating com \"Super Bonus\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosProdutoSteps.oUsuarioSelecionarMaritRatingCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar damage insurance com \"No Coverage\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosProdutoSteps.oUsuarioSelecionarDamageInsuranceCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario marcar Optional Products com euro protection",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosProdutoSteps.oUsuarioMarcarOptionalProductsComEuroProtection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario selecionar Courtesy car com \"Yes\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosProdutoSteps.oUsuarioSelecionarCourtesyCarCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario acionar o botao next da aba product",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosProdutoSteps.oUsuarioAcionarOBotaoNextDaAbaProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a aba select price option",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.DadosPrecoSteps.oSistemaApresentaAAbaSelectPriceOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario marcar a opcao ultimate",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosPrecoSteps.oUsuarioMarcarAOpcaoUltimate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario acionar o botao nextda aba select price option",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosPrecoSteps.oUsuarioAcionarOBotaoNextdaAbaSelectPriceOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a aba send quote",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oSistemaApresentaAAbaSendQuote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o email \"cedbbrito@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oUsuarioInformarOEmail(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o phone \"61985030785\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oUsuarioInformarOPhone(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o username \"Carlos\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oUsuarioInformarOUsername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o password \"Kadu123\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oUsuarioInformarOPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario confirmar o passaword \"Kadu123\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oUsuarioConfirmarOPassaword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar um comments \"Quero agradecer a participação no processo seletivo e parabenizar a aplicação desenvolvida para o desafio técnico!! Atenciosamente Carlos Bomfim\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oUsuarioInformarUmComments(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario acionar o botao next da aba send quote",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oUsuarioAcionarOBotaoNextDaAbaSendQuote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema me apresenta a mensagem \"Sending e-mail success!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.DadosCotacaoSteps.oSistemaMeApresentaAMensagem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});