// Find the maximum of 3 numbers
fun main() 
{
  print("Enter 3 numbers: ")
  var num1 = Integer.valueOf(readLine())
  var num2 = Integer.valueOf(readLine())
  var num3 = Integer.valueOf(readLine())
  val max = if (num1>=num2 && num1>=num3)
              {
                num1
              }
            else if (num2 >= num1 && num2 >= num3)
              {
                num2
              }
            else
              {
                num3
              }
  println ("largest of 3 numbers is : " + max)          
}
