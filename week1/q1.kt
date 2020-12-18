// Tell whether the number is positive or negative
fun main() 
{
  print("Enter number: ")
  var num = Integer.valueOf(readLine())
  val sign: String = if (num>0)
        {
          "positive"
        }
      else if (num<0)
        {
          "negative"
        }
      else
        {
          "0 is neither positive nor negative"
        }
  println(sign)
}
