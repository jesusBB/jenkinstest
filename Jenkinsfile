pipeline {
  agent any
  parameters {
      choice(name: 'CHOICES', choices: ['10', '11', '12'], description: 'testing choices param')
  }
  tools{
      maven 'Maven'     
  }

  environment {
      NEW_VERSION = '1.3.0'
  }
  stages {
      stage("build"){
          steps{
              echo 'Building the application ... '
              echo "Bbuilding version ${NEW_VERSION}"
              echo "Choice is ${params.CHOICES}"
          }
      }
      stage("test"){
          steps{
              echo 'Testing the application ... '
              echo 'Show maven version: ' 
              bat "mvn -version"
          }
      }
      stage("deploy"){
          steps{
              echo 'Deploying the application ... '
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
