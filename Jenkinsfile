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
                    junit 'build/test-results/**/*.xml'
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
