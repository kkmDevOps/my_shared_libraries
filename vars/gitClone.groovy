def call(repo) {           
  sh "git clone ${repo}"
  cd maven-web-app
}
