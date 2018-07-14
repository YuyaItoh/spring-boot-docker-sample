node {
   stage('Git Pull') {
       git 'git@github.com:YuyaItoh/spring-sample.git'
   }
   
   stage('Build') {
       sh './gradlew build'
   }
}
