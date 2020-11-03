Feature: Manage Document

  Background: 
    Given user is logged in with valid username "admin10" password "admin10" and language "en"

  @regression_positive @smoke
  Scenario Outline: Verification of Document Draft Creation Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user clicks on "Save as draft" on Content Page
    Then document is updated with "draft" message

    Examples: 
      | type    | name                 | value |
      | product | Laps for Study Table | Home  |

  @regression_positive @smoke
  Scenario Outline: Verification of Document Creation Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created

    Examples: 
      | type  | name                    | title                   | value |
      | event | Yoga to relax your Mind | Yoga to relax your Mind | null  |

  @regression_negative @wip
  Scenario Outline: Unsuccessful Document Creation
    When user clicks on selcet a <type> document
    And clicks on OK without entering any fields
    Then error message <errorMessage> is displayed

    Examples: 
      | type    | errorMessage                             |
      | news    | 'Name' is required.                      |
      | event   | 'Name' is required.                      |
      | blog    | 'Name' is required.                      |
      | product | 'Name' is required. 'Value' is required. |

  @regression_negative @smoke
  Scenario Outline: Unsuccessful Document Creation
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user clicks on "Done" on Content Page
    Then error message "Enter some text" is displayed

    Examples: 
      | type | name                       | title                      | value |
      | blog | Top 10 blogs you must read | Top 10 blogs you must read | null  |

  @regression_negative @wip
  Scenario Outline: Unsuccessful Document Creation
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on "User account" and "Logout"
    Then user is navigated by to Login page
    Given user is logged in with valid username "admin10" password "admin10"
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then error message <errorMessage> is displayed

    Examples: 
      | type | name    | title      | value | errorMessage                                                                    |
      | blog | BestBu4 | Title Blog | null  | The name "BestBu4" is already used in this folder. Please use a different name. |

  @regression_positive @wip
  Scenario Outline: Verification of Edit Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clciks on EDIT
    And enter data into fields and clciks on Done
      | Summary     | <summary>     |
      | Description | <description> |
      | Price       | <price>       |
    Then document is updated with all the new data
      | Summary     | <summary>     |
      | Description | <description> |
      | Price       | <price>       |

    Examples: 
      | type    | name                 | title         | value   | summary        |
      | news    | Latest Top11 device4 | Title News    | null    | newsSummary    |
      | event   | New Launc4           | Title Event   | null    | eventSummary   |
      | blog    | BestBu4              | Title Blog    | null    | blogSummary    |
      | product | Olla Mobil4          | Title Product | Gadgets | productSummary |

  @regression_positive @wip
  Scenario Outline: Verification of Edit and Discard Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user click on EDIT
    And enter data into fields and clciks on Cancel
      | Summary     | <summary>     |
      | Description | <description> |
      | Price       | <price>       |
    Then cancel edting wizard comes up
    When user clicks on "Discard"
    Then user is navigated to Content page

    Examples: 
      | type | name                 | title      | value | summary     |
      | news | Latest Top11 device4 | Title News | null  | newsSummary |

  @regression_positive @wip
  Scenario Outline: Verification of Edit and Cancel Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on EDIT
    And enter data into fields and clciks on Cancel
      | Summary     | <summary>     |
      | Description | <description> |
      | Price       | <price>       |
    Then cancel edting wizard comes up
    When user clicks on "Cancel"
    Then user is navigated back to Edit page

    Examples: 
      | type | name                 | title      | value | summary     |
      | news | Latest Top11 device4 | Title News | null  | newsSummary |

  @regression_positive @smoke
  Scenario Outline: Verification of Publish Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on Publication and "Publish"
    Then document is updated with "live" message
    When user is navigated to Hippo application
    And searches for <title>
    Then title <title> is displayed

    Examples: 
      | type    | name             | title            | value     |
      | news    | Holiday in China | Holiday in China | null      |
      | event   | Colours Festival | Colours Festival | null      |
      | blog    | WFH forever      | WFH forever      | null      |
      | product | Cars for kids    | Cars for kid     | Transport |

  @regression_positive @wip
  Scenario Outline: Verification of Schedule Publish Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on Publication and "Schedule publication"
    And clicks on Schedule
    Then document is updated with "live" message

    Examples: 
      | type  | name                 | title       | value |
      | news  | Latest Top11 device4 | Title News  | null  |
      | event | New Launc4           | Title Event | null  |

  @regression_positive @wip
  Scenario Outline: Verification Schedule Publish Set it now Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on Publication and "Schedule publication"
    And clciks on Set it now and Schedule
    Then document is updated with "live" message

    Examples: 
      | type    | name        | title         | value   |
      | blog    | BestBu4     | Title Blog    | null    |
      | product | Olla Mobil4 | Title Product | Gadgets |

  @regression_positive @wip
  Scenario Outline: Verification of future Schedule Publish Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on Publication and Schedule Publish
    And select valid
      | date |
      | time |
    And clciks on Schedule
    Then scheduled message is displayed with
      | date |
      | time |

    Examples: 
      | type    | name        | title         | value   |
      | blog    | BestBu4     | Title Blog    | null    |
      | product | Olla Mobil4 | Title Product | Gadgets |

  @regression_negative @wip
  Scenario Outline: Unsuccessful Schedule Publish Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on Publication and Schedule Publish
    And select invalid <date> or <time>
    And clciks on Schedule
    Then <errorMessage> will be displayed

    Examples: 
      | type    | name        | title         | value   | date  | time  | errorMessage                                                                                     |
      | blog    | BestBu4     | Title Blog    | null    | past  | 22:30 | Scheduled date and time are in the past, please enter a date and time in the future.             |
      | product | Olla Mobil4 | Title Product | Gadgets | today | past  | Scheduled date and time are in the past, please enter a date and time in the future.             |
      | event   | New Launc4  | Title Event   | null    | today | 24:60 | The value of 'Hours' must be between 0 and 23. The value of 'Minutes' must be between 00 and 59. |

  @regression_positive @smoke
  Scenario Outline: Verification of Take offline Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on Publication and "Publish"
    Then document is updated with "live" message
    When user clicks on Publication and "Take offline"
    Then user is navigated to Offline Wizard with title "Take offline"
    When user clicks on "Take offline"
    Then document is updated with "offline" message
    When user is navigated to Hippo application
    And searches for <title>
    Then No Results for <title> is displayed

    Examples: 
      | type    | name                       | title                      | value   |
      | product | Glass that looks like ball | Glass that looks like ball | Kitchen |

  @regression_positive @smoke
  Scenario Outline: Verification of Schedule to take offline Function
    When user clicks on selcet a <type> document
    And enters document <name>, <value> if present and clicks on OK on a Document Wizard
    Then user is navigated to Content Page with document <name> displayed
    When user enters title in <title> field and clicks on "Done"
    Then document with given <title> is created
    When user clicks on Publication and "Publish"
    Then document is updated with "live" message
    When user clicks on Publication and "Schedule to take offline"
    Then user is navigated to Offline Wizard with title "Schedule to take offline"
    When user clicks on "Schedule"
    Then document is updated with "offline" message
    When user is navigated to Hippo application
    And searches for <title>
    Then No Results for <title> is displayed

    Examples: 
      | type | name                | title               | value |
      | news | Heavy rain in India | Heavy rain in India | null  |
