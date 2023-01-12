package theory.array

fun main() {
    // Если данные динамические (размер изменяется) – используйте вместо массива одну из коллекций (List, Set, Map)
    //https://kotlinlang.org/docs/reference/collections-overview.html
    //
    //Если размер фиксированный – используйте массив.
    //
    //Индексация массива – с нуля (как и в Java-подобных языках)

    var arrayDigits:Array<Int> = arrayOf(1,2,3,4,5,1,3)
    arrayDigits += 15 // добавили новый элемент массиву, но в этом случае создается новый массив на основе старого

    arrayDigits[1] = 120 // заменил второй элемент

    for((index, value ) in arrayDigits.withIndex()) {
        println("$index = $value")
    }

    for(i in arrayDigits) {
        println(i)
    }

}
