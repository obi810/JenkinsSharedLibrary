def call(String stagename){

  if("${stagename}" == "Build"){
    echo "building package"
    sh "mvn package"
    echo "build success"
  }
   if("${stagename}" == "Test"){
    echo "test package"
    sh "mvn sonar:sonar"
    echo "testing done"
  }
   if("${stagename}" == "Deploy"){
    echo "deploying to nexus"
    sh "mvn deploy"
    echo "deployment successsful"
  }
}
     
     
