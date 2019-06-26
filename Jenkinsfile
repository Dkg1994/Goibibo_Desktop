node{
 stage('SCM Checkout'){
 git 'https://github.com/Dkg1994/Goibibo_Desktop'
}
stage('Compile-Package'){
 
 def mvnHome = tool name: 'Maven Machine', type: 'maven'
 
 sh "${mvnHome}/bin/mvn"
}
}
