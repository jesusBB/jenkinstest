pipeline {
  agent any
  
  stages {
      stage("build"){
          steps{
              echo 'Building the application ... '
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
