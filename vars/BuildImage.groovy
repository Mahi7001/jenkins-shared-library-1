def buildImage() {
    echo "building the docker image..."
    withCredentials() {
        sh 'docker build -t mahesh2024/demo-app:jma-2.0 .'
        sh 'docker login -u mahesh2024 -p ${dockerpasswd1}'
        sh 'docker push mahesh2024/demo-app:jma-2.0'
    }
} 
