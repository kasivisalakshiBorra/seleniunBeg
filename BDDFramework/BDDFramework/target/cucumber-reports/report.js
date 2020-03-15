$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Guru.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verification of reset button with numbers of credential",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the Username \"\u003cusername\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;1"
    },
    {
      "cells": [
        "Test",
        "Test"
      ],
      "line": 11,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Verification of reset button with numbers of credential",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the Username \"Test\" and Password \"Test\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumTest.openbrowser()"
});
formatter.result({
  "duration": 17092373465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 20
    },
    {
      "val": "Test",
      "offset": 40
    }
  ],
  "location": "SeleniumTest.enter_the_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 225303645,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumTest.Reset_the_credential()"
});
formatter.result({
  "duration": 21049,
  "status": "passed"
});
});