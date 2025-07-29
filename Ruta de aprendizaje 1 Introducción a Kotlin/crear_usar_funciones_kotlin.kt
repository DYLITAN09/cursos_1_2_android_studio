// Como crear y usar funciones en Kotlin

// En el main se llama a la otra funcion que imprime esos dos mensajes 
/*
fun main() {
    birthdayGreeting()
}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}
*/

// Devuelve valores Unit (Nulos), como si la funcion no devolviera nada, aunque se puede omitir y no escribirlo
/* 
fun main() {
    birthdayGreeting()
}

fun birthdayGreeting(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}
*/

// Se puede pasar el llamada de una funcion como variable
/* 
fun main() {
    val greeting = birthdayGreeting()
    println(greeting)
}
fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
*/

// Tambien se puede imprimir llamando a la funcion
/* 
fun main() {
    println(birthdayGreeting())
}
fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
*/

// Se puede hacer dinamico el nombre, estableciendolo como un paramtro en la funcion 
/* 
fun main() {
    println(birthdayGreeting("Rover"))
}
fun birthdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
*/

// Se puede poner mas de un parametro como el nombre y la edad
/* 
fun main() {
    println(birthdayGreeting("Rover", 5))
    println(birthdayGreeting("Rex", 2))
}
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting(name: String, age: Int) // Firma de la funcion

println(birthdayGreeting(name = "Rex", age = 2)) //  Argumentos con nombre 

*/