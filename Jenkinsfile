pipeline {
    agent any

    tools {
        maven 'Maven3'
    }
    
    stages {
        
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    sh '''
                        echo "sucesso"
                    '''
                }
            }
        }
    }
}
