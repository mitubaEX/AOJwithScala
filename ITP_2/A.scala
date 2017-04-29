
object Main{
  def check(a:Int, b:Int) = {
    if(a > b)
      println("a > b")
    else if(a == b)
      println("a == b")
    else if(a < b)
      println("a < b")
  }
  def main(args:Array[String]) ={
    val scanner = new java.util.Scanner(System.in)
    val a = scanner.nextInt
    val b = scanner.nextInt
    check(a, b)
  }
}
