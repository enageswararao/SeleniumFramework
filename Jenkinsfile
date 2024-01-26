pipeline {
agent any
    stages {
   
        stage('Build') {
            steps {
                script {
                    sh 'curl -s "https://apache.mirror.digitalpacific.com.au/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.tar.gz" | tar xz'
                    sh 'export PATH=$PATH:/path/to/extracted/apache-maven-3.8.4/bin'
                    sh 'mvn clean install'
                }
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
