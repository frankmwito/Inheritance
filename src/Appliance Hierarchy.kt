import java.util.Scanner

// Appliance Hierarchy

open class Appliance(
    val brand: String,
    val power: Double
)

class WashingMachine( brand: String, power: Double): Appliance(brand, power){
    fun washClothes():Boolean {
        if ( brand == "Samsung" && power > 250.00){
            return true
        }
        else{
            return false
        }

    }

}

class Refrigerator(brand: String, power: Double): Appliance(brand, power){
    fun keepFoodCool():Boolean {
        if ( brand == "Samsung" && power > 250.00){
            return true
        }
        else{
            return false
        }

    }

}
fun main() {
    val reader = Scanner(System.`in`)
    println("Enter the brand and power of the Washing machine to see if it is reliable")
    val washingMachine = WashingMachine(reader.next(), reader.nextDouble())
    val isReliable = washingMachine.washClothes()
    println("$isReliable")
    println("Enter the brand and power of the refrigerator see if its efficient")
    val refrigerator = Refrigerator(reader.next(), reader.nextDouble())
    val isEfficient = refrigerator.keepFoodCool()
    println("$isEfficient")
}