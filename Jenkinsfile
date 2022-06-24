pipeline { 
    agent any  
    stages { 
        stage('Clean') { 
            steps {
                      sh 'mvn clean install'
                  }
        }
        stage('Build') { 
            steps {
                      sh 'mvn clean verify'
                  }
        }
        stage('Report') { 
            steps {
                     sh 'mvn sonar:sonar -Dsonar.login=b2a32b022cec2f60902a7ab811876544af53ec4b'
                  }
        }
    }
}
