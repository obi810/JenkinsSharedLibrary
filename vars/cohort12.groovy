def call(string StageName){

  if("${StageName}" == 'Build'){
    echo "building package"
    sh "mvn package"
    echo "build success"
  }
   if("${StageName}" == 'Test'){
    echo "test package"
    sh "mvn sonar:sonar"
    echo "test done"
  }
   if("${StageName}" == 'Deploy'){
    echo "deployment package"
    sh "mvn deploy"
    echo "deployment successful"
  }
}
     
     
