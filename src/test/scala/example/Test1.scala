package example

import org.scalatest.freespec.AnyFreeSpec

class Test1 extends AnyFreeSpec {
  "test 1" in {
    sys.error("err")
  }
}
