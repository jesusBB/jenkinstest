pipeline {
  agent any
  parameters {
      choice(name: 'CHOICES', choices: 'one two three', description: 'testing choices param')
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
              echo "Choice is ${CHOICE}"
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
