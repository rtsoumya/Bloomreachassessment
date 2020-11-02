$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ManageDocument.feature");
formatter.feature({
  "line": 1,
  "name": "Manage Document",
  "description": "",
  "id": "manage-document",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verification of Document Draft Creation Function",
  "description": "",
  "id": "manage-document;verification-of-document-draft-creation-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@regression_positive"
    },
    {
      "line": 6,
      "name": "@smoke"
    },
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user clicks on selcet a \u003ctype\u003e document",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enters document \u003cname\u003e, \u003cvalue\u003e if present and clicks on OK on a Document Wizard",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user is navigated to Content Page with document \u003cname\u003e displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on \"Save as draft\" on Content Page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "document is updated with \"draft\" message",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "manage-document;verification-of-document-draft-creation-function;",
  "rows": [
    {
      "cells": [
        "type",
        "name",
        "value"
      ],
      "line": 15,
      "id": "manage-document;verification-of-document-draft-creation-function;;1"
    },
    {
      "cells": [
        "product",
        "Chairs for Adults",
        "Home"
      ],
      "line": 16,
      "id": "manage-document;verification-of-document-draft-creation-function;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7723240758,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is logged in with valid username \"admin10\" password \"admin10\" and language \"en\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "admin10",
      "offset": 39
    },
    {
      "val": "admin10",
      "offset": 58
    },
    {
      "val": "en",
      "offset": 81
    }
  ],
  "location": "LoginPageSteps.user_is_logged_in_with_valid_username_something_password_something_and_language_something(String,String,String)"
});
formatter.result({
  "duration": 3293024970,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verification of Document Draft Creation Function",
  "description": "",
  "id": "manage-document;verification-of-document-draft-creation-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    },
    {
      "line": 6,
      "name": "@regression_positive"
    },
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user clicks on selcet a product document",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enters document Chairs for Adults, Home if present and clicks on OK on a Document Wizard",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user is navigated to Content Page with document Chairs for Adults displayed",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on \"Save as draft\" on Content Page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "document is updated with \"draft\" message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "product",
      "offset": 24
    }
  ],
  "location": "HomePageSteps.user_clicks_on_selcet_a_document(String)"
});
formatter.result({
  "duration": 11573157398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chairs for Adults",
      "offset": 16
    },
    {
      "val": "Home",
      "offset": 35
    }
  ],
  "location": "DocumentWizardSteps.enters_document_if_present_and_clicks_on_ok_on_a_document_wizard(String,String)"
});
formatter.result({
  "duration": 1087137446,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chairs for Adults",
      "offset": 48
    }
  ],
  "location": "ContentPageSteps.user_is_navigated_to_content_page_with_document_displayed(String)"
});
formatter.result({
  "duration": 1918343368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Save as draft",
      "offset": 16
    }
  ],
  "location": "ContentPageSteps.user_clicks_on_something_on_content_page(String)"
});
formatter.result({
  "duration": 789580385,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "draft",
      "offset": 26
    }
  ],
  "location": "ContentPageSteps.document_is_updated_with_something_message(String)"
});
formatter.result({
  "duration": 174730065,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1399543399,
  "status": "passed"
});
});