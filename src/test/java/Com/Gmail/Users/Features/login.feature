Feature: logintable

This feature deals with the login


Background:

Given table login page


@TC1

Scenario Outline: Logintable using correct username and correct password


#Given I navigate to login page

	And enter "<username>" and "<password>"
	And table click sigin
	Then table check correct navigation "<expected result>"
	
	Examples:
	|username|password|expected result|
	|mercury|mercury|Login Successfully|
	|mercury|123|Login Successfully|
	|mercury|hi|Enter your userName and password correct|





