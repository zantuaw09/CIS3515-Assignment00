class Square(_name : String = "Square") : Shape (_name) {
    private var length : Double = 2.0
    private var height : Double = 4.0

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