node {
  stage ('Checkout') {
    git url: 'https://github.com/JUSTPERFECT/jenkins-iacTest.git'
  }
  stage ('Generate Jobs') {
    jobDsl sandbox: false, targets: '*.groovy'
  }
}
