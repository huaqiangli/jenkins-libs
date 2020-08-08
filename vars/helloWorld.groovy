def call(Map config = [:]) {
  sh "echo Hello World ${config.name}. It is ${config.dayOfWeek}."
}
