interface Designer{
    fun design(){
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

    class Employee(designer: Designer, developer: Developer, var empType: EmpType) : Developer by developer, Designer by designer

    enum class EmpType(val badge: Int) {
        Manager(badge = 1),
        Clerk(badge = 2),
        Head(3)
    }
}