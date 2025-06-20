def call() {
    sh 'trivy image umang6121/youtube:latest > trivyimage.txt'
}
