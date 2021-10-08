pipeline {
  agent any
  environment {
      NEW_VERSION = '1.3.0'
  }
  stages {
      stage("build"){
          steps{
              echo 'Building the application ... '
              echo "Bbuilding version ${NEW_VERSION}"
          }
      }
      stage("test"){
          steps{
              echo 'Testing the application ... '
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
