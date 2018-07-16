pipeline {
    agent any

    stages {
        stage('Initialize') {
            steps {
                gradlew 'clean'
            }
        }
        stage('Build') {
            steps {
                gradlew 'build'
                junit 'build/test-results/**/*.xml'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo deploy completed!'
            }
        }
    }
}
