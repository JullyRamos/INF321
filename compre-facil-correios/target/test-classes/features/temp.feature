Feature: UC01
  As a user
  I want to calculate shipping cost and time of my order
  So that I can finish my purchase

  Scenario Outline: Get shipping cost and time
    Given the product weighs <peso> g
    And product is <largura> cm
    And product is <altura> cm
    And product is <comprimento> cm
    And shipping type is <tipoEntrega>
    And zipcode is <cep>
    When I ask to calculate the shipping
    Then the shipping cost should be <valor>
    And shipping time should be <tempoEntrega>

    Examples:
      | peso | largura | altura | comprimento | tipoEntrega|   cep    | valor | tempoEntrega |
      | 100  |    5	 |   10   |     10      |   PAC      | 13083060 |   5   |     5        |
      | 500  |	10   |   50   |     100     |   SEDEX    | 13083060 |  20   |     3        |
      | 1000 |	20   |   100  |     1000    |   SEDEX10  | 13083060 | 100   |     1        |

# Cenário onde CEP esta incorreto - Fluxo Alternativo A 1
  Scenario: Invalid zipcode
    Given the product weighs 500 g
    And product width is 5 cm
    And product height is 10 cm
    And product length is 50 cm
    And shipping type is PAC
    And zipcode is 1dasi190s
    When I ask to calculate the shipping
    Then the shipping cost should be -1
    And shipping time should be -1

# Cenário onde servico correio esta off - Fluxo Alternativo A 2
  Scenario: Invalid zipcode
    Given the product weighs 500 g
    And product width is 5 cm
    And product height is 10 cm
    And product length is 50 cm
    And shipping type is PAC
    And zipcode is 13083060
    When I ask to calculate the shipping
    Then the shipping cost should be -2
    And shipping time should be -2
