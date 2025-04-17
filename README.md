
# library_management

# Assumptions
1. The system is a single user
2. I assumed an in-memory collection(List) for storing book records instead of using a database because this allows for quick prototyping without requiring database setup.
3. The systemm will generate a unique id for each book
4. search is case insensitive
5. Book deletion is permanent
6. book deletion can be done only by using id not title
7. Spring MVC is used with REST Api

# Technologies used
Java 17+
Spring Boot 3+
Spring MVC
Lombok (to reduce boilerplate code)
MySql(to store the data of the table)

# Setup Instructions

Step 1- Clone the repository
git clone https://github.com/codascripts/library-management.git
cd library-management

Step 2- Ensure you have JDK 17+ installed
java -version

Step 3- Build the project using Maven
mvn clean install

Step 4- Run the application
mvn spring-boot:run

Step 5- Access the application
http://localhost:8080

# Future Improvements
Add authentication and authorization for librarians
Could have handled concurrency issues since I only considered a single user in this case
Implement role-based access control for different user roles (e.g., admin, librarian, visitor)
could have done unit and integration testing using JUnit and Mockito.
Enhance search functionality with filters (e.g., genre, author)



Author: Emmanuel Allada

