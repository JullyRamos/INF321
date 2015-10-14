$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/UC01.feature");
formatter.feature({
  "line": 1,
  "name": "UC01",
  "description": "As a user\r\nI want to calculate shipping cost and time of my order\r\nSo that I can finish my purchase",
  "id": "uc01",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Get shipping cost and time",
  "description": "",
  "id": "uc01;get-shipping-cost-and-time",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "product weight is \u003cpeso\u003e g",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "product width is \u003clargura\u003e cm",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "product height is \u003caltura\u003e cm",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "product length is \u003ccomprimento\u003e cm",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "shipping type is \u003ctipoEntrega\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "zipcode is \u003ccep\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "correio is \"on\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I ask to calculate shipping",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the shipping cost should be \u003cvalor\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "shipping time should be \u003ctempoEntrega\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "uc01;get-shipping-cost-and-time;",
  "rows": [
    {
      "cells": [
        "peso",
        "largura",
        "altura",
        "comprimento",
        "tipoEntrega",
        "cep",
        "valor",
        "tempoEntrega"
      ],
      "line": 20,
      "id": "uc01;get-shipping-cost-and-time;;1"
    },
    {
      "cells": [
        "100",
        "5",
        "10",
        "10",
        "\"PAC\"",
        "\"04119010\"",
        "5",
        "5"
      ],
      "line": 21,
      "id": "uc01;get-shipping-cost-and-time;;2"
    },
    {
      "cells": [
        "500",
        "10",
        "50",
        "100",
        "\"SEDEX\"",
        "\"04119010\"",
        "20",
        "3"
      ],
      "line": 22,
      "id": "uc01;get-shipping-cost-and-time;;3"
    },
    {
      "cells": [
        "1000",
        "20",
        "100",
        "1000",
        "\"SEDEX10\"",
        "\"04119010\"",
        "100",
        "1"
      ],
      "line": 23,
      "id": "uc01;get-shipping-cost-and-time;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1842333,
  "status": "passed"
});
formatter.before({
  "duration": 51746,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Get shipping cost and time",
  "description": "",
  "id": "uc01;get-shipping-cost-and-time;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "product weight is 100 g",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "product width is 5 cm",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "product height is 10 cm",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "product length is 10 cm",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "shipping type is \"PAC\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "zipcode is \"04119010\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "correio is \"on\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I ask to calculate shipping",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the shipping cost should be 5",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "shipping time should be 5",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_weight_is__g(int)"
});
formatter.result({
  "duration": 112777013,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "UC01Steps.product_width_is__cm(int)"
});
formatter.result({
  "duration": 85103,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_height_is__cm(int)"
});
formatter.result({
  "duration": 67569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_length_is__cm(int)"
});
formatter.result({
  "duration": 70991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PAC",
      "offset": 18
    }
  ],
  "location": "UC01Steps.shipping_type_is(String)"
});
formatter.result({
  "duration": 1144829,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04119010",
      "offset": 12
    }
  ],
  "location": "UC01Steps.zipcode_is(String)"
});
formatter.result({
  "duration": 75695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "on",
      "offset": 12
    }
  ],
  "location": "UC01Steps.correio_is(String)"
});
formatter.result({
  "duration": 62865,
  "status": "passed"
});
formatter.match({
  "location": "UC01Steps.I_ask_to_calculate_shipping()"
});
formatter.result({
  "duration": 1252598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 28
    }
  ],
  "location": "UC01Steps.the_shipping_cost_should_be__valor(int)"
});
formatter.result({
  "duration": 2145540,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 24
    }
  ],
  "location": "UC01Steps.shipping_time_should_be__tempoEntrega(int)"
});
formatter.result({
  "duration": 87669,
  "status": "passed"
});
formatter.before({
  "duration": 18817,
  "status": "passed"
});
formatter.before({
  "duration": 14113,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Get shipping cost and time",
  "description": "",
  "id": "uc01;get-shipping-cost-and-time;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "product weight is 500 g",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "product width is 10 cm",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "product height is 50 cm",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "product length is 100 cm",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "shipping type is \"SEDEX\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "zipcode is \"04119010\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "correio is \"on\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I ask to calculate shipping",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the shipping cost should be 20",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "shipping time should be 3",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_weight_is__g(int)"
});
formatter.result({
  "duration": 74412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 17
    }
  ],
  "location": "UC01Steps.product_width_is__cm(int)"
});
formatter.result({
  "duration": 68424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_height_is__cm(int)"
});
formatter.result({
  "duration": 52602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_length_is__cm(int)"
});
formatter.result({
  "duration": 66286,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SEDEX",
      "offset": 18
    }
  ],
  "location": "UC01Steps.shipping_type_is(String)"
});
formatter.result({
  "duration": 51318,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04119010",
      "offset": 12
    }
  ],
  "location": "UC01Steps.zipcode_is(String)"
});
formatter.result({
  "duration": 43193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "on",
      "offset": 12
    }
  ],
  "location": "UC01Steps.correio_is(String)"
});
formatter.result({
  "duration": 47042,
  "status": "passed"
});
formatter.match({
  "location": "UC01Steps.I_ask_to_calculate_shipping()"
});
formatter.result({
  "duration": 45759,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 28
    }
  ],
  "location": "UC01Steps.the_shipping_cost_should_be__valor(int)"
});
formatter.result({
  "duration": 66286,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 24
    }
  ],
  "location": "UC01Steps.shipping_time_should_be__tempoEntrega(int)"
});
formatter.result({
  "duration": 56451,
  "status": "passed"
});
formatter.before({
  "duration": 41910,
  "status": "passed"
});
formatter.before({
  "duration": 29509,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Get shipping cost and time",
  "description": "",
  "id": "uc01;get-shipping-cost-and-time;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "product weight is 1000 g",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "product width is 20 cm",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "product height is 100 cm",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "product length is 1000 cm",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "shipping type is \"SEDEX10\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "zipcode is \"04119010\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "correio is \"on\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I ask to calculate shipping",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the shipping cost should be 100",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "shipping time should be 1",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_weight_is__g(int)"
});
formatter.result({
  "duration": 65003,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 17
    }
  ],
  "location": "UC01Steps.product_width_is__cm(int)"
});
formatter.result({
  "duration": 52174,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_height_is__cm(int)"
});
formatter.result({
  "duration": 47898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_length_is__cm(int)"
});
formatter.result({
  "duration": 80399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SEDEX10",
      "offset": 18
    }
  ],
  "location": "UC01Steps.shipping_type_is(String)"
});
formatter.result({
  "duration": 52601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04119010",
      "offset": 12
    }
  ],
  "location": "UC01Steps.zipcode_is(String)"
});
formatter.result({
  "duration": 44476,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "on",
      "offset": 12
    }
  ],
  "location": "UC01Steps.correio_is(String)"
});
formatter.result({
  "duration": 46187,
  "status": "passed"
});
formatter.match({
  "location": "UC01Steps.I_ask_to_calculate_shipping()"
});
formatter.result({
  "duration": 19244,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 28
    }
  ],
  "location": "UC01Steps.the_shipping_cost_should_be__valor(int)"
});
formatter.result({
  "duration": 57306,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "UC01Steps.shipping_time_should_be__tempoEntrega(int)"
});
formatter.result({
  "duration": 58161,
  "status": "passed"
});
formatter.before({
  "duration": 19245,
  "status": "passed"
});
formatter.before({
  "duration": 16250,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 25,
      "value": "# Cen�rio onde CEP esta incorreto - Fluxo Alternativo A 1"
    }
  ],
  "line": 26,
  "name": "Invalid zipcode",
  "description": "",
  "id": "uc01;invalid-zipcode",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "product weight is 500 g",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "product width is 5 cm",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "product height is 10 cm",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "product length is 50 cm",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "shipping type is \"PAC\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "zipcode is \"1dasi190s\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "correio is \"on\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I ask to calculate shipping",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "CorreioServices should return an error with the message:",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 36,
    "value": "The zipcode is not valid"
  }
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_weight_is__g(int)"
});
formatter.result({
  "duration": 67142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "UC01Steps.product_width_is__cm(int)"
});
formatter.result({
  "duration": 67996,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_height_is__cm(int)"
});
formatter.result({
  "duration": 70563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_length_is__cm(int)"
});
formatter.result({
  "duration": 47897,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PAC",
      "offset": 18
    }
  ],
  "location": "UC01Steps.shipping_type_is(String)"
});
formatter.result({
  "duration": 40627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1dasi190s",
      "offset": 12
    }
  ],
  "location": "UC01Steps.zipcode_is(String)"
});
formatter.result({
  "duration": 73984,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "on",
      "offset": 12
    }
  ],
  "location": "UC01Steps.correio_is(String)"
});
formatter.result({
  "duration": 47042,
  "status": "passed"
});
formatter.match({
  "location": "UC01Steps.I_ask_to_calculate_shipping()"
});
formatter.result({
  "duration": 48324,
  "status": "passed"
});
formatter.match({
  "location": "UC01Steps.CorreioServices_should_return_an_error_with_the_message(String)"
});
formatter.result({
  "duration": 43138722,
  "status": "passed"
});
formatter.before({
  "duration": 26514,
  "status": "passed"
});
formatter.before({
  "duration": 23521,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 40,
      "value": "# Cen�rio onde servico correio esta off - Fluxo Alternativo A 2"
    }
  ],
  "line": 41,
  "name": "CorreioServices is offline",
  "description": "",
  "id": "uc01;correioservices-is-offline",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "product weight is 500 g",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "product width is 5 cm",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "product height is 10 cm",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "product length is 50 cm",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "shipping type is \"PAC\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "zipcode is \"04119010\"",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "correio is \"off\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I ask to calculate shipping",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "CorreioServices should return an error with the message:",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 51,
    "value": "CorreioServices is offline right now"
  }
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_weight_is__g(int)"
});
formatter.result({
  "duration": 193299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "UC01Steps.product_width_is__cm(int)"
});
formatter.result({
  "duration": 94084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_height_is__cm(int)"
});
formatter.result({
  "duration": 81254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 18
    }
  ],
  "location": "UC01Steps.product_length_is__cm(int)"
});
formatter.result({
  "duration": 61155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PAC",
      "offset": 18
    }
  ],
  "location": "UC01Steps.shipping_type_is(String)"
});
formatter.result({
  "duration": 52602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04119010",
      "offset": 12
    }
  ],
  "location": "UC01Steps.zipcode_is(String)"
});
formatter.result({
  "duration": 34640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "off",
      "offset": 12
    }
  ],
  "location": "UC01Steps.correio_is(String)"
});
formatter.result({
  "duration": 31646,
  "status": "passed"
});
formatter.match({
  "location": "UC01Steps.I_ask_to_calculate_shipping()"
});
formatter.result({
  "duration": 38489,
  "status": "passed"
});
formatter.match({
  "location": "UC01Steps.CorreioServices_should_return_an_error_with_the_message(String)"
});
formatter.result({
  "duration": 56022,
  "status": "passed"
});
});