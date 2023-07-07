class Person(val name: String, val age: Int, val CNIC: String) {

  init {
    name = "fatiq"
    age = 20
    CNIC = "123"
  }
    
}

fun main() {

  // create object(instance) 
  val person = Person()  // it will automatically prints the infromation about Person when it runs as the init block runs first.
  
  
}
