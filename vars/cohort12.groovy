def call(String stagename){

  if("${stagename}" == "Build"){
    echo "building package"
    sh "mvn package"
    echo "build success"
  }
   else if("${stagename}" == "Test"){
    echo "test package"
    sh "mvn sonar:sonar"
    echo "testing done"
  }
   else if("${stagename}" == "Deploy"){
    echo "deploying to nexus"
    sh "mvn deploy"
    echo "deployment successsful"
  }
}
     
     
