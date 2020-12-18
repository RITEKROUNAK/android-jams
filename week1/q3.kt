// Prints absolute value
fun main()
{
    print("Enter a number : ")
    var num1 = Integer.valueOf(readLine())
    val abs = if (num1<0)
                {
                    num1 * -1
                }
              else
                {
                    num1
                }
    println ("abosulte value of number is : " + abs)
}
