@AddEmployee
Feature: Add new employe
  I want to use this template for adding new employee

  Background: 
    Given I am on HomePage
    Then Enterd the username and password
    Then Clicked on the Login Button
    Then I clicked on the PIM Tab.

  @Scenario1
  Scenario Outline: adding the new employee
    Then I clicked on the on the Add Employee
    When I enterd Employee "<FirstName>", "<MiddleName>", "<LastName>", & "<EmployeeID>".
    Then I clicked Save button
    And I see Successfull Toast Message

    Examples: 
      | FirstName | MiddleName | LastName | EmployeeID |
      | pramod    | chandra    | kakumani |       2217 |
      | shiva     | reddy      | pella    |       2218 |

  @Scenario2
  Scenario: Verify the Created Employee
    Then I clicked on the EmployeeList
    And I enter the EmployeeName "pramod" & EmployeeID "2217"
    Then I clicked on the Search Button
    Then I see the Employee details in the RecordTable
