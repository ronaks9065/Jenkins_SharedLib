def call(String Project, String ImageTag, String DockerHubUser){
  sh "docker rmi ${DockerHubUser}/${Project}:${ImageTag}"
  sh "docker rmi -f \$(docker images -f \"dangling=true\" -q)"
}
