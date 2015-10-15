$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/UC02.feature");
formatter.feature({
  "id": "uc02",
  "description": "As a system admin\r\nI want to look for address\r\nSo that I can know where the client lives on",
  "name": "UC02",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 404804502,
  "status": "passed"
});
formatter.before({
  "duration": 460920,
  "status": "passed"
});
formatter.scenario({
  "id": "uc02;searching-for-an-invalid-address",
  "description": "",
  "name": "Searching for an invalid address",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I am looking for an address",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "my CEP is \"123ffgfs\"",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "should show an error with the message:",
  "keyword": "Then ",
  "line": 9,
  "doc_string": {
    "value": "The zipcode is not valid",
    "line": 10,
    "content_type": ""
  }
});
formatter.match({
  "location": "UC02Steps.I_am_looking_for_an_address()"
});
formatter.result({
  "duration": 250093647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123ffgfs",
      "offset": 11
    }
  ],
  "location": "UC02Steps.my_CEP_is(String)"
});
formatter.result({
  "duration": 5625672,
  "status": "passed"
});
formatter.match({
  "location": "UC02Steps.should_show_an_error_with_the_message(String)"
});
formatter.result({
  "duration": 102306847,
  "status": "passed"
});
formatter.before({
  "duration": 924281,
  "status": "passed"
});
formatter.before({
  "duration": 2933309,
  "status": "passed"
});
formatter.scenario({
  "id": "uc02;searching-for-a-valid-address",
  "description": "",
  "name": "Searching for a valid address",
  "keyword": "Scenario",
  "line": 14,
  "type": "scenario"
});
formatter.step({
  "name": "I am looking for an address",
  "keyword": "Given ",
  "line": 15
});
formatter.step({
  "name": "my CEP is \"04119010\"",
  "keyword": "When ",
  "line": 16
});
formatter.step({
  "name": "the address should be \"Rua Conde de Iraja\"",
  "keyword": "Then ",
  "line": 17
});
formatter.step({
  "name": "the neighborhood should be \"Vila Mariana\"",
  "keyword": "And ",
  "line": 18
});
formatter.step({
  "name": "the city should be \"Sao Paulo\"",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "the province should be \"SP\"",
  "keyword": "And ",
  "line": 20
});
formatter.match({
  "location": "UC02Steps.I_am_looking_for_an_address()"
});
formatter.result({
  "duration": 52189,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04119010",
      "offset": 11
    }
  ],
  "location": "UC02Steps.my_CEP_is(String)"
});
formatter.result({
  "duration": 829013034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rua Conde de Iraja",
      "offset": 23
    }
  ],
  "location": "UC02Steps.the_address_should_be(String)"
});
formatter.result({
  "duration": 184368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vila Mariana",
      "offset": 28
    }
  ],
  "location": "UC02Steps.the_neighborhood_should_be(String)"
});
formatter.result({
  "duration": 116084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sao Paulo",
      "offset": 20
    }
  ],
  "location": "UC02Steps.the_city_should_be(String)"
});
formatter.result({
  "duration": 124863,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SP",
      "offset": 24
    }
  ],
  "location": "UC02Steps.the_province_should_be(String)"
});
formatter.result({
  "duration": 126814,
  "status": "passed"
});
});