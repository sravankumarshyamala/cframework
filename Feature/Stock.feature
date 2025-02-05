Feature: Stock Account supplier
@tag1
Scenario Outline: Stock Account supplier
Given i open my browser_url "https://webapp.qedgetech.com/login.php"
When i enter stock account username "admin"
And i enter stock account password "master"
And click on stock account login button
And click on supplier
And click on Add icon
And capature the supplier number
And Enter supplier name "<suppliername>"
And Enter Address "<Address>"
And Enter city "<city>"
And Enter country "<country>"
And Enter contact person "<contactperson>"
And Enter phonenumber "<phonenumber>"
And Enter email "<email>"
And Enter Mobilenumber "<Mobilenumber>"
And Enter note "<notes>"
And click on inside Add icon
And click on Add new record
And click on Add succeeded
And click on search icon
And paste supplier number into search box
And click on search button
And click on supplier logout
And i close my stock account browser

Examples:
|suppliername|Address|city|country|contactperson|phonenumber|email|Mobilenumber|notes|
|saikumar|H-NO:1-6-119/A|Hyderabad|india|ssk|9948295941|ssk@gmail.com|8179477784|ssk|
|sravankumar|H-NO:1-6-119/A|Hyderabad|india|ssk1|9948205041|ssk1@gmail.com|817948884|ssk1|

@tag2
Scenario Outline: Stock Account customer
Given i open my browser_url "https://webapp.qedgetech.com/login.php"
When i enter stock account username "admin"
And i enter stock account password "master"
And click on stock account login button
And click on customer
And click on Add icon
And capature the customer number
And Enter customer name "<customername>"
And Enter Address "<Address>"
And Enter city "<city>"
And Enter country "<country>"
And Enter contact person "<contactperson>"
And Enter phonenumber "<phonenumber>"
And Enter email "<email>"
And Enter Mobilenumber "<Mobilenumber>"
And Enter note "<notes>"
And click on inside Add icon
And click on Add new record
And click on Add succeeded
And click on search icon
And paste customer number into search box
And click on search button
And click on customer logout
And i close my stock account browser

Examples:

|customername|Address|city|country|contactperson|phonenumber|email|Mobilenumber|notes|
|Aruna|H-NO:1-6-119/A|Hyderabad|india|ssk|9948285841|ssk@gmail.com|9948205041|Aruna|
|srinivas|H-NO:1-6-119/A|Hyderabad|india|ssk|9985422994|ssk@gmail.com|9985422994|srinivas|

