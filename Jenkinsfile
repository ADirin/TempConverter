pipeline {
    agent any
    environment {
        PATH = "${env.PATH};C:\\Windows\\System32" // Update the PATH to include the directory of cmd.exe
        GIT_CREDENTIALS = credentials('ADirin')
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: 'ADirin', url: 'https://github.com/ADirin/FarToCel_Fall2024.git'
            }
        }
        stage('Build') {
    steps {
        bat 'mvn clean install'
    }
}
        stage('Test') {
           post {
               success {
                   //3 To report the the JACOCO in Jenkins
                 // Publish JUnit test results
                 // Generate JaCoCo code coverage report
                    jacoco(execPattern: '**/target/jacoco.exec')
                junit '**/target/surefire-reports/TEST-*.xml'
               }
            }
        }
    }
}
