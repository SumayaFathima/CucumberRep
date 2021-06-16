$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "name": "To validate the login functionality of the given application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@End2End"
    }
  ]
});
formatter.scenario({
  "name": "To verify login functionality with valid username and invalid password for facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End2End"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will hit the URL",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.userWillHitTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the Username and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Selenium",
        "Sel@123"
      ]
    },
    {
      "cells": [
        "Java",
        "Java@123"
      ]
    },
    {
      "cells": [
        "API",
        "Api@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.userWillEnterTheUsernameAndPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.userWillClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will verify the login functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.userWillVerifyTheLoginFunctionality()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login functionality with invalid username and valid password for Instagram",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End2End"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will hit the url",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.userWillHitTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the Username and PASSWORD",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.userWillEnterTheUsernameAndPASSWORD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the LOGIN button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.userWillClickTheLOGINButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will verify the LOGIN functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.userWillVerifyTheLOGINFunctionality()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/com/adactin/feature/adactin2.feature");
formatter.feature({
  "name": "To validate the login functionality of the given application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Performance"
    }
  ]
});
formatter.scenario({
  "name": "To verify login functionality with valid username and invalid pass",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Performance"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "USER will hit the URL",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition2.userWillHitTheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USER will enter the Username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition2.userWillEnterTheUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USER will click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition2.userWillClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USER will verify the login functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition2.userWillVerifyTheLoginFunctionality()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});