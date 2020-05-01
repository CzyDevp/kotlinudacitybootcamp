interface Designer {
    fun design() {
        print("I am Designer")
    }
}

interface Developer {
    fun develop() {
        println("AppDeveloper")
    }

    class AppDesigner : Designer {
        override fun design() {
            //super.Design()
            println("AppDesigner")
        }
    }

    class AppDeveloper : Developer {
        override fun develop() {
            println("AppDeveloper in the House")
        }
    }

    class Employee(
            designer: Designer,
            developer: Developer,
            @JvmField var empType: EmpType
    ) : Developer by developer, Designer by designer {

        @JvmOverloads
        fun abc(name: String, num: Int = 0) {

        }

        companion object {
            @JvmStatic
            val a = "hvbds"
        }
    }


    enum class EmpType(val badge: Int) {
        Manager(badge = 1),
        Clerk(badge = 2),
        Head(3)
    }

}

class MyGen<T> {
    private var obj: T? = null
    fun add(obj: T) {
        this.obj = obj
    }

    fun get(): T? {
        return obj
    }
}