package org.demo

class Utilities implements Serializable {
  def env
  Utilities(env) {
    this.env = env
  }

  public print()
  {
      println this.env
  }
}