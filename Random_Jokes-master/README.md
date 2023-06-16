# Random Jokes Spring Boot Project
This is a simple Spring Boot project that retrieves a random joke from the Chuck Norris API.

>Prerequisites

* Java Development Kit (JDK) installed on your machine.

* Internet connectivity to access the Chuck Norris API.

>## Getting Started

* Clone or download the project from the repository.
* Import the project into your preferred Java Integrated Development Environment (IDE).
* Ensure that the required dependencies are resolved and imported correctly.
>## Running the Application
* Locate the RandomJokesNew class in your IDE.
* Run the main method within the RandomJokesNew class.
>## Functionality
The application performs the following steps:

* Creates a URL object to connect to the Chuck Norris API.
* Opens a connection using the created URL.
* Sets the request method as "GET".
* Retrieves the response code from the connection.
* If the response code is 200 (OK):
* Creates a BufferedReader to read the response from the API.
* Appends the response line by line to a StringBuffer.
* Closes the BufferedReader.
* Parses the JSON response into a JSONObject.
* Prints the retrieved joke to the console.
* If the response code is not 200, it prints the response code to the console.
>Note

* Make sure you have an active internet connection when running this application, as it relies on accessing the Chuck Norris API to retrieve the random joke.

* Please be aware that the Chuck Norris API may have usage limitations or require an API key for certain features. Refer to the API documentation for more details.

>Acknowledgments

This project utilizes the Chuck Norris API to provide random jokes. For more information about the API, please visit their website: https://api.chucknorris.io
