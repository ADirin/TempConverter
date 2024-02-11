pipeline {
    agent any
    environment {
        PATH = "c:\\WINDOWS\\SYSTEMS32"
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
            steps {
                bat 'mvn test'
            }
        }
    }
}
