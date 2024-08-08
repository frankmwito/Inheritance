// Animal Hierarchy

open class Animal(){
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog(): Animal(){
    override fun makeSound(){
        println("Wooof")
    }
}

class Cat(): Animal(){
    override fun makeSound(){
        println ("Meeeaw")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()
    val cat = Cat()
    cat.makeSound()
}