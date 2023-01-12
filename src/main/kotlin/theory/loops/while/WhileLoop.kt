package theory.loops.`while`

fun main() {
    var x = 0
    while (x < 10) {
        x++
        println("x=$x")
    }

    var z = 0
    do{
        z++
        println("z=$z")
    }while (z < 0)
}