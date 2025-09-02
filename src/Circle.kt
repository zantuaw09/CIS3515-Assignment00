class Circle (_name : String = "Circle") : Shape(_name) {
    private var radius : Double = 0.0

    fun setDimensions(radius : Double) {
        this.radius = radius
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }
}