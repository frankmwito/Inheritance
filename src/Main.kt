import java.util.Scanner
import kotlin.math.pow

//shape Hierarchy

open class Shape

class Rectangle(
    private val length: Double,
    private val width: Double
):Shape()
{
    fun area():Double {
        return width * length
    }
}

class Circle(
    private val radius: Double
):Shape()
{
    fun area():Double {
        return radius.pow(2) * Math.PI
    }
}

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter your choice 1 for area of rectangle and 2 for area of circle")
    val choice = reader.nextInt()
     when(choice){
         1-> {
             println("Enter length and width of the rectangle:")
             val length = reader.nextDouble()
             val width = reader.nextDouble()
             val rectangle = Rectangle(length, width)
             println("Area of the rectangle: ${rectangle.area()}")
         }
         2 -> {
             println("Enter the radius of the circle:")
             val radius = reader.nextDouble()
             val circle = Circle(radius)
             println("Area of the circle: ${circle.area()}")
         }
         else -> println("Invalid choice")
     }

}