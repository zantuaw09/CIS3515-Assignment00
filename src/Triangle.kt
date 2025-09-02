import kotlin.math.sqrt

open class Triangle (_name : String = "Triangle") : Shape(_name ) {
    private var side1 : Double = 3.0
    private var side2 : Double = 4.0
    private var side3 : Double = 5.0

    fun setDimensions(side1 : Double, side2 : Double, side3 : Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun printDimensions() {
        println("Side 1: $side1")
        println("Side 2: $side2")
        println("Side 3: $side3")
    }

    override fun getArea(): Double {
        val x = 0.5 * (side1 + side2 + side3)
        return sqrt(x * (x-side1) * (x-side2) * (x-side3))
    }
}