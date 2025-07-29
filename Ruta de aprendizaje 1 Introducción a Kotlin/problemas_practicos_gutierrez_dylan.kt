/* 
Problemas practicos: Conceptos basicos de Kotlin- Dylan Gutierrez
*/

// 1. Impresión de mensajes (Solucion)
/* 
fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}
*/

// 2. Corregir errores (solucion), se estaba cerrando mal el println, y tambien se estaba cerrando el texto con '
/* 
fun main() { 
    println("New chat message from a friend")
}
*/

// 3. Plantillas de Cadenas- Corregir errores (se cambiaron los val por var)
/* 
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
*/

// 4. Concatenacion de cadenas (convertieron las cadenas a enteros)
/* 
fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults.toInt() + numberOfKids.toInt()
    println("The total party size is: $total")
}
*/

// 5. Formato de mensajes ( No imprime el resultado que esperaba, esperaba 6000, pero aparece 5000 + 1000)
/* 
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
*/

// Al corregirlo si aparece la suma de los salarios (6000), se quitaron los $
/* 
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
*/

// 6. Operaciones matematicas basicas
// Paso 1- Corregir el error ( Agregue y declare result)
/* 
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    
    println("$firstNumber + $secondNumber = $result")
}
*/

// Paso 2- Definir la funcion add 
/* 
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(a: Int, b: Int): Int {
    return a + b
}
*/

// Paso 3- Agregar las funcion subtract
/* 
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val sumResult = add(firstNumber, secondNumber)
    val anotherSum = add(firstNumber, thirdNumber)

    val subtractResult = subtract(firstNumber, secondNumber)
    val anotherSubtract = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $sumResult")
    println("$firstNumber + $thirdNumber = $anotherSum")

    println("$firstNumber - $secondNumber = $subtractResult")
    println("$firstNumber - $thirdNumber = $anotherSubtract")
}

// Define add() function
fun add(a: Int, b: Int): Int {
    return a + b
}

// Define subtract() function
fun subtract(a: Int, b: Int): Int {
    return a - b
}
*/

// 7. Parametros predeterminados
// Paso 1
/* 
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line
fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
*/

// Paso 2
/* 
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

// Define your displayAlertMessage() function below
fun displayAlertMessage(
    operatingSystem: String = "Unknown OS",
    emailId: String
): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
*/

// 8. Podometro
/* 
fun main() {
    val steps = 4000
    val caloriesBurned = convertStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun convertStepsToCalories(stepCount: Int): Double {
    val caloriesPerStep = 0.04
    val totalCaloriesBurned = stepCount * caloriesPerStep
    return totalCaloriesBurned
}
*/

// 9. Comparacion de dos numeros 
/*
fun main() {
    println(didUsePhoneMoreToday(timeSpentToday = 300, timeSpentYesterday = 250)) // true
    println(didUsePhoneMoreToday(timeSpentToday = 300, timeSpentYesterday = 300)) // false
    println(didUsePhoneMoreToday(timeSpentToday = 200, timeSpentYesterday = 220)) // false
}

// Función que compara el tiempo de uso de hoy con el de ayer
fun didUsePhoneMoreToday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

*/

// 10. Movimiento del codigo duplicado a una funcion 
/*
fun main() {
    printWeatherReport("Ankara", lowTemp = 27, highTemp = 31, rainChance = 82)
    printWeatherReport("Tokyo", lowTemp = 32, highTemp = 36, rainChance = 10)
    printWeatherReport("Cape Town", lowTemp = 59, highTemp = 64, rainChance = 2)
    printWeatherReport("Guatemala City", lowTemp = 50, highTemp = 55, rainChance = 7)
}

// Función para imprimir el clima de una ciudad
fun printWeatherReport(city: String, lowTemp: Int, highTemp: Int, rainChance: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainChance%")
    println()
}

*/

