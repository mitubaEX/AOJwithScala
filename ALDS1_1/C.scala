
object Main{
  def main(args:Array[String]) = {
    val lines = for{
      in <-scala.io.Source.stdin.getLines()
    }yield if(isPrime(in.toInt)) in else -1

    println(lines.filter(_ != -1).length)
  }
  def isPrime(n : Int) : Boolean = (2 to Math.sqrt(n).toInt).forall(n % _ != 0)
}
