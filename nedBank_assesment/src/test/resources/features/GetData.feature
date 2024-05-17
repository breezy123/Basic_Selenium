@api
Feature: Validate the GET POST In The API

  Scenario Outline: Get call posts from the API
    Given Get call to "<url>"
    Then Response is "<statusCode>"

    Examples:
      | url               | statusCode |
      | /api/users?page=2 | 200        |


  Scenario Outline: Get call to single id
    Given Get call to "<url>"
    Then Response first_name is "<statusCode>"

    Examples:
      | url          | statusCode |
      | /api/users/4 | Eve        |