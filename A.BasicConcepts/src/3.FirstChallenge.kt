//Challenge: https://platzi.com/clases/1543-kotlin/19392-reto-1/
//Recipes Maker

fun main(args: Array<String>) {
    
    val menu = """
    :: Welcome to Recipe Maker :: 
    Select an option
    1. Make a recipe
    2. Read some recipes
    3. Exit""".trimIndent()
    println(menu)
    val selected: String? = readLine()

    while( !(selected.equals("3")){
        if(selected.equals("1")){
            println("Lets prepare some hotdogs!")
        }else if (selected.equals("2")){
            println("Hotdogs Recipe: Bread and Sausage")
        }
        selected:String? = readLine()
    }
}
