def call() {
  sh 'docker { image 'maven:3.8.1-adoptopenjdk-11' }'
  sh ' mvn clean install '
}
