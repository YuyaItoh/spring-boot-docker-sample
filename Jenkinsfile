pipeline {
    agent any
    environment {
        AWS_API_TOKEN = credentials('aws_ap_token')
    }
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
                sh 'echo deploying'
                sh "echo using api_token = $AWS_API_TOKEN"
                sh 'echo deploy completed!'
            }
        }
    }
}
