pipeline {
    agent {
        docker {
            image 'gradle:4.8-jdk8'
        }
    }
    stages {
        stage('Initialize') {
            steps {
                sh 'gradlew clean'
            }
        }
        stage('Build') {
            steps {
                sh 'gradlew build'
            }
            post {
                always {
                    junit testResults: 'build/test-results/**/*.xml', allowEmptyResults: true
                }
            }
        }
    }
}
