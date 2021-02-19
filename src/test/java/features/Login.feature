Feature: Application login
@Smoke
Scenario Outline: user is able to verify

Given user is on home page with login id "id"
Then user selects trip

Examples:
|id   |
| my id |

Scenario Outline: user is able to verify

Given user is on home page with login id "id"
Then user selects trip

Examples:
|id   |
| my id |