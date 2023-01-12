package theory.loops.`for`

fun main() {
//    println("Обычный цикл")
//    for(i in 1..5) {
//        println(i)
//    }

//    println("обратный цикл")
//    for(i in 5 downTo 1) {
//        println(i)
//    }

//    println("цикл с шагом")
//    for (i in 1..10 step 3) {
//        println(i)
//    }

//    println("обратный цикл с шагом 3")
//    for(i in 15 downTo 1 step 4) {
//        println(i)
//    }

//    println("цикл по обьектам коллекции")
//    val arrayNames = arrayOf("James", "Jack", "John", "Steve", "Ben")
//    for(name in arrayNames) {
//        println(name)
//    }

    println("цикл по обьектам коллекции")
    val arrayNames: Array<String> = arrayOf("James", "Jack", "John", "Steve", "Ben")
    for(name:String in arrayNames) {
        println(name)
    }

    println("цикл по индексам коллекции")
    for(i in arrayNames.indices) { // проходим по индексам
        println(" $i = ${arrayNames[i]}") // получаем обьект по индексу
    }

    println("цикл по индексам и значения коллекции")
    for((index, value) in arrayNames.withIndex()) {
        println("$index, $value")
    }

    println("цикл с прерыванием")
    for((index, value) in arrayNames.withIndex()) {
        println("$index = $value")
        if(index == 1) {
            break
        }
    }

    println("цикл только по нечетным индексам с помощью continue")
    for((index, value) in arrayNames.withIndex()) {
        if(index % 2 == 0) {
            continue
        }
        println("$index = $value")
    }


}