# library-api

### Author

Alex May

### Program Description

This is a simple Library API Application that will list books and allow CRUD operations of the books within the Library.

### Notes

The most important requirements: create a library API that can list all books in the library and perform CRUD operations on a single book, and to do so in only a few hours, were met. I did want to make a full website using react, but I didn't want to spend more than an hour or two. Spring Boot is a very easy framework to use and makes the writing of code a lot simpler. I did make it so that the react web app works to list the books in the library, but nothing else was done. 

The following tutorial was used to help make the application: "https://spring.io/guides/tutorials/react-and-spring-data-rest/". 

### Program Use

Once the code is downloaded, import the application to an IDE (Eclipse or IntelliJ) as a Maven project. Run Maven install. Run the application from the DigicertLibraryApiApplication.java main method. This will start up the Spring Boot Server, and you can then use the application. The application should be running on http://localhost:8080.

Once the Spring application is running, you can send requests to the server to list the books in the library and perform CRUD operations.
It is recommended to use the Postman application, but 'curl' commands from the command line will work just fine.

If you'd like to run the most simple of web apps, you can then run from the command line: `npm run-script watch`. This will start up the web server so that you can see the lists of books by visiting http://localhost:8080/ in your browser.

### curl examples

The following are examples of using curl commands: 

To list the books in the library, use: 

`curl http://localhost:8080/api/books`

To see a particular book, you can add the id at the end: 

`curl http://localhost:8080/api/books/1`

To create a book, you will need to send the curl request with a JSON payload. An example below:

`curl -H 'Content-Type: application/json' -X POST -d '{"title" : "Lord of the Rings: The Fellowship of the Ring", "author" : "J.R.R Tolkien", "isbn" : "9780345253439"}' http://localhost:8080/api/books/`

To update a book, you will need to send the curl request with a JSON payload to the correct id. An example below:

`curl -H 'Content-Type: application/json' -X PUT -d '{"title" : "Harry Potter 1", "author" : "J.K. Rowling", "isbn" : "9780590353403"}' http://localhost:8080/api/books/1`

To delete a book, you will send the curl request with the book id at the end of the url as shown below:

`curl -X DELETE http://localhost:8080/api/books/1`