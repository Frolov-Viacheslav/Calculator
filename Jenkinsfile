#!groovy
properties([disableConcurrentBuilds()])
pipeline {
  agent{
    label 'master'
  }
 options {
    timestamps()
  }
  stages {
    stage('Build app') {
      steps {
        sh '''
              git clone "https://github.com/Frolov-Viacheslav/HelloWorld.git"
              cd HelloWorld
              javac HelloWorld.java
              echo "Main-class: HelloWorld" > 'MANIFEST.MF'
              jar cvmf MANIFEST.MF Hello.jar HelloWorld.class
              chmod +x Hello.jar
              java -jar Hello.jar
           '''
      }
    }
  }
  post { 
        always { 
            sh  "rm -r HelloWorld"
        }
    }
}
