pipeline {
    agent any

    stages {
        stage('Initialize') {
            steps {
                sh './gradlew clean'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build'
            }
            post {
                always {
                    junit testResults: 'build/test-results/**/*.xml', allowEmptyResults: true
                }
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo deploy completed!'
            }
        }
    }
}
