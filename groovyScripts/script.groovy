def buildApp() {
    echo 'Building the application ... '
    echo "Bbuilding version ${NEW_VERSION}"
    echo "Choice is ${params.CHOICES}"
}

def testApp() {
    echo 'Testing the application ... '
    echo 'Show maven version: ' 
    sh "mvn -version"
}

def deployApp() {
    echo 'Deploying the application ... '
}

return this