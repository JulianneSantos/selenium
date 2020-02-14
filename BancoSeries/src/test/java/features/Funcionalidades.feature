@tag
Feature: Explorar o site Banco de Series
	Como usuário quero realizar ações no site

Background: 
    Given O usuario se conecta no site
    When O site carrega a página inicial com sucesso
	
  @regressao1	
  Scenario: Consultar a programação do dia
    Given O usuario acessa o menu da programação diária
	Then O site exibe a listagem com os episodios
	
  @regressao2	
  Scenario: Adicionar série à lista
    Given O usuario seleciona a serie desejada
	When Clicar no botão para adicionar a série
	And Preencher os dados solicitados pelo site
	And Clicar no botão de confirmação
	When O usuario seleciona a lista criada
	Then Validar que a serie foi adicionada com sucesso
	
  @regressao3
  Scenario: Verificar as informações da serie mais assistida
    Given Realizar a desconexão no site
	When Localizar a seção "Mais assistidos da semana"
	And O usuario clica na serie mais vista
	Then O site exibe as informações da serie