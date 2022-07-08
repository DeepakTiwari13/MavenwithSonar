pipeline { 
    agent any  
    stages { 
        stage('Clean') { 
            steps {
                      sh 'mvn clean install'
                  }
        }
        stage('Report') { 
            steps {
                     sh 'mvn sonar:sonar -Dsonar.login=squ_0d8b52fcb016d768d34597fd73b86f083555b2be'
                  }
        }
    }
}
