$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "login page of Application",
  "description": "",
  "id": "login-page-of-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verification of login functionality with invalid credential",
  "description": "",
  "id": "login-page-of-application;verification-of-login-functionality-with-invalid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Open the IE and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the Username \"\u003cusername\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-page-of-application;verification-of-login-functionality-with-invalid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-page-of-application;verification-of-login-functionality-with-invalid-credential;;1"
    },
    {
      "cells": [
        "TEXTUSER",
        "TESTPASSWORD"
      ],
      "line": 13,
      "id": "login-page-of-application;verification-of-login-functionality-with-invalid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Verification of login functionality with invalid credential",
  "description": "",
  "id": "login-page-of-application;verification-of-login-functionality-with-invalid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Open the IE and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the Username \"TEXTUSER\" and Password \"TESTPASSWORD\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumTest.ieBrowser()"
});
formatter.result({
  "duration": 16536213242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TEXTUSER",
      "offset": 20
    },
    {
      "val": "TESTPASSWORD",
      "offset": 44
    }
  ],
  "location": "SeleniumTest.login(String,String)"
});
formatter.result({
  "duration": 2111423305,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumTest.clicklogin()"
});
formatter.result({
  "duration": 4207670340,
  "status": "passed"
});
});