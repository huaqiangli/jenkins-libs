def call(body) {
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()
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
