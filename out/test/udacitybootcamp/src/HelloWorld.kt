import java.util.*
const val nom = "nav"   //compiled time
fun main(args: Array<String>){

     //pairs by Book
    val book=Book("Java","Nav")
    fun getPairDetailbook(book: Book):Pair<String,String>{
        return book.title to book.author
    }
    val (title,author ) = getPairDetailbook(book)
    println("Book $title is written by $author")

    //set of titles by William
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val setBooks = setOf("kt","groovy","a#")
    val library = mapOf("William" to allBooks,"Nav" to setBooks)
    println(library.any { it.value.contains("Hamlet") })
    val moreBooks = mutableMapOf("Nav" to "kt")
    moreBooks.getOrPut("Nav"){"Java"}
    println("Book from more books is ${moreBooks["Nav"]}")

    //mood udaCity
    val mood  = Mood()
    println(mood.weather("Sad"))
    //spices UdaCity
    println(mood.spices.sortedBy { it.length })
    println(mood.spices.filter { it -> it.startsWith("c" ) && it.endsWith("e") })
    println(mood.spices.take(3).filter { it.startsWith("c") })
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    println("Number is ${mood.gamePlay(rollDice2(10))}")
    //Spice class
    val spice = Spice()
    println("${spice.name}" )
    //val spiceFishes = Spice(5)
    //println("Heat is ${spiceFishes.heat}")
    val spices1 = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy")
    )
    spices1.filter {it.heat < 5}.forEach { println(it.name) }
    mood.spiceContainers.forEach { println(it.label) }

    //classes by delegation Employee
    val appDeveloper = Developer.AppDeveloper()
    val appDesigner = Developer.AppDesigner()
    val employee = Developer.Employee(appDesigner, appDeveloper, Developer.EmpType.Manager)
    employee.design()
    employee.develop()
    println("Employee type is ${employee.empType.badge}")
    println("Employee type is ${employee.empType.name} and position is ${employee.empType.ordinal} ")
    //classes by delegation Employee

    val ams = AMS()

    //custom getter \
    val customer = Customer()
    println("Customer name is ${customer.name}")
    println("Customer age is ${customer.age}")
    customer.sex = "male"
    println("Customer sex is ${customer.sex}")
    customer.address = "Des TriniTaires"
    println("Customer address is ${customer.address}")
    customer.postalCode = "H4W2"
    println("Customer PostalCode is ${customer.postalCode}")

    //student with map
    val student = Student(mapOf(
            "name" to "John",
            "id" to 1
    ))
    val student1 = Student(mapOf(
            "name" to "John",
            "id" to 1
    ))
    println("Student name is ${student.name} and id is ${student.id}")

    println("Comparator running here ${student.studentCompare.compare(student,student1)}")

    //sealed class
    val samsung = Samsung("Red",200,"Android")
    println("Phone color is ${samsung.color} and price is ${samsung.price} and type is ${samsung.type}")

    //list
    var intList = listOf(1,2,3,4,5) //immutable   setOf, mapOf
  /*  var intList1 = mutableListOf(1,2,3,4,5) //immutable   setOf, mapOf
    var intList2 = arrayListOf(1,2,3,4,5) //immutable   setOf, mapOf
    var intList3 = ArrayList<Int>(10) //immutable   setOf, mapOf*/
    for(a in intList)
        print(a)
    println()
    //array
    var arr = Array(5){0}
    for(index in arr.indices) print(arr[index])   //indices return all the valid index
    println()
    //map
    val map = mapOf(1 to "Nav",2 to "Gagan")
/*    val map1 = HashMap<String,Int>()
    val map2 = hashMapOf<Int,String>()
    val map3 = mutableMapOf<Float,String>()*/
    for(key in map.keys) println("$key value is  ${map[key]}")
    //set
    var setInt = setOf(1,2,3,4,4,5)
/*    var set = mutableSetOf(1,2,3,4,4,5)*/
    var sets = hashSetOf(1,2,3,4,4,5,8,7,3,24,43)
    for (a in setInt) print(a)
    println()
    println("hashSet values go here")
    for (a in sets) print(a)
    println()
    //lambda statements with func-higher-order func
    var lambda = { a: Int, b: Int ->
        println("Greater is ${if (a > b) a else b}")
    }
    ams.findMax(5,10,lambda)
    ams.executeLamda(5,10){a,b ->   println(a+b)}
    println(ams.dayOfWeek())
    print("Your fortune is ${ams.birthDayFromUser()}")
    println()
    var crazy = CrazyDev()
    crazy hey "nav"  //infix love
    crazy.greet("Nav") //ext
    crazy.printFromClass()
    //object
    Calculator.total++
    println("Number is ${Calculator.total}")
    Calculator.a=10
    println("A set to ${Calculator.a}")
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
    Calculator.total++
}
object Calculator:GetInt(){
 var total=0
    override var a: Int = 0
}
open class GetInt{
    open var a:Int=0
}