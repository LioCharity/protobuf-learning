package scalapb.learning

import scalapb.learning.greeting.Greet

import java.io.FileOutputStream

object GreetWriter {

  def writeGreet(aGreeting: String, aUserName: String, fileName: String): Unit = {
    val greeting = Greet(aGreeting, aUserName)
    val out = new FileOutputStream(fileName)

    println("Saved greeting with following data to disk: \n" + greeting)

    greeting.writeTo(out)
  }
}
