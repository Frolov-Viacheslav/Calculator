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
        sh '''
              cd /home/jenkins
              git clone "https://github.com/Frolov-Viacheslav/HelloWorld.git"
              cd /home/jenkins/HelloWorld
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
        sh '''scp /home/jenkins/HelloWorld/Hello.jar client:/home/slava
              rm -r /home/jenkins/HelloWorld
           '''
      }
    }
  }
}
