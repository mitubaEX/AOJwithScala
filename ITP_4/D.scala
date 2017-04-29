
object Main{
  def main(args:Array[String]) = {
    val num = scala.io.StdIn.readLine.toInt;
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    println(list.min + " " +  list.max + " " + list.sum)
  }
}
