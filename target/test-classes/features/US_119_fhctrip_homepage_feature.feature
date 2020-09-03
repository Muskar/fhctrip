@homepage03
  Feature: Fhctrip HomePage
Scenario: TC03_ user get a success message of sending message
Given user on the homepage and contact page
  And  all necessary boxes are filled
  And click on send message button
  Then verify whether "your message has been sent successfully" is visible