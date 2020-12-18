// Create pattern
fun main()
{
    print("Enter a number : ")
    val num  = Integer.valueOf(readLine())
    var i = 1
    while (i<=num)
    {
        var j = 1
        while (j<=i)
        {
            print('#')
            j=j+1
        }
        println()
        i=i+1
    }
}
