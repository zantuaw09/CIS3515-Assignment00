class EquilateralTriangle (_name : String = "Equilateral Triangle"): Triangle(_name)  {
    private var side : Double = 0.0

    fun setDimensions(side : Double) {
        super.setDimensions(side, side, side)
    }

    override fun printDimensions() {
        super.printDimensions()
    }

    override fun getArea(): Double {
        return super.getArea()
    }
}