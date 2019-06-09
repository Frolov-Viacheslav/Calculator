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
           '''
      }
    }
     stage('Send app') {
      steps {
        sh '''scp /home/slava/HelloWorld/HelloWorld.class 192.168.0.107:/home/slava
              ssh 192.168.0.107
              cd /home/slava
              java HelloWorld
           '''
      }
    }
  }
}
