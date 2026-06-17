# QA-Enginner-Assessment Submission

# Candidate name
  Aasika G

# Tools and Frameworks used
  # Manual Testing
  Microsoft Excel

  # Automation Testing
  java 17
  Selenium WebDriver 
  TestNG
  Maven
  WebDriverManager
  
# Task 1 – Manual Testing (Claude.ai)
Created 30 test cases covering:

Login functionality
Sign-up functionality
Conversation creation
Sending prompts and receiving responses
File and image uploads
Conversation history management
Settings and preferences
Positive scenarios
Negative scenarios
Edge case scenarios

# Deliverable:
claude_testcases.xlsx

# Task 2 – Automation Testing (SauceDemo)
Automated the following scenarios:

Scenario 1 – Valid Login and Checkout
Login using standard_user
Add two products to cart
Verify products in cart
Complete checkout process
Verify successful order completion message

Scenario 2 – Locked User Login
Login using locked_out_user
Verify locked user error message

# Framework Design:
Page Object Model (POM)
Reusable WebDriver setup
TestNG test execution

# Deliverable:
sauce_demo_automation

# How to Run Automation Tests
# Prerequisites

Install:
Java 17+
Maven
Google Chrome

# Execute Tests
Run using TestNG suite:
testng.xml

# Assumptions / Issues Faced
# Assumptions
SauceDemo website is available during execution.
Internet connection remains stable during testing.
Chrome browser version is compatible with installed ChromeDriver.

# Issues Faced
Dynamic page loading required synchronization between actions.
