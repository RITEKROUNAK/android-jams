// Program to find the type of triangle
fun main()
{
    print("Enter 3 sides of the triangle: ")
    var num1 = Integer.valueOf(readLine())
    var num2 = Integer.valueOf(readLine())
    var num3 = Integer.valueOf(readLine())
    val ans: String = if (num1 == num2)
              {
                  if (num1 == num3)
                  {
                      "Equilateral"
                  }
                  else
                  {
                      "Isoceles"
                  }
              }
              else if (num2 == num3)
              {
                    "Isoceles"
              }
              else if (num1 == num3)
              {
                    "Isoceles"
              }
              else
              {
                  "Scalene"
              }
    println ("Type of triangle : " + ans)
}
