class Mood {
   // val rollDice = { Random().nextInt(12) + 1}
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    fun weather(mood: String = "Funny", weather: String = "Sunny", tempareture: Int = 24): String {
        return when {
            mood == "Sunny" && weather == "Sunny" -> "Go for Walk"
            else -> "Stay Home"
        }
    }
    fun gamePlay(roll:Int){
        println(roll)
    }


    val spiceContainers = listOf(SpiceContainer(Spice("Yellow Curry", "mild")),
            SpiceContainer(Spice("Red Curry", "medium")),
            SpiceContainer(Spice("Green Curry", "spicy"))

    )
}
open class Spice(val name:String = "Curry", private val spiceNess:String = "Mild"){

     open
     val heat:Int get() {
        return when(spiceNess){
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
    }
    }

    open fun getInherited(){
        println("hello extend me ")
    }
    /*constructor(noFishes:Int):this(){
        heat = noFishes+5
    }*/
}

class SpecialSpice : Spice(){
    override val heat:Int = 10
    override fun getInherited() {
        //super.getInherited()
        println("I am extended version ")
    }


}
const  val MAX_NUMBER_BOOKS = 20
open class Book(open val title:String,open val author:String){

    private var pageCount = 0
    open fun pageCount(){
        pageCount++
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    open fun printDetail()= println("Book Title is $title written by $author and has total pages $pageCount ")
}

class EBook(title: String, author: String, var format: String = "text"):Book(title,author){
    private var wordCount:Int=0
    override fun pageCount() {
        super.pageCount()
        wordCount+=250
    }

    override fun printDetail() {
        super.printDetail()
        super.printDetail()
        println("Book Title is $title written by $author and has total words $wordCount ")
    }
}

abstract class SpiceP(color: CurryColor):CurryColor by color{
  abstract fun prepareSpice()
}

interface Grind{
    fun grind(){
        println("Grind Your spices here")
    }
}

interface CurryColor{
    val color:Color
}
class Curry(val Spiceness:Int,color: CurryColor = YellowCurryColor ):SpiceP(color),Grind{
    override fun prepareSpice() {
        println("Preparing Curry Here and grinding after")
        grind()
        println("CurryColor is $color")
    }

}

object YellowCurryColor : CurryColor{
    override val color: Color
        get() = Color.YELLOW
  /*  fun getColorEnumValueAll(){
        println(Color.YELLOW.rgb)
    }*/
}

data class SpiceContainer(val spice:Spice){
    val label= spice.name

}

enum class Color(val rgb:Int){
    YELLOW(0xFFFF00)
}

