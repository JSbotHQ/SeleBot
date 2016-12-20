# SeleBot

Selebot is the selenium TestNG framework with the various build in functionality and methods.It's designed with the vision of rapidly selenium script generation.

#### Prerequest :
    1. Java
    2. Maven

#### How to start :

1. Download the [repo](https://github.com/jsBot-io/SeleBot/archive/master.zip)
2. Maven will automatically download all the dependency

#### File Structure:

        .
       
        └── src                                   
        ├── resources                              # Resource files and general configuration files
        │   ├── general.properties                 # General configuration 
        │   └── ObjectRepo                         # Properties files with the locator details
        │       └── login.properties                
        └── test
        └── java
        ├── Config                                 # configuration and methods
        │   ├── General
        │   │   ├── ExcelFileConfig.java           # Excel file realated methods
        │   │   ├── JsonFileConfig.java            # JSON file realated methods
        │   │   ├── Methods.java                   # Selenium and General operation method
        │   │   ├── PerformAction.java             # Selenium actions
        │   │   ├── PropertiesConfig.java          # Property file realted methods
        │   │   └── VerificationMethods.java
        │   └── SeleniumConfig                     # Selenium Configuration
        │       ├── AbstractPage.java
        │       └── BrowserConfig.java             # Browser configuration
        └── Tests                                  # Test
        ├── LoginModule                            # Module   
        │   └── Tests.java                         # TesNG Test Methods
        │   ├── Steps.java                         # Steps logic
        │   └── Verify.java                        # Assertation
        
  
        
        
        
        
## Start to create Test cases :
  
### 1. Add all the locators in properties file under ObjectRepo directory
  
  For e.g
  
###### For login screen, create login.properties
  
 **Add locator in following format**
  
 ``` 
 elementname.locatortype = locator 
 ```
  
##### For XPath
  
  ```
 loginButton.xpath = //a[contains(text(),'Login')]
  ```

#####  For ID
  
  ```
 loginButton.id = coolestWidgetEvah
  ```
  
#####  For Class Name
  
  ```
 loginButton.className = cheese
  ```
#####  For Tag Name
   
```   
loginButton.tagName = iframe
  ```
#####  For Link Text
  
  ```
loginButton.linkText = cheese
  ```
  
#####  For PartialLinkText
  
  ```
loginButton.partialLinkText = cheese
  ```
#####  For Name
  ```
loginButton.name = cheese
  ```
#####  For CSS Selector
  ```
loginButton.cssSelector = #food span.dairy.aged
  ```
  
  
   
### 2. Create the module directory like LoginModule under Tests directory
      
### 3. Create test class      
    
 Add TestNG Test and steps
   
   ```
  performAction.click("Propery file Name", "locator name");
  ```
  
    
    
     
     @Test
     public void Login() {
        
       performAction.click("login", "loginbutton");
    
       performAction.sendKeys(currentFileName, "email", "Test@Test.com");
       
       performAction.pause(3);
     }
       
        