// Tell whether a 3 digit number is armstrong number or not
fun main()
{
    print("Enter a number : ")
    val num  = Integer.valueOf(readLine())
    var sum = 0
    var num1 = num
    while (num1 > 0)
    {
        var n = num1%10
        sum =  sum + mult (n)
        num1 = num1/10
    }
    if (sum == num)
    {
        println ("It is an Armstrong Number")
    }
    else
    {
        println ("It is not an Armstrong Number")
    }
}


fun mult (num : Int): Int
{
    var i =1
    var ans = 1
    while (i<=3)
    {
        ans = ans*num
        i = i+1
    }
    return ans
}
