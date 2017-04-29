
object Main{
  def main(args:Array[String]) = {
    val num = scala.io.StdIn.readLine.toInt;
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).reverse.toList;
    println(list.mkString(" "))
  }
}
