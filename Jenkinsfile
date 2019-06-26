node ("windows") {
  stage ('Build') {
 
    git url: 'https://github.com/Dkg1994/Goibibo_Desktop'
 
    withMaven(...) {
 
      bat "mvn clean install"
 
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
}
