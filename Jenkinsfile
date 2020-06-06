node('node'){
        stage('git'){
            git 'https://github.com/itev4n7/CourseProject.git.git'
        }
        stage('Compile Stage'){
            withGradle(gradle : 'gradle 6.5') {
                sh 'gradle build'
            }
        }
        stage ('Testing Stage'){
            withGradle(gradle : 'gradle 6.5') {
                sh 'gradle :chrome'
            }
        }
}