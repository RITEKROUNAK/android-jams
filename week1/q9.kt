// Sum of all the even numbers less than n 
fun main()
{
    print("Enter a number : ")
    val num  = Integer.valueOf(readLine())
    var num1 = 2
    var sum = 0
    sum = if (num < 2)
    {
        0
    }
    else
    {
        while (num1 <= num)
        {
            sum = sum + num1
            num1 = num1+ 2
        }
        sum
    }
    println ("sum of even numbers = "+ sum)
}
