# REST-API-CLIENT

COMPANY: CODTECH IT SOLUTIONS

NAME: TANSHIKA J S 

INTERN ID: CTIS8691 

DOMAIN: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR: NEELA SANTHOSH

# PROJECT DESCRIPTION
Weather Prediction Application – Project Description

The Weather Prediction Application is a Java-based project developed to fetch and display real-time weather information of a selected city using a public REST API. This project demonstrates how Java applications can communicate with web services through HTTP requests and process JSON responses to provide meaningful output to the user. The application was developed using the Eclipse IDE, which is one of the most popular integrated development environments for Java programming.

The main objective of this project is to understand API integration in Java and learn how external data can be accessed and displayed in a structured format. In this application, the user can specify a city name, and the program connects to the OpenWeatherMap API to retrieve live weather details such as temperature, humidity, and weather conditions. The data received from the API is in JSON format, which is parsed and displayed clearly in the console.

# Technologies and Tools Used

The project was developed using the following technologies and tools:

Programming Language: Java
IDE Used: Eclipse IDE
API Used: OpenWeatherMap Weather API
Libraries Used: org.json library for JSON parsing
Platform: Java Development Kit (JDK)
Protocol Used: HTTP GET Request

Java was chosen because it is platform-independent, secure, and widely used for developing enterprise and web applications. Eclipse IDE was used because it provides features such as syntax highlighting, debugging tools, auto-completion, and easy project management, making development faster and more efficient.

# Working of the Application

The application begins by defining the API key and city name. A URL is then created using the OpenWeatherMap API endpoint along with query parameters such as city name, API key, and metric unit settings. The program uses the HttpURLConnection class to establish a connection with the API server and sends an HTTP GET request.

Once the request is sent, the server responds with weather information in JSON format. The application reads the response using BufferedReader and stores it in a StringBuilder. After receiving the complete response, the JSON data is parsed using the JSONObject class from the org.json library.

The program extracts important weather details such as:

City Name
Temperature
Humidity
Weather Description

Finally, the extracted information is displayed in a user-friendly format in the console window.

# Features of the Project
Retrieves real-time weather information
Displays temperature in Celsius format
Shows humidity percentage
Displays current weather conditions
Uses API integration and JSON parsing
Simple and easy-to-understand console interface
Applications of the Project

This project has several real-world applications. Weather forecasting systems are widely used in many industries and sectors. Some important applications include:

Travel and Tourism: Travelers can check weather conditions before planning trips.
Agriculture: Farmers can monitor weather conditions to plan irrigation and harvesting activities.
Transportation: Airlines, shipping companies, and road transport services use weather data for safe operations.
Mobile and Web Applications: Weather APIs are integrated into many mobile apps and websites to provide live weather updates.
Disaster Management: Authorities use weather predictions to issue warnings during heavy rain, cyclones, or storms.
Learning Outcomes

Through this project, important concepts of Java programming and web technologies were learned, including:

# Working with REST APIs
Handling HTTP requests and responses
Reading data from web servers
Parsing JSON data in Java
Exception handling
Using external libraries in Java projects

This project also improves problem-solving and practical coding skills by demonstrating how real-time applications interact with online services.
# output
<img width="816" height="222" alt="Image" src="https://github.com/user-attachments/assets/1ece8c50-4db5-472f-8773-04b0184fbdeb" />
