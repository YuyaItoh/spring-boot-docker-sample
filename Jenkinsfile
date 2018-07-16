pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
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
