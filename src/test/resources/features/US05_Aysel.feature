Feature: US 05
  @TC1
  Scenario Outline:
    Given user(patient) navigates to 'Medunna' homepage
    Then  user(patient) verifies the text written 'Make an Appoinment'
    Then  user(patient) will click 'Make an Appoinment' button
    And   user(patient) verifies that box is empty
    Then  user (patient) text their "<Firstname>"

    Examples:
    |Firstname|Lastname|SSN|Email|Phone|Appointment DateTime|




  @TC2
  Scenario Outline:
    Given user(patient) navigates to 'Medunna' homepage
    Then  user(patient) verifies the text written 'Make an Appoinment'
    Then  user(patient) will click 'Make an Appoinment' button
    And   user(patient) verifies that box is empty
    Then  user (patient) write their "<SSN>"
    Examples:
      |Firstname|Lastname|SSN|Email|Phone|Appointment DateTime|




  @TC3
  Scenario Outline:
    Given user(patient) navigates to 'Medunna' homepage
    Then  user(patient) verifies the text written 'Make an Appoinment'
    Then  user(patient) will click 'Make an Appoinment' button
    And   user(patient) verifies that box is empty
    Then  user (patient) text their "<Lastname>"

    Examples:
      |Firstname|Lastname|SSN|Email|Phone|Appointment DateTime|

  @TC4
  Scenario Outline:
    Given user(patient) navigates to 'Medunna' homepage
    Then  user(patient) verifies the text written 'Make an Appoinment'
    Then  user(patient) will click 'Make an Appoinment' button
    And   user(patient) verifies that box is empty
    Then  user (patient) write their "<Phone>"

    Examples:
      |Firstname|Lastname|SSN|Email|Phone|Appointment DateTime|

    #Then user texts their "<Email>"
    #Then user texts their "<Phone>"
    #Then user texts their "<Appointment DateTime>"




















    #2-
    #3-
    #4-
    #5-