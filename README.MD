# Andrew Johnson test application submitted to Gravie.

Hello and thank you for looking at my application! The assignment was to create an application to rent games that uses the giantbomb.com API. 
I did my best in the time alotted. One thing that I feel strongly about is that the application has a secure back end. Since we are using an API key, 
we have a secret. It would not be responsible to put this secret in the reach of the front end, so in this application the key stays with the back end. 

I also would, if finishing this application, turn on the Spring Web Security in order to ensure that the front end is the only thing hitting the endpoints
within the application. I am keeping this explanation short, as I understand that the intention is that we might meet regarding this application to discuss 
the rationale underlying the design choices. I would definitely spend more time on the CSS if I were to further polish it. 

## Build/Local run instructions
This project is a Spring Boot/Gradle application backend with an Angular frontend bundled into the jar. The application runs with the Spring Boot built in Tomcat pattern.
To build the application all in one jar, run:

./gradlew clean build -x test

This skips the tests because there are no functional unit tests at this point. I am a big believer in unit tests but they are outside the scope of this demo. After running that 
gradle command, you should get a jar. Probably it will be in build/libs. You can CD to that directory then run the application with:

java -jar GameRenter-0.0.1-SNAPSHOT.jar --giant.bomb.api.key=[your_giant_bomb_api_key_goes_here]

I have also uploaded a .jar in case you want to skip the build, you can find it in /prebuild

Please note that I did not give my API key, I do not want to commit it to GitHub and the best practice of course is that it is only unencrypted in the application memory.
I have emailed my api key for your convenience. 

After running the application you can go to localhost:8080 and view the application. I do not have Spring Security turned on, but definitely
would were this a production application. If you would like to, you can also run the Java app, and then do ng serve in the frontend directory. This will run the 
frontend using Angular and allow you to enjoy the lack of compile time on changes to the front end. I adjusted the cors on the server to allow this functionality
only on localhost:4200. Please feel free to ask any questions thanks!

