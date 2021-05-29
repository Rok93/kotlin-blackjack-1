package toturial

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
}

fun main() {
    val newPoint = Point(0, 1).plus(Point(1, 2))
    val operatedPoint = Point(0, 1) + Point(1, 2)
    println(newPoint)
    println(operatedPoint)

    println(listOf(listOf(1, 2), listOf(3, 4)).get(0,1))
}

fun List<List<Int>>.get(a: Int, b: Int): Int {
    return this[a][b]
}
