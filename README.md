### Android Application for Siemens MakeITReal 2019 Hackathon



**Required libraries :** 

0: **Dagger Android** : Dependency Injection Framework

1: Butterknife : Injecting views

2: Android Architecture Components(MVVM) -- ViewModel and LiveData

3: Retrofit and GSON : for Api Requests

4: Material Design Components MDC

5: RxJava 2

6: Firebase Cloud messaging : For sending real time notifications

|||
|--|--|
|MainActivity|activity_main|
|HomeFragment|fragment_home|
|for listLayouts in recyclers etc|item_user|




## Project Structure

| directory/files |purpose  |
|--|--|
|  `data`| Contains Data Services , REST API calls , Firebase, Shared Prefs   |
|`AppDataManager`|Encapsulates all data sources into a single entity by combining the interfaces and implementing them|
|`base`|Contains Base classes|
|`di`|Contains di modules and components|
|`di->modules`|has modules for fragments and activities. They provide dependencies|
|`di->components`|has components for dagger|
|`ui`|contains the Activities and Fragments . The hierarchy is followed as Application ==> Activities ==> Fragments. An Application is a single entity of the application. But it can have multiple Activities. Each Activity also can have multiple fragments.|
|`ViewModels`|Each Activity has its own view model. View model connects data to view. An Activity can access its `own` view model and `appViewModel`. 
|`config`|contains configuration keys. The Base URL for the app.|

# Flow in the app -

When the user(farmer) first opens the app , the user will get an login screen . The user can login with this form or go to the registration page if he/she is a new user. In the registration form, the user needs to fill first name, last name , email and password. Once the user clicks on the register button, he/she will receive an email to his registered email id. The home page contains various options for the farmer . We have implemented the appointments part. 

## Expert hiring(meeting the experts)

This is one of the most important feature of our app . With this feature a farmer can get a list of experts and ask for an appointment with him. The farmer needs to send his location and requirements/descriptions through the form. Acceptance of the meeting depends upon the farmer. He can either accept an offer or decline it. 

For Farmer part - 
* In home screen , go to contact the experts tab.
* Enter your location and search for the availble farmers.
* The user will get a list of experts availble. He can select one of them , this will lead to that expert's full profile.
* If the user is interested, he can organize the meeting by filling up form and providing the requirements .
* Once the user fills the form up, the expert will get notified about the app.

For Expert part - 
* In home screen , go to appointments tab.
* A list of appointments will pop up.
* The expert can accept or decline a request depending upon his choice.
