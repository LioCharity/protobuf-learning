package scalapb.learning

import scalapb.learning.proto.person.Person

object Demo {
  def main(args: Array[String]): Unit = {

    println("---------------- Test Person Proto ---------------------")
    val person = Person(name="John", age=38)
    println(person.toByteArray.toVector)
    println("/n/n")


    println("---------------- Test Greeting Proto: Write ---------------------")
    GreetWriter.writeGreet("Welcome to ...", "Lionel Souop", "src/main/resources/greeting-file.txt")
    println("/n/n")

    println("---------------- Test Greeting Proto: Read ---------------------")
    GreetReader.readGreet("src/main/resources/greeting-file.txt")
    println("/n/n")
  }
}

