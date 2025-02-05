Feature: Flight reservation 
@tag1
Scenario: Flight reservation login details with Valid credentials
Given i open my browser url "https://flights.qedgetech.com/"
When i enter  my username "sravankumar.shamala@gmail.com"
When i enter my password "Sravan@1234"
And i click on sign in button
And i select date of flight
And i select fly from 
And i select fly to
And i enter my name "sravan"
And i select business
And click on insert
When i click on logout button
When i close my browser

@tag2
Scenario: Deletion of flight booking
Given i open my browser url "https://flights.qedgetech.com/"
When i enter  my username "sravankumar.shamala@gmail.com"
When i enter my password "Sravan@1234"
And i click on sign in button
And i select date of flight
And i select fly from 
And i select fly to
And i enter my name "sravan"
And i select business
And click on insert
And click on flight booking
And click on delete button
When i click on logout button
When i close my browser


@tag3
Scenario Outline: Flight registration login with invaild credentials 
Given i open my browser url "https://flights.qedgetech.com/"
When i enter  my username "<user name>"
When i enter my password "<password>"
And i click on sign in button
Then i should see error message is to display
And i close my browser

Examples:
|user name|password|
|sravankumar.shyamala@gmail.com|sk@123|
|sravan@gmail.com|ssk@123|
|s_k@gmai.com|ssk@123|
|sai@gmail.com|ssk@123|
