pipeline { 
    agent any  
    stages { 
        stage('Compile') { 
            steps {
                      sh 'mvn clean compile'
                  }
        }
        stage('Build') { 
            steps {
                      sh 'mvn clean verify'
                  }
        }
        stage('Report') { 
            steps {
                     sh 'mvn sonar:sonar -Dsonar.login=17bd99b5fa6d6f91532c13b8751abb3fdaa044c9'
                  }
        }
    }
}
