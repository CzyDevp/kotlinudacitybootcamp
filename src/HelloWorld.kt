    fun main(args: Array<String>){
        var crazy = CrazyDev()
        crazy.printFromClass()
    }
class CrazyDev{
    fun printFromClass(){
        printHello()
    }
    private fun printHello(){
        2.plus(71).plus(233).minus(13).plus(1)
        var rainbowColor = "red"
        println("Rainbow color is $rainbowColor")
        rainbowColor = "colorful"
        println("Rainbow color is $rainbowColor")
        val blackColor = "black"
        println("Black color is $blackColor")
        //blackColor = "noblack"  //error
        var greenColor:String? = null
        println("Green color is $greenColor")
        var blueColor:Int? = null
        println("Blue color is ${blueColor?.inc()?:0}")
        var list:List<Int?>  = listOf(1,null)
        println("List's first element ${list.first()?:0}")
        list.forEach {            // n:Int?->n?: print("No number is available")
            when(it){
                null -> print("$it do not have any value")
                else -> print("value of Element is $it")
            }
        }
        var nullTest:Int? =0
        println("Number nullTest is: ${nullTest?.plus(5)?:0}")
        println("HelloWorld")
    }
}