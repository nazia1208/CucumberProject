$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Dell/eclipse-workspace/CucumberProject/src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "This feature is to test the login page scenarios.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "This scenario is to test login functionality.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the browser and load facebook Url",
  "keyword": "Given "
});
formatter.step({
  "name": "Provide valid \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\" later hit Login",
  "keyword": "When "
});
formatter.step({
  "name": "Validate the user and close browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "anand@gmail.com",
        "Test@123"
      ]
    },
    {
      "cells": [
        "somiah@yahoo.in",
        "Welcome!2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "This scenario is to test login functionality.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the browser and load facebook Url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageExecution.launch_the_browser_and_load_facebook_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide valid \"anand@gmail.com\" and \"Test@123\" later hit Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageExecution.provide_valid_and_later_hit_Login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageExecution.validate_the_user_and_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to test login functionality.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the browser and load facebook Url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageExecution.launch_the_browser_and_load_facebook_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide valid \"somiah@yahoo.in\" and \"Welcome!2\" later hit Login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageExecution.provide_valid_and_later_hit_Login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageExecution.validate_the_user_and_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/Dell/eclipse-workspace/CucumberProject/src/test/resources/Features/SwagPage.feature");
formatter.feature({
  "name": "This feature is to test scenarios of SwagPage.",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and load the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "SwagPageExecution.launch_the_browser_and_load_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to test Login with Valid Credential.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Provide valid credential and hit Login",
  "keyword": "When "
});
formatter.match({
  "location": "SwagPageExecution.provide_valid_credential_and_hit_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the logged user and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SwagPageExecution.validate_the_logged_user_and_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and load the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "SwagPageExecution.launch_the_browser_and_load_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to test Login with Invalid Credential.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Provide invalid 878467 and \"Welcome@123\" then hit Login",
  "keyword": "When "
});
formatter.match({
  "location": "SwagPageExecution.provide_invalid_and_then_hit_Login(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the error msg and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SwagPageExecution.validate_the_error_msg_and_close_browser()"
});
formatter.result({
  "status": "passed"
});
});