// src/org/foo/Point.groovy
package org.foo

// point in 3D space
class Point {

  def imprimir()
  {
    sh "echo 'Hello20'"
  }

  def call2(imprimir) {
    sh "echo 'Hello20'"
  }

  float x,y,z
}
