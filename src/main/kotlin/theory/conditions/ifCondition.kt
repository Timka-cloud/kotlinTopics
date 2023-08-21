package theory.conditions

fun main() {
    var a = 30
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
    val result = if(a < b) {
        "a less than b"
    } else if(a == b) {
        "a equal to b"
    } else {
        "a bigger than b"
    }

    val result2: String

    if(a < b) {
        result2 = "a less than b"
    } else if(a == b) {
        result2 = "a equal to b"
    } else {
        result2 = "a bigger than b"
    }

    println("result = $result")
    println("result2 = $result2")


    println("----------------6") // любой тип можно туда записать
    val res:Any = if(a < b) {
        var t: Int = 10
        t
    } else if(a == b) {
        "just text return"
    } else {
        true
    }
    println("res = $res")


}
