```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main extends App {
  val myInt = new MyClass(10)
  myInt.printValue() // Prints 10

  val myString = new MyClass("Hello")
  myString.printValue() // Prints Hello

  // This will NOT compile, because the type parameter T is not constrained
  val myList = new MyClass(List(1, 2, 3))
  myList.printValue()
}
```