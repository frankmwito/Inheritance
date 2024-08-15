import java.util.Scanner

//Vehicle Hierarchy
open class Vehicle(
    val make: String,
    val model: Double
){
    open fun drive(){
        println("The vehicle is being driven")
    }
}

class Car(
    make: String,
    model: Double
) : Vehicle(make, model) {
    override fun drive() {
        println("The car roars with exhaust gunshots...")
    }
}

class Motorcycle(
    make: String,
    model: Double
) : Vehicle(make, model) {
    override fun drive() {
        println("The motorcycle hums... drive carefully!")
    }
}

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter the choice of Vehicle: 1 for car, 2 for motorcycle")
    val choice = reader.nextInt()

    when(choice){
        1 -> {
            println("Enter the make of the vehicle:")
            val make = reader.next()

            println("Enter the model of the vehicle:")
            val model = reader.nextDouble()
            val car = Car(make, model)
            car.drive()
        }
        2 -> {
            println("Enter the make of the motorcycle:")
            val make = reader.next()
            println("Enter the model of the motorcycle:")
            val model = reader.nextDouble()
            val motorcycle = Motorcycle(make, model)
            motorcycle.drive()
        }
        else -> println("Invalid choice")
    }
}
