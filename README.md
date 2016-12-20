**SeleBot**

Selebot is the selenium TestNG framework with the various build in functionality and methods.It's designed with the vision of rapidly selenium script generation.

Prerequest :
    1. Java
    2. Maven

How to start :

1. Download the repo
2. Maven will automatically download all the dependency

File Structure:

        .
       
        └── src                                   
        ├── resources                              # Resource files and general configuration files
        │   ├── general.properties                 # general configuration 
        │   └── ObjectRepo                         # properties files with the locator details
        │       └── login.properties                
        └── test
        └── java
        ├── Config                                 # configuration and methods
        │   ├── General
        │   │   ├── ExcelFileConfig.java           # Excel file realated methods
        │   │   ├── JsonFileConfig.java            # Json file realated methods
        │   │   ├── Methods.java                   # Selenium and General operation method
        │   │   ├── PerformAction.java             # Selenium actions
        │   │   ├── PropertiesConfig.java          # property file realted methods
        │   │   └── VerificationMethods.java
        │   └── SeleniumConfig                     # Selenium Configuration
        │       ├── AbstractPage.java
        │       └── BrowserConfig.java             # Browser configuration
        └── Tests                                  # Test
        ├── LoginModule                            # Module   
        │   └── Tests.java                         # TesNG Test Methods
        │   ├── Steps.java                         # Steps logic
        │   └── Verify.java                        # Assertation
        
        
        
        
        
       
       
       
        