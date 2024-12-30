```groovy
def myMethod(String name) {
  if (name == null || name.isEmpty()) {
    println "Name is null or empty"
    return
  }
  println "Hello, $name!"
}

myMethod(null)
myMethod("")
myMethod("Alice")
```