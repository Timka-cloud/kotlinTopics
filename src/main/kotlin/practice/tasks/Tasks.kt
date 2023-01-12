package practice.tasks

fun main() {
    task1("Hi")
}

fun task1(text: String): Unit {
    for(i in 1..4) {
        println("$text $i")
    }
}