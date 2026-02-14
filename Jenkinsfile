pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Revan-TY/NEWDEMO.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Execute Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
    always {
        junit '**/target/surefire-reports/*.xml'

        allure includeProperties: false,
               jdk: '',
               results: [[path: 'target/allure-results']]
    }
}

}
