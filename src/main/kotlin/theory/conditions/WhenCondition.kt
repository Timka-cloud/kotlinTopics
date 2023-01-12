package theory.conditions

fun main() {
    /*
    when это аналог switch в Java
    Если много условий, желательно использовать when вместо if else if else
     */

    var a = 10

    var text = "sample"

    println("1 -------------------------")
    // конкретные значения
    when (a) {
        10 -> println("10")
        20 -> println("20")
        else -> {
            println("not found")
        }
    }

    println("2 -------------------------")
    // область(диапазоны, границы) значений
    when(a) {
        in 0..10 -> println("0..10")
        in 11..20 -> println("11..20")
        !in 21..40 -> println("not in 21..40")
        else -> {
            println("not found")
        }
    }

    println("3 -------------------------")
    // Возможные значения
    when(a) {
        5,10,30 -> println("5,10,30")
        14,11,33 -> println("14,11,33")
        else -> {
            println("not found")
        }
    }

    println("4 -------------------------")
    var result = when(a) {
        in 0..10 -> {
            var r = 10
            r += 10 // some logic
            "small number" // это значение вернется
        }
        in 10..20 -> {
            var r = 10
            r += 10 // some logic
            "big number" // это значение вернется
        }
        else -> {
            var r = 10
            r += 10 // some logic
            "i don't know" // это значение вернется
        }
    }

    println("result =  $result")
}