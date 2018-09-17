package org.foo
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def mvn3(args) {
    steps.sh "${steps.tool 'M3'}/bin/mvn -o ${args}"
  }
}
