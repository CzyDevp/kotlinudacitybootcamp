import java.util.*

fun main(args: Array<String>){
    val ams = AMS()
    println(ams.dayOfWeek())
    print("Your fortune is ${ams.birthDayFromUser()}")
    println()
    var crazy = CrazyDev()
    crazy hey "nav"  //infix love
    crazy.greet("Nav") //ext
    crazy.printFromClass()
    val fish =50
    if(fish in 1..100)
        println(fish)
    when(fish){
        50 -> println("full tank")
        else -> println("nothing")
    }
    //udacity quiz time
    var welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")   //true
        else -> println("Too long!")
    }
    val trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like to eat $trout and $snapper, but not a big fan of $haddock.")
    val myList = mutableListOf("tuna","shark")
    println(myList.remove("tuna"))
    val intArrayEx = intArrayOf(1,2,3)
    println(Arrays.toString(intArrayEx))
    for ((index,element) in intArrayEx.withIndex())
        println("$index and value is $element")
    for (i in 1..5) print(i)
    for (i in 1..5 step 2) println(i)
    val array = arrayOf(1,1000,1000000,1000000000,1000000000000,1000000000000000000,1000000000000000000)
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
            "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
            println("1 ${sizes[i]} = $value bytes")
    }
   /* val arrays = intArrayOf(11,12,13,14,15)
    var list:List<String>
    for (i in arrays){
    }*/
    /*for (i in 1..100)
        if(i%7==0) print(i)*/
    for (i in 0..100 step 7) println(i.toString() + " - ")
}
class CrazyDev {
    fun printFromClass() {
        printHello()
    }

    private fun printHello() {
        2.plus(71).plus(233).minus(13).plus(1)
        var rainbowColor = "red"
        println("Rainbow color is $rainbowColor")
        rainbowColor = "colorful"
        println("Rainbow color is $rainbowColor")
        val blackColor = "black"
        println("Black color is $blackColor")
        //blackColor = "noblack"  //error
        var greenColor: String? = null
        println("Green color is $greenColor")
        var blueColor: Int? = null
        println("Blue color is ${blueColor?.inc() ?: 0}")
        var list: List<Int?> = listOf(1, null)
        println("List's first element ${list.first() ?: 0}")
        list.forEach {
            // n:Int?->n?: print("No number is available")
            when (it) {
                null -> print("$it do not have any value")
                else -> print("value of Element is $it")
            }
        }
        var nullTest: Int? = 0
        println("Number nullTest is: ${nullTest?.plus(5) ?: 0}")
        println("HelloWorld")
    }
}

 fun CrazyDev.greet(name:String){
    println("hello $name merci")
}
infix fun CrazyDev.hey(name:String){
    println("hello $name")
}