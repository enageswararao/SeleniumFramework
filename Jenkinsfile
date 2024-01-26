pipeline {
agent any
    stages {
      stage('Back-end') {
            agent {
                any {
                  label 'dockerserver'   
                  image 'maven:3-alpine'
                }
            }
            steps {
                sh 'mvn --version'
            }
        }
      
        stage('Build') {
            steps {
                sh 'mvn -version'
                sh 'mvn clean install'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}
