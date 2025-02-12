# Katalon-Studio-Portfolio
Katalon-Studio-Portfolio

# 🚀 Katalon Studio Automation Portfolio  

## 📌 About This Project  
This repository contains **end-to-end UI and API test automation** using Katalon Studio. The project covers:

✅ Web UI Testing (Selenium-based)  
✅ API Testing (REST & SOAP)  
✅ Data-Driven Testing  
✅ Custom Keywords for Reusability  
✅ Test Execution Reports
  

## 📂 Folder Structure  
📂 TestCases/ → Contains all automated test cases

📂 TestSuites/ → Test suite collections for execution

📂 Reports/ → Test execution results (HTML, PDF)

📂 Screenshots/ → Captured failure screenshots

📂 ObjectRepository/ → Stores UI element locators

📂 Keywords/ → Custom reusable keywords

## 🛠️ Technologies Used  
- **Katalon Studio** (for test automation)  
- **Selenium & Appium** (UI testing)  
- **RestAssured/Katalon API** (API testing)  
- **TestNG/JUnit** (for assertions)

## ⚔️ Generate XPath 
- **Absolut Path** (Selects from the root element)  
  `/html/body/div`  
- **Relative Path** (Starts from the current node)  
  `//div[@class='container']`  
  - **by Attributes**  
     `//div[@class='container']` `//div[contains(@id, 'btn-submit')]`  
  - **by Text**  
     `//p[text()='Hello World']` `//p[contains(text(), 'Hello')]` `//div[normalize-space(text())='Created Date']`  
  - **by Index**  
     `(//input[@id='submit'])[1]` `(//input[@id='submit'])[last()]`  
  - **by Condition**  
    `//input[@type='text' and @name='username']` `//input[@id='email' or @name='email']`  
  - **by Relationship**  
    1. `/` Selects a direct child. `//div/p` `//div/child::p`  
    2. `//` Selects nodes anywhere in the document. `//p` `//input[@value='Submit']`  
    3. `..` Selects the parent node of the current node. `//label[text()='Username']/..`  
    4. `following-sibling::` Selects siblings that appear after the current node.  `//label[text()='Email']/following-sibling::input` `//div[b[text()='Created']]/following-sibling::div]`  
    5. `preceding-sibling::` Selects siblings that appear before the current node.  `//input[@type='password']/preceding-sibling::label` `//label[text()='Password']/preceding-sibling::/p`  
    6. `descendant:: Selects all descendants of the current node.  `//div[@id='container']/descendant::button`  
  - **with Function**  
    `//div[contains(@class, 'btn')]` `//input[starts-with(@name, 'user')]` `count(//div)`  
    
## 🏷️ Tags & Keyword
`Katalon Studio` `Test Automation` `Selenium` `API Testing` `UI Testing` `Mobile Testing` `Data-Driven Testing`  
`Test Suites` `Test Cases` `Software Testing` `Continuous Integration` `CI/CD` `Automation Framework`  

## 🚀 How to Run the Tests  
1️⃣ Clone this repository  
```bash
git clone https://github.com/dzikrinasa/Katalon-Studio-Portfolio.git

