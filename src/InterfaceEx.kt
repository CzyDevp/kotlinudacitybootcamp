fun main(args: Array<String>) {
    val extendedInterfaceSubChild = ExtendedInterfaceSubChild()
    val abstractImpl = AbstractImpl()
    abstractImpl.printAbstractFunc()

}

open class InterfaceExClass {
    var id = 0

    constructor(id: Int) {
        this.id = id
    }

    init {
        println("I like it $id ")
    }
}

open class ExtendInterfaceEx : InterfaceExClass {

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

abstract class AbstractSample {
    open fun printAbstract() = println("I am abstract")
    abstract fun printAbstractFunc()
}

class AbstractImpl : AbstractSample() {
    override fun printAbstract() = println("I am abstract")
    override fun printAbstractFunc() {
        print("I am abstract func")
    }
}