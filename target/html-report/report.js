$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/InserirConta.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "",
  "description": "Eu como usuário\r\nQuero criar um acesso\r\nPara que possa criar contas\r\nEntao assim realizar transações bancárias",
  "id": "",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Adicionar um usuário",
  "description": "",
  "id": ";adicionar-um-usuário",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 9,
  "name": "que eu acesse a página inicial do sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "em seguida no botão Bank Manager Login",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "em seguida no botão Add Customer",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu informar o nome \u003cnome\u003e",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "o sobrenome \u003csobrenome\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o CEP \u003ccep\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "em seguida finalizo no botão Add Customer",
  "keyword": "Entao "
});
formatter.step({
  "line": 16,
  "name": "fecho o alerta que aparece",
  "keyword": "Entao "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": ";adicionar-um-usuário;",
  "rows": [
    {
      "cells": [
        "nome",
        "sobrenome",
        "cep"
      ],
      "line": 19,
      "id": ";adicionar-um-usuário;;1"
    },
    {
      "cells": [
        "Matheus",
        "Silva",
        "0000"
      ],
      "line": 20,
      "id": ";adicionar-um-usuário;;2"
    },
    {
      "cells": [
        "Marcus",
        "Oliveira",
        "1234"
      ],
      "line": 21,
      "id": ";adicionar-um-usuário;;3"
    },
    {
      "cells": [
        "Zenky",
        "Lol",
        "005500"
      ],
      "line": 22,
      "id": ";adicionar-um-usuário;;4"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 20,
  "name": "Adicionar um usuário",
  "description": "",
  "id": ";adicionar-um-usuário;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 9,
  "name": "que eu acesse a página inicial do sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "em seguida no botão Bank Manager Login",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "em seguida no botão Add Customer",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu informar o nome Matheus",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "o sobrenome Silva",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o CEP 0000",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "em seguida finalizo no botão Add Customer",
  "keyword": "Entao "
});
formatter.step({
  "line": 16,
  "name": "fecho o alerta que aparece",
  "keyword": "Entao "
});
formatter.match({
  "location": "InserirContaSteps.queEuAcesseAPáginaInicialDoSistema()"
});
formatter.result({
  "duration": 8338176100,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoBankManagerLogin()"
});
formatter.result({
  "duration": 1348927800,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoAddCustomer()"
});
formatter.result({
  "duration": 769325100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Matheus",
      "offset": 19
    }
  ],
  "location": "InserirContaSteps.euInformarONome(String)"
});
formatter.result({
  "duration": 583840000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Silva",
      "offset": 12
    }
  ],
  "location": "InserirContaSteps.oSobrenome(String)"
});
formatter.result({
  "duration": 34568200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0000",
      "offset": 6
    }
  ],
  "location": "InserirContaSteps.oCEP(String)"
});
formatter.result({
  "duration": 30912900,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoAddCustomerFinal()"
});
formatter.result({
  "duration": 49988900,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.fechoOAlertaQueAparece()"
});
formatter.result({
  "duration": 23841100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Adicionar um usuário",
  "description": "",
  "id": ";adicionar-um-usuário;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 9,
  "name": "que eu acesse a página inicial do sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "em seguida no botão Bank Manager Login",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "em seguida no botão Add Customer",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu informar o nome Marcus",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "o sobrenome Oliveira",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o CEP 1234",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "em seguida finalizo no botão Add Customer",
  "keyword": "Entao "
});
formatter.step({
  "line": 16,
  "name": "fecho o alerta que aparece",
  "keyword": "Entao "
});
formatter.match({
  "location": "InserirContaSteps.queEuAcesseAPáginaInicialDoSistema()"
});
formatter.result({
  "duration": 16687100,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoBankManagerLogin()"
});
formatter.result({
  "duration": 65931600,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoAddCustomer()"
});
formatter.result({
  "duration": 68784900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Marcus",
      "offset": 19
    }
  ],
  "location": "InserirContaSteps.euInformarONome(String)"
});
formatter.result({
  "duration": 227388900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Oliveira",
      "offset": 12
    }
  ],
  "location": "InserirContaSteps.oSobrenome(String)"
});
formatter.result({
  "duration": 34525100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 6
    }
  ],
  "location": "InserirContaSteps.oCEP(String)"
});
formatter.result({
  "duration": 27560900,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoAddCustomerFinal()"
});
formatter.result({
  "duration": 36762400,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.fechoOAlertaQueAparece()"
});
formatter.result({
  "duration": 27288900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Adicionar um usuário",
  "description": "",
  "id": ";adicionar-um-usuário;;4",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 9,
  "name": "que eu acesse a página inicial do sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "em seguida no botão Bank Manager Login",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "em seguida no botão Add Customer",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu informar o nome Zenky",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "o sobrenome Lol",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o CEP 005500",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "em seguida finalizo no botão Add Customer",
  "keyword": "Entao "
});
formatter.step({
  "line": 16,
  "name": "fecho o alerta que aparece",
  "keyword": "Entao "
});
formatter.match({
  "location": "InserirContaSteps.queEuAcesseAPáginaInicialDoSistema()"
});
formatter.result({
  "duration": 9961500,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoBankManagerLogin()"
});
formatter.result({
  "duration": 56983000,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoAddCustomer()"
});
formatter.result({
  "duration": 55845300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zenky",
      "offset": 19
    }
  ],
  "location": "InserirContaSteps.euInformarONome(String)"
});
formatter.result({
  "duration": 49815800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lol",
      "offset": 12
    }
  ],
  "location": "InserirContaSteps.oSobrenome(String)"
});
formatter.result({
  "duration": 22427500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "005500",
      "offset": 6
    }
  ],
  "location": "InserirContaSteps.oCEP(String)"
});
formatter.result({
  "duration": 25113300,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.emSeguidaNoBotãoAddCustomerFinal()"
});
formatter.result({
  "duration": 33829200,
  "status": "passed"
});
formatter.match({
  "location": "InserirContaSteps.fechoOAlertaQueAparece()"
});
formatter.result({
  "duration": 22936500,
  "status": "passed"
});
});