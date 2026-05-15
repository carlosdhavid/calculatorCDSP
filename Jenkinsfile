pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                sh './gradlew clean compileJava'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('JaCoCo Report') {
            steps {
                sh './gradlew jacocoTestReport'
            }
            post {
                always {
                    jacoco execPattern: 'build/jacoco/test.exec',
                           classPattern: 'build/classes/java/main',
                           sourcePattern: 'src/main/java',
                           inclusionPattern: '**/*.class',
                           exclusionPattern: ''
                }
            }
        }

        stage('Checkstyle') {
            steps {
                sh './gradlew checkstyleMain checkstyleTest'
            }
            post {
                always {
                    recordIssues(
                        tool: checkStyle(pattern: 'build/reports/checkstyle/*.xml')
                    )
                }
            }
        }
    }
}
