// Finding factorial of a number
fun main()
{
    print("Enter a number : ")
    var num  = Integer.valueOf(readLine())
    var factorial = 1
    while (num>0)
    {
        factorial = factorial * num
        num--
    }
    println ("Factoral of the number = $factorial")
}
