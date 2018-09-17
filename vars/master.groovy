def call(Closure body) {
    node('master') {
        body()
    }
}
