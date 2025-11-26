# Sample Java Project

This is a simple Java project designed for SonarQube analysis. The project contains intentional "code smells" and issues for educational purposes.

## Directory Structure
```
SampleJavaProject/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── com/
│   │       │   └── example/
│   │       │       ├── Main.java
│   │       │       ├── Calculator.java
│   │       │       └── LegacyPrinter.java
├── pom.xml
```

## Instructions to Use

1. Save the files in the specified folder structure.
2. Open the project in an IDE like IntelliJ IDEA, Eclipse, or VS Code.
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run SonarQube:
   - Start SonarQube (if using locally).
   - Use the **SonarScanner** to analyze the project:
     ```bash
     sonar-scanner \
       -Dsonar.projectKey=SampleJavaProject \
       -Dsonar.sources=./src \
       -Dsonar.host.url=http://localhost:9000 \
       -Dsonar.login=<your_sonarqube_token>
     ```
5. View the analysis results in the SonarQube dashboard.
