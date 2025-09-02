class Square(_name : String = "Square") : Shape (_name) {
    private var length : Double = 0.0
    private var height : Double = 0.0

    fun setDimensions(length : Double, height: Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("Length: $length")
        println("Height: $height")
    }

    override fun getArea() = length * height
}