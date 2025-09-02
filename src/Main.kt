import java.util.Scanner

fun main (args: Array<String>) {
    val myCircle = Circle()
    val mySquare = Square()
    val myTriangle = Triangle()
    val myEquilateralTriangle = EquilateralTriangle()

    val scanner = Scanner(System.`in`)
    print("Enter radius for circle: ")
    val radius = scanner.nextDouble()
    myCircle.setDimensions(radius)

    print("Enter length and height for square: ")
    val length = scanner.nextDouble()
    val height = scanner.nextDouble()
    mySquare.setDimensions(length, height)

    print("Enter 3 side lengths for triangle: ")
    val side1 = scanner.nextDouble()
    val side2 = scanner.nextDouble()
    val side3 = scanner.nextDouble()
    myTriangle.setDimensions(side1, side2, side3)

    print("Enter side lengths for equilateral triangle: ")
    val side = scanner.nextDouble()
    myEquilateralTriangle.setDimensions(side)

    for (shape in arrayOf(myCircle, mySquare, myTriangle, myEquilateralTriangle)) {
        println("Info about ${shape.name}:")
        shape.printDimensions()
        println("Area: ${shape.getArea()}\n")
    }
}