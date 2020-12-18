// Program to find whether a given charectar is alphabet or not
fun main()
{
    print("Enter the charectar: ")
    var c = readLine()!![0]
    var lowerCase = 'a'..'z'          // Range for lowercase alphabet
    var upperCase = 'A'..'Z'
    val ans: String = if (c in lowerCase || c in upperCase)
              {
                  "Yes"
              }
              else
              {
                  "No"
              }
    println ("Is $c a charectar : $ans")
}
