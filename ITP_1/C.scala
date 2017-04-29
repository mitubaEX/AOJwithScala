
object Main{
  def main(args:Array[String]) ={
    val scanner = new java.util.Scanner(System.in)
    val a = scanner.nextInt
    val b = scanner.nextInt
    println((a * b) + " " + (a * 2 + b * 2))
  }
}
