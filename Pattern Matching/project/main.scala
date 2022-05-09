// pattern matching
object pattern {
  def main(args: Array[String]): Unit = {
    var result = out("Good")
    print(out)
  }
  def out(a:Any):Any = a match {
    case 1 => println("Nice")
    case "Bad" => println("Bad")
    case "Good" => println("Good")
    case _ => println("No")
  }
}
