# Java Jenkins Project

## Overview
This project is a simple Java application that demonstrates the use of Jenkins for Continuous Integration and Continuous Deployment (CI/CD). The application includes a greeting functionality and is tested with multiple test cases to ensure reliability.

## Project Structure
```
java-jenkins-project
├── src
│   ├── main
│   │   └── java
│   │       └── App.java
│   └── test
│       └── java
│           ├── AppTest1.java
│           ├── AppTest2.java
│           ├── AppTest3.java
│           ├── AppTest4.java
│           └── AppTest5.java
├── pom.xml
├── Jenkinsfile
└── README.md
```

## Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/java-jenkins-project.git
   cd java-jenkins-project
   ```

2. **Build the Project**
   Ensure you have Maven installed. Run the following command to build the project:
   ```bash
   mvn clean package
   ```

3. **Run Tests**
   To execute the tests, use:
   ```bash
   mvn test
   ```

## Usage
The main application can be run using the following command:
```bash
java -cp target/java-jenkins-project-1.0-SNAPSHOT.jar App
```

## CI/CD with Jenkins
This project is configured to work with Jenkins. The `Jenkinsfile` defines the pipeline for building the project and running tests automatically on code changes.

## Contributing
Feel free to submit issues or pull requests for improvements or bug fixes.