def call(string stagename){

  if("${stagename}" == 'Build'){
    then
    echo "echo building package"
    sh "mvn package"
    echo "building done"
  }
  else if("${stagename}" == 'Test'){
    then 
    echo "test package"
    sh "mvn package"
    echo "test done"
  }
  else if("${stagename}" == 'Deploy'){
    echo "deployment package"
    sh "mvn deploy"
    echo "deployment successful"
  }
}
    
     
     
