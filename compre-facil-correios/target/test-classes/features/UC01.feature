Feature: UC01
  As a user
  I want to calculate shipping cost and time of my order
  So that I can finish my purchase


  Scenario Outline: Get shipping cost and time
    Given product weight is <peso> g
    And product width is <largura> cm
    And product height is <altura> cm
    And product length is <comprimento> cm
    And shipping type is <tipoEntrega>
    And zipcode is <cep>
    And correio is "on"
    When I ask to calculate shipping
    Then the shipping cost should be <valor>
    And shipping time should be <tempoEntrega>
    And the data returned is saved

    Examples:
      | peso | largura | altura | comprimento | tipoEntrega |   cep      | valor | tempoEntrega |
      | 100  |    5    |   10   |     10      |   "PAC"     | "04119010" |   5   |     5        |
      | 500  |	  10   |   50   |     100     |   "SEDEX"   | "04119010" |  20   |     3        |
      | 1000 |	  20   |   100  |     1000    |   "SEDEX10" | "04119010" | 100   |     1        |

# Cenário onde CEP esta incorreto - Fluxo Alternativo A 1
  Scenario: Invalid zipcode
    Given product weight is 500 g
    And product width is 5 cm
    And product height is 10 cm
    And product length is 50 cm
    And shipping type is "PAC"
    And zipcode is "1dasi190s"
    And correio is "on"
    When I ask to calculate shipping
	Then CorreioServices should return an error with the message: 
	"""
	The zipcode is not valid
	"""

# Cenário onde servico correio esta off - Fluxo Alternativo A 2
  Scenario: CorreioServices is offline
    Given product weight is 500 g
    And product width is 5 cm
    And product height is 10 cm
    And product length is 50 cm
    And shipping type is "PAC"
    And zipcode is "04119010"
    And correio is "off"
    When I ask to calculate shipping
	Then CorreioServices should return an error with the message: 
	"""
	CorreioServices is offline right now
	"""
	
	
