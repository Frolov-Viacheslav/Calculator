#!groovy
// Ждет окончания предыдущей сборки (нельзя несколько одновременно)
properties([disableConcurrentBuilds()]) 
pipeline {
  agent none
 options {
   // Выводить в логе сборки время каждой операции
   timestamps() 
  }
  stages {
    stage('Build app') {
      agent{label 'slave01'}
      steps {
        // shell скрипт
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
    stage('Copy file') {
      agent{label 'master'}
      steps {
        // shell скрипт
        sh ''' 
              scp 172.17.0.1:/home/jenkins/HelloWorld/Hello.jar /var/jenkins_home/
           '''
      }
    }
  }
  post { 
       agent{label 'slave01'}
        // Выполняет в конце сборки (всегда)
        always { 
            sh  "rm -r HelloWorld"
        }
    }
}
