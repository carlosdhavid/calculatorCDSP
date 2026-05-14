pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/carlosdhavid/calculatorCDSP.git', branch: 'main'
            }
        }

        stage('Compile') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}
}
