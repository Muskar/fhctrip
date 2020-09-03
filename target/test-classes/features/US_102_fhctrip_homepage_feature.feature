@homepage02
  Feature: Fhctrip HomePage
Scenario: TC02_ user click on contact button,fill the necessary boxes and send the message
Given user on the homepage
And user click on contact button
And user click on Name Surname box
And user click on Email address box
And user click on Name Surname box
And user click on phone number box
And user click on subject box
And user click on message box
And user click on send message button
Then verify you are able to send message and get no warning as "This field is required"