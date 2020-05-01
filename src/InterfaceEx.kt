fun main(args: Array<String>) {
    val extendedInterfaceSubChild = ExtendedInterfaceSubChild()

}

open class InterfaceEx {
    var id = 0

    constructor(id: Int) {
        this.id = id
    }

    init {
        println("I like it $id ")
    }
}

open class ExtendInterfaceEx : InterfaceEx {

    constructor(id: Int) : super(id)

    init {
        println("I am extended version")
    }
}

class ExtendedInterfaceSubChild : ExtendInterfaceEx(1) {
    init {
        println("I am sub child")
    }

}