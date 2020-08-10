fun main(args: Array<String>) {
    //Array 
    val countries:Array<String> = arrayOf("India", "Mexico", "Colombia", "Inglaterra");

    val days:Array<String> = arrayOf<String>("Monday", "Tuesday")
    val numbers:IntArray = intArrayOf(1,2,3,4)
    var sum = 0;

    for(number in numbers){
        sum += sum.plus(number)
    }

    val average = sum.div(numbers.size)
    println("Average: $average" )
}