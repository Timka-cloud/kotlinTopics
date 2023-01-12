package theory.conditions

fun main() {
    var a = 10
    var b = 20
    var text = "hello"

    print("1 -----------------------------------------")
    if(a < b) {
        println("a < b")
    }

    print("2 -----------------------------------------")

    if(a < b) {
        println("a less than b")
    } else {
        println("a bigger than b")
    }

    print("3 -----------------------------------------")

    if(a < b) {
        println("a less than b")
    } else if(a == b) {
        println("a equal to b")
    }else {
        println("a bigger than b")
    }

    print("4 -----------------------------------------")
    // Присвоение значения в результате выполнения условия
    var result = if(a < b) {
        "a less than b"
    } else if(a == b) {
        "a equal to b"
    } else {
        "a bigger than b"
    }

    println("result = $result")





}