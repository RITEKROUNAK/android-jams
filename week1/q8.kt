// sum of factorials
fun main()
{
    print("Enter a number : ")
    var num  = Integer.valueOf(readLine())
    var sum = 0
    while (num>0)
    {
        sum = sum + findFactorial (num)
        num = num-1
    }
    println ("Sum of factorial = $sum")
}


fun findFactorial (num: Int) : Int
{
    var factorial = 1
    var num1 = num
    factorial = if (num1 == 1)
    {
        1
    }
    else
    {
        while (num1 > 0)
        {
            factorial = factorial*num1
            num1 = num1-1
        }
        factorial
    }
    return factorial
}
