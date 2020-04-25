import java.util.*
import kotlin.properties.Delegates

class AMS {

    fun executeLambda(a: Int, b: Int, action: (a: Int, b: Int) -> Unit) = action(a, b)

    fun findMax(a: Int, b: Int, action: (a: Int, b: Int) -> Unit) = action(a, b)

    fun dayOfWeek() = when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> fishFood("Sun")
        2 -> fishFood("Mon")
        3 -> fishFood("Tues")
        4 -> fishFood("Wed")
        5 -> fishFood("Thurs")
        6 -> fishFood("Fri")
        7 -> fishFood("Sat")
        else -> fishFood("nil")
    }

    private fun fishFood(day: String): String {
        val initial = "Today food is "
        return when (day) {
            "Mon" -> "$initial flakes"
            "Tue" -> "$initial oats"
            "Wed" -> "$initial snacks"
            "Thurs" -> "$initial rice"
            "Fri" -> "$initial soup"
            "Sat" -> "$initial grit"
            else -> {
                "$initial fasting"
            }
        }
    }

}

class Customer {
    var name = "NAV"
        get() {
            return "hi $field \n"
        }
        set(value) {
            println("Hello")
            field = value       //backing filed tech to reduce stackOverFlow
        }

    //lazy with val(final)
    val age: Int by lazy {
        28
    }

    //mutable
    lateinit var sex: String

    //observable and vetoabale
    var address: String by Delegates.observable("Rue Chopin") { prop, old, new ->
        println("Property is $prop , old Address is $old new Address is $new")
    }

    var postalCode: String by Delegates.vetoable("H4E 2S1") { _, _, new ->
        //println("Property is $prop , old PostalCode is $old new Address is $new")
        new.length >= 5
    }
}

class Student(map: Map<String, Any?>) {
    val name: String by map
    val id: Int by map
    val studentCompare: StudentCompare<Student> = object : StudentCompare<Student> {
        override fun compare(item: Student, item1: Student): Int {
            return item.id - item1.id
        }
    }
}

interface StudentCompare<in T> {
    fun compare(item: T, item1: T): Int
}

interface StudentCompareOut<out T> {
    fun compare(item: Int, item1: Int): T
}