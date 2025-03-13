// def call(String Project, String ImageTag, String DockerHubUser){
//   sh "docker rmi ${DockerHubUser}/${Project}:${ImageTag}"
// }
def docker_cleanup() {
    sh """
        docker image prune -a -f
    """
}