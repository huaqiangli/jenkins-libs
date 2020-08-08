def call(Map pipelineParams) {
    pipeline {
        agent any
        stages {
            stage('hello') {
                steps {
                    helloWorld(name: "${pipelineParams.name}", dayOfWeek: "${pipelineParams.dayOfWeek}")
                }
            }
        }
    }
}
