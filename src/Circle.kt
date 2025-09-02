import kotlin.math.PI

class Circle (_name : String = "Circle") : Shape(_name) {
    private var radius : Double = 3.0

    fun setDimensions(radius : Double) {
        this.radius = radius
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea() = (radius * radius) * PI
}