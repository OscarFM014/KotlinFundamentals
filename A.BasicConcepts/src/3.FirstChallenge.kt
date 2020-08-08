//Challenge: https://platzi.com/clases/1543-kotlin/19392-reto-1/
//Recipes Maker

import java.util.Scanner

fun main(args: Array<String>) {
    
    val menu = """
    :: Welcome to Recipe Maker :: 
    Select an option
    1. Make a recipe
    2. Read some recipes
    3. Exit""".trimIndent()
    println(menu)
    var response = readLine()

    while( response != "3" ){
        if(response == "1"){
            println("Lets prepare some hotdogs!")
        }else if (response == "2"){
            println("Hotdogs Recipe: Bread and Sausage")
        }
        response = readLine()
    }
}
