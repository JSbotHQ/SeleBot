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
        │   ├── general.json                       # General configuration
        │   └── ObjectRepo                         # Json files with the locator details
        │       └── login.json
        └── test
        └── java
        ├── config                                 # configuration and methods
        │   ├── General
        │   │   ├── ExcelFileConfig.java           # Excel file realated methods
        │   │   ├── JsonFileConfig.java            # JSON file realated methods
        │   │   ├── Methods.java                   # Selenium and General operation method
        │   │   ├── PerformAction.java             # Selenium actions
        │   │   └── Verify.java                    # Assertation
        │   └── SeleniumConfig                     # Selenium Configuration
        │       ├── AbstractPage.java
        │       └── BrowserConfig.java             # Browser configuration
        └── tests                                  # Test
        ├── LoginModule                            # Module   
        │   └── tests.java                         # TesNG Test Methods
        │   ├── Steps.java                         # Steps logic
        │   └── Verify.java                        # Assertation
        
  


        
## Start to create Test cases :
  
### 1. Add all the locators in Json file under ObjectRepo directory
  
  For e.g
  
###### For login screen, create login.json

Add locator details in following format

```
"Element name": {
    "locatorType" : "",
    "locatorValue" :  "",
    "default" : "",
    "textType" : "",
    "auto" : boolean
  },

```

Property      | Description  
----- | -----
Element name  | variable name
locatorType | any type of locator that is supported by selenium like xpath,classname,tagname,name etc. 
locatorValue | value of the locator
auto : true | Enter data automatically in textfield based on the textType
textType |  type of data, want to entered into text fields
default |  enter this data when auto mode is false

Last three properties are used for entering text into textfields

For example
```
"password": {
    "locatorType" : "xpath",
    "locatorValue" :  ".//input[@id='authPassword']",
    "default" : "123456",
    "textType" : "password",
    "auto" : false
  },
```


### 2. Create the module directory like LoginModule under tests directory
      
### 3. Create test class      
    
 Add TestNG Test and steps
   
   ```
  performAction.click("Json file Name", "locator name");
  ```
  
    
    
     
     @Test
     public void Login() {
        
       performAction.click("login", "loginbutton");
    
       performAction.sendKeys(currentFileName, "email");
       
       performAction.pause(3);
     }
       
        