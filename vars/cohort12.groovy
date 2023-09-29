def call(string StageName){

  if("${StageName}" == 'Build'){
    echo "building package"
    sh "mvn package"
    echo "build success"
  }
   if("${StageName}" == 'Test'){
    echo "test with sonarqube"
    sh "mvn sonar:sonar"
    echo "test done"
  }
   if("${StageName}" == 'Deploy'){
    echo "deploying to nexus"
    sh "mvn deploy"
    echo "deployment successful"
  }
}
     
     
