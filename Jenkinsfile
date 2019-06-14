#!groovy
// Ждет окончания предыдущей сборки (нельзя несколько одновременно)
properties([disableConcurrentBuilds()]) 
pipeline {
  agent{
    // Выполняет сборку Jenkins master
    label 'master' 
  }
 options {
   // Выводить в логе сборки время каждой операции
   timestamps() 
  }
  stages {
    stage('Build app') {
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
  }
  post { 
        // Выполняет в конце сборки (всегда)
        always { 
            sh  "rm -r HelloWorld"
        }
    }
}
