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
                sh './gradlew build | true'
                junit 'build/test-results/**/*.xml'
            }
        }
        stage('Deploy') {
            when {
                expression {
                    currentBuild.result == null || currentBuild.result == 'SUCCESS'
                }
            }
            steps {
                sh 'echo deploy completed!'
            }
        }
    }
}
