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
                sh '''
                    echo "Compilando proyecto con Gradle..."
                    chmod +x ./gradlew
                    ./gradlew clean build
                '''
            }
        }

    }
}
