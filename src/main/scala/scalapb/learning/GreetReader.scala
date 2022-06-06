package scalapb.learning
import scalapb.learning.greeting.Greet

import java.io.FileInputStream
import com.google.protobuf.CodedInputStream

object GreetReader {

  def readGreet(fileName: String)={
    val greetBuilder = Greet.newBuilder
    val in = new FileInputStream(fileName)

    val greet = greetBuilder.merge(CodedInputStream.newInstance(in)).result()
    println("Greeting: " + greet.greeting + "\n" + "Username: " + greet.username)

  }
}
