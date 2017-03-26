$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\myapp\\cucumber\\Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into SalesForce app and other",
  "description": "",
  "id": "login-into-salesforce-app-and-other",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Login into SalesForce app",
  "description": "",
  "id": "login-into-salesforce-app-and-other;login-into-salesforce-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I go tos \"https://login.salesforce.com\" on \"chrome\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter \"loginusername\" as \"\u003cUsername\u003e\" and \"loginpassword\" as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login should be \"Salesforce\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://login.salesforce.com",
      "offset": 10
    },
    {
      "val": "chrome",
      "offset": 44
    }
  ],
  "location": "LoginTest.I_gos_Login(String,String)"
});
formatter.result({
  "duration": 11697659720,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_enter_loginname_and_password()"
});
formatter.result({
  "duration": 5429474238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Salesforce",
      "offset": 17
    }
  ],
  "location": "LoginTest.Login_should_be(String)"
});
formatter.result({
  "duration": 59602827,
  "status": "passed"
});
});