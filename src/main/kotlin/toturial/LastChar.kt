package toturial

fun main() {
    println("말을 끝까지 들어야 하는 이유".lastChar())
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}
