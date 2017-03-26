$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\myapp\\cucumber\\Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into bankbazaar site",
  "description": "",
  "id": "login-into-bankbazaar-site",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Initialize all variables",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "that Every thing is initialized",
  "keyword": "Given "
});
formatter.match({
  "location": "AllSteps.Everythingisinit()"
});
formatter.result({
  "duration": 256241118,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify my profile page",
  "description": "",
  "id": "login-into-bankbazaar-site;verify-my-profile-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "that I have already login",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on my profile",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "##Then I find my full name \"SANJAY BADONI\""
    }
  ],
  "line": 21,
  "name": "I update all About you info",
  "rows": [
    {
      "cells": [
        "SANJAY",
        "PRASAD",
        "BADONI",
        "23-03-1990",
        "MALE",
        "MARRIED",
        "Masters Degree",
        "Indian"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AllSteps.Already_login()"
});
formatter.result({
  "duration": 23978367,
  "status": "passed"
});
formatter.match({
  "location": "AllSteps.I_click_on_my_profile()"
});
formatter.result({
  "duration": 12164748145,
  "status": "passed"
});
formatter.match({
  "location": "AllSteps.update_all_About_you_info(DataTable)"
});
formatter.result({
  "duration": 837824886,
  "status": "passed"
});
formatter.uri("com\\myapp\\cucumber\\PageValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Validate page",
  "description": "",
  "id": "validate-page",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Initialize all variables",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "that Every thing is initialized",
  "keyword": "Given "
});
formatter.match({
  "location": "AllSteps.Everythingisinit()"
});
formatter.result({
  "duration": 3978829939,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify my home page elements",
  "description": "",
  "id": "validate-page;verify-my-home-page-elements",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I go tos \"loginURL\" on \"Browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I verify page elements",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "loginURL",
      "offset": 10
    },
    {
      "val": "Browser",
      "offset": 24
    }
  ],
  "location": "AllSteps.I_gos_Login(String,String)"
});
formatter.result({
  "duration": 4547147087,
  "status": "passed"
});
formatter.match({
  "location": "AllSteps.I_verify_page_elements()"
});
formatter.result({
  "duration": 6492901468,
  "status": "passed"
});
formatter.uri("com\\myapp\\cucumber\\searchVerify.feature");
formatter.feature({
  "line": 1,
  "name": "Search page",
  "description": "",
  "id": "search-page",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Initialize all variables",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "that Every thing is initialized",
  "keyword": "Given "
});
formatter.match({
  "location": "AllSteps.Everythingisinit()"
});
formatter.result({
  "duration": 3706283357,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify search functionality",
  "description": "",
  "id": "search-page;verify-search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@SmokeTest2"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I go tos \"loginURL\" on \"Browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I verify search functionality",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "loginURL",
      "offset": 10
    },
    {
      "val": "Browser",
      "offset": 24
    }
  ],
  "location": "AllSteps.I_gos_Login(String,String)"
});
formatter.result({
  "duration": 4556877467,
  "status": "passed"
});
formatter.match({
  "location": "AllSteps.verifysearchfunctionality()"
});
formatter.result({
  "duration": 3906218222,
  "status": "passed"
});
});