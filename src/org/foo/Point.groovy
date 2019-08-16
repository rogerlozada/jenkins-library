// src/org/foo/Point.groovy
package org.foo

// point in 3D space
class Point {

  def teste

  Point(_teste){
    this.teste = _teste
  }

  String imprimir()
  {
    return this.teste
  }

  float x,y,z
}
