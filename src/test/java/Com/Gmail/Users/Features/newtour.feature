Feature: login

This feature deals with the login


Background:

Given login page


@TC1

Scenario: Login using correct username and correct password


#Given I navigate to login page

And enter username and password

And click sigin

Then check correct navigation

@TC2

Scenario: Login with correct username and invalid password


#Given I navigate to login page

And enter username

But if wrong password

And click sigin

Then check error navigation