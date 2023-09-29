def call(String stageName){

  if("${stageName}" == "Build"){
    echo "building package"
    sh "mvn package"
    echo "building done"
  }
   if("${stageName}" == "Test"){
    echo "test package"
    sh "mvn sonar:sonar"
    echo "desting done"
  }
   if("${stageName}" == "Deploy"){
    echo "deploying to nexus"
    sh "mvn deploy"
    echo "deployment done"
  }
}
     
     
