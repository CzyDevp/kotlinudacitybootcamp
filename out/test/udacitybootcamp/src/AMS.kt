import java.util.*
import kotlin.properties.Delegates

class AMS {

    fun executeLamda(a:Int,b:Int,action:(a:Int,b:Int)->Unit){
         action(a, b)
    }

    fun findMax(a:Int,b:Int,action:(a:Int,b:Int)->Unit)=  action(a,b)

     fun dayOfWeek():String{

         val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
         return when(day){
             1 -> fishFood("Sun")
             2-> fishFood("Mon")
             3-> fishFood("Tues")
             4-> fishFood("Wed")
             5-> fishFood("Thurs")
             6-> fishFood("Fri")
             7-> fishFood("Sat")
             else -> fishFood("nil")
        }
    }

    fun birthDayFromUser():String{
        print("\nEnter your birthday: ")
        val birthday = readLine()?.toIntOrNull() ?: 1
        return getFortune(birthday)
    }

    private fun getFortune(birthday:Int) : String {
        val fortunes = listOf( "You will have a great day!",
                "Things will go well for you today.",
                "Enjoy a wonderful day of success.",
                "Be humble and all will turn out well.",
                "Today is a good day for exercising restraint.",
                "Take it easy and enjoy life!",
                "Treasure your friends, because they are your greatest fortune.")
        val index = when (birthday) {
            in 1..7 -> 4
            28, 31 -> 2
            else -> birthday.rem(fortunes.size)
        }
        return fortunes[index]
    }

    private fun fishFood(day:String):String{
        val initial = "Today food is "
        return when(day){
            "Mon"-> "$initial flakes"
            "Tue"-> "$initial oats"
            "Wed"-> "$initial snacks"
            "Thurs"-> "$initial rice"
            "Fri"-> "$initial soup"
            "Sat"-> "$initial grit"
            else -> {"$initial fasting"}
        }
    }

    /*interface Decision{
        fun addSum(a:Int,b:Int)
    }*/
}
class Customer{
    var name = "NAV"
       get() {
           return "hi $field \n"
       }
    set(value) {
        println("Hello")
        field  = value       //backing filed tech to reduce stackOverFlow
    }
    //lazy with val(final)
    val age:Int by lazy {
        28
    }
    //mutable
    lateinit var sex:String

    //observable and vetoabale
    var address:String by Delegates.observable("Rue Chopin"){
        prop,old,new -> println("Property is $prop , old Address is $old new Address is $new")
    }

    var postalCode:String by Delegates.vetoable("H4E 2S1"){
        _,_,new ->
        //println("Property is $prop , old PostalCode is $old new Address is $new")
        new.length>=5
    }
}

class Student( map: Map<String,Any?>){
    val name:String by map
    val id:Int by map
    val studentCompare:StudentCompare<Student> = object: StudentCompare<Student>{
        override fun compare(item: Student, item1: Student): Int {
            return item.id - item1.id
        }
    }
}

interface StudentCompare<T>{
    fun compare(item:T,item1:T):Int
}