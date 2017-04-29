
object Main{
  def check(a:Int, b:Int, c:Int) = {
    var d:Int = 0
    for(i <- a to b){
      if(c % i == 0)
        d += 1
    }
    println(d)
  }
  def main(args:Array[String]) = {
    val scanner = new java.util.Scanner(System.in)
    val a = scanner.nextInt
    val b = scanner.nextInt
    val c = scanner.nextInt
    check(a, b, c)
  }
}
