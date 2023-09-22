def call() {  
        def mavenHome = tool name: "Maven-3.9.4", type: "maven"
        def mavenPath = "${mavenHome}/bin/mvn"
        sh "${mavenPath} clean package"

 // sh "mvn clean package"
}
