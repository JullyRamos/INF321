Feature: UC02 
  As a system admin
  I want to look for address
  So that I can know where the client lives on
 
 Scenario: Searching for an invalid address 
	Given I am looking for an address 
	When my CEP is "123ffgfs" 
	Then should show an error with the message: 
	"""
	The address is not valid
	"""
	
 Scenario: Searching for a valid address 
	Given I am looking for an address
	When my CEP is "04119010" 
	Then the result should be "Rua Conde de Iraja, Vila Mariana, Sao Paulo, SP"
	