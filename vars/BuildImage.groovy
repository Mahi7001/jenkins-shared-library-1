def buildImage() {
    echo "building the docker image..."
    withCredentials() {
        sh 'docker build -t mahesh2024/demo-app:jma-2.0 .'
        sh "echo $dockerpasswd1 | docker login -u mahesh2024 --password-stdin"
        sh 'docker push mahesh2024/demo-app:jma-2.0'
    }
} 
