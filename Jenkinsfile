#!groovy
properties([disableConcurrentBuilds()])

pipeline {
  agent{
    label 'slave02'
  }
 triggers {pollSCM('* * * * *')} 
 options {
    timestamps()
  }
  stages {
    stage('Build app') {
      steps {
        sh '''cd /home/slava/HelloWorld
              javac HelloWorld.java
              echo "Main-class: HelloWorld" > 'MANIFEST.MF'
              jar cvmf MANIFEST.MF Hello.jar HelloWorld.class
              chmod +x Hello.jar
              ./Hello.jar
           '''
      }
    }
     stage('Send app') {
      steps {
        sh '''scp /home/slava/HelloWorld/Hello.jar 192.168.0.107:/home/slava
           '''
      }
    }
  }
}
