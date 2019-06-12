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
              cd /home/Slava/share
              git clone "https://github.com/Frolov-Viacheslav/HelloWorld.git"
              cd /home/Slava/share/HelloWorld
              javac HelloWorld.java
              echo "Main-class: HelloWorld" > 'MANIFEST.MF'
              jar cvmf MANIFEST.MF Hello.jar HelloWorld.class
              chmod +x Hello.jar
              ./Hello.jar
              rm -r /home/Slava/share/HelloWorld
           '''
      }
    }
  }
}
