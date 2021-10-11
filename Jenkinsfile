def gv

pipeline {
  agent any
  parameters {
      choice(name: 'CHOICES', choices: ['7', '8', '9'], description: 'testing choices param')
  }
  tools{
      maven 'Maven'     
  }

  environment {
      NEW_VERSION = '1.3.0'
  }
  stages {
      stage("init"){
          steps{
              script {
                  gv = load "script.groovy"
              }

          }
      }
      stage("build"){
          steps{
              script {
                  gv.buildApp()
              }
          }
      }
      stage("test"){
          steps{
              script {
                  gv.testApp()
              }
          }
      }
      stage("deploy"){
          steps{
		      gv.deployApp()	
          }
          post{
             always {
     	         echo 'stage deploy is finished'   
             }
          }
      }
  }
  post{
    always {
     	echo 'stage or pipeline is finished'   
    }
}
}
