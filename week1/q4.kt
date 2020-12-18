// To check if number is divisible by 5 and 11
fun main()
{
    print("Enter a number : ")
    var num1 = Integer.valueOf(readLine())
    val ans: String = if (num1%5 == 0)
              {
                  if (num1 % 11 == 0)
                  {
                      "Yes"
                  }
                  else
                  {
                      "No"
                  }
              }
              else
              {
                    "No"
              }
    println ("Is number divisible by 5 and 11 : " + ans)
}
