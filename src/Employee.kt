import java.util.Scanner

// Employee Hierarchy

open class Employee(
    val salary: Double,
    val name:String
){
    open fun calculateBonus(){
        println("The salary is $salary")
    }
}

class Manager(name: String, salary: Double): Employee(salary, name){
    override fun calculateBonus() {

        val bonus = salary + (0.2* salary)
        println("The bonus salary for $name is $bonus")
    }
}
class Engineer(name: String,salary: Double): Employee(salary, name){

    override fun calculateBonus() {
        val bonus = salary + (0.275* salary)
        println("The bonus salary for $name is $bonus")
    }
    }
fun main() {
    val reader = Scanner(System.`in`)
    println("Enter your choice for bonus, 1 for manager and 2 for engineer")
   val choice = reader.nextInt()

    when(choice){
        1 -> {
            println("Enter the name of manager")
            println("Enter the salary of manager")
            val manager = Manager(reader.next(), reader.nextDouble())
            manager.calculateBonus()
        }
        2-> {
            println("Enter the name of engineer")
            println("Enter the salary of engineer")
            val engineer = Engineer(reader.next(), reader.nextDouble())
            engineer.calculateBonus()
        }
        else-> println("Invalid choice")
    }

}

