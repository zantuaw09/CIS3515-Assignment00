import kotlin.math.sqrt
import kotlin.math.pow

class EquilateralTriangle (_name : String = "Equilateral Triangle"): Triangle(_name)  {
    private var side : Double = 0.0

    fun setDimensions(side : Double) {
        this.side = side
    }

    override fun printDimensions() {
        println("Side Length: $side")
    }

    override fun getArea(): Double {
        val x = 1.5 * (side)
        return sqrt((x-side).pow(3) * x)
    }
}