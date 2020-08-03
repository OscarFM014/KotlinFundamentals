//const compiler time 
const val O = "OSCAR"

//Pure Functions
fun main(args: Array<String>) {
    println(3+1)
    println(2*2)
    println(4/2)

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    //var cen be access out of the function
    var n = 3 //execution time
 
    println(n)
    n=4
    println(n)

    //String

    val nombre = "Oscar"
    val apellido:String = "Fernandez"
    val nombreapellido = "Oscar Fernandez"

    println("Tu nombre es: $nombre $apellido")

    //Raw String
    val parrafo = """
            ** Lorem ipsum is 
            ** imple dummy  """.trimIndent()

    println(parrafo.trimMargin(marginPrefix="** ") )

    //Range

    val oneToHundred:IntRange = 1..100
    for (i:Int in oneToHundred) {
        println(i)
    }

    val aToC:CharRange = 'A'..'C'

    for(letra:Char in aToC){
        println(letra)
    }

    //if and when

    val numberTwo = 2
    if(numberTwo.equals(2)){
        println("Yes!")
    }else{
        println("No :(")
    }

    when(numberTwo){
        in 1..5 -> println("Yes it is between 1 and 5")
        in 1..3 -> println("Yes it is between 1 and 3")
        !in 5..10 -> println("No,it is not between 5 and 10")
        else -> println(":(")
    }

    //while and  do while

    var numberOne = 1
    while(numberOne< 10){
        println (numberOne)
        numberOne++;
    }

    do {
        println(numberOne)
        numberOne++;
    } while (numberOne <= 20)

    //Elvis



    try {
        var compute:String?
        compute = null
        var lon:Int? = compute!!.length
    }
    catch(e: NullPointerException) {
        println("Write a valid number!")
    }

    //Safe Call
    var computer:String?
    computer = null
    var len:Int? = computer?.length
    println(len)

    var keyboard:String?
    keyboard = null
    var lenKey:Int? = keyboard?.length ?: 0
    println(lenKey)

    val listWithNulls:List<Int?> = listOf<Int?>(7,null,null,4)

    println("List with Nulls $listWithNulls")

    val listWithoutNulls:List<Int?> = listWithNulls.filterNotNull()
    println("List without Nulls $listWithoutNulls")


}