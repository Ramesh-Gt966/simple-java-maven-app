pipeline {
    agent any

    tools {
        maven 'Maven_3.9.1' // Match the name you gave in Jenkins
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        // other stages...
    }
}