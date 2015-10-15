Feature: UC02 
  As a system admin
  I want to look for address
  So that I can know where the client lives on
 
 Scenario: Searching for an invalid address 
	Given I am looking for an address 
	When my CEP is "123ffgfs" 
	Then should show an error with the message: 
	"""
	The zipcode is not valid
	"""
	
 Scenario: Searching for a valid address 
	Given I am looking for an address
	When my CEP is "04119010" 
	Then the address should be "Rua Conde de Iraja"
	And the neighborhood should be "Vila Mariana"
	And the city should be "Sao Paulo"
	And the province should be "SP"
