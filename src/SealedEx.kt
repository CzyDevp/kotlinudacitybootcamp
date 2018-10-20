sealed class Phone(open val type:String)
data class Samsung(val color:String,val price:Int, override val type: String):Phone(type)
