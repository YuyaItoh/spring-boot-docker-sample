pipeline {
    agent any
    environment {
        // JenkinsのGUIから設定。credentialsの引数が間違っている（= Jenkinsに存在しない）場合はエラーになる
        AWS_API_TOKEN = credentials('aws_api_token')
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
                echo "deploying using api-token $AWS_API_TOKEN ..."
                echo 'echo deploy completed!'
            }
        }
    }
}
