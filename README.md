Version:
---
1. Java JDK: `16.0.2`
2. Apache Maven: `3.8.1`
3. Apache Tomcat: `9.0.52`

Run the application:
---
We assume that You already installed maven and JDK 8 (minimum) on your environment.
1. Clone the repository: `git clone https://github.com/vutran260/springboot-thymeleaf.git`
2. Go to the folder: `cd springboot-thymeleaf`
3. Run the app: `mvn clean spring-boot:run`
4. Open Your favorite browser, then go to http://localhost:8080

It is free to make changes and implementations and make the code more evolved.

| #   | Username | Password |
| --- |:--------:| --------:|
| 1   | naruto   | 1234     |


Deploy the application to tomcat server:
---
1. Deploy to war file: `mvn package`
2. Copy war file to folder webapps of tomcat: 
3. Run the tomcat server: `catalina run`
