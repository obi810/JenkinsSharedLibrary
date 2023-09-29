def call(String stageName){

  if("${StageName}" == "Build"){
    echo "building package"
    sh "mvn package"
    echo "building done"
  }
   if("${StageName}" == "Test"){
    echo "test package"
    sh "mvn sonar:sonar"
    echo "testing done"
  }
   if("${StageName}" == "Deploy"){
    echo "deploying to nexus"
    sh "mvn deploy"
    echo "deployment done"
  }
}
     
     
