def buildImage(String Ima) {
    echo "building the docker image..."
    withCredentials([string(credentialsId: 'dockerpasswd1', variable: 'dockerpasswd1')]) {
         sh 'docker build -t mahesh2024/jenkins-sl:${BUILD_NUMBER} .'
                   		 sh 'docker login -u mahesh2024 -p ${dockerpasswd1}'
                   		 sh 'docker push mahesh2024/jekins-sl:${BUILD_NUMBER}'



       
    }
} 
