package theory.types


fun main() {
    // В отличии от Java (где есть примитивные тип и ссылочные) – в Kotlin нет примитивных типов данных, все типы – объектные (ссылочные).
    //
    //Поэтому вместо int или Integer (Java) используется единый тип Int (Kotlin), который сразу является объектом.
    //
    //Самые базовые типы:
    //
    //String – текст
    //Long/Int/Short/Byte – целое число
    //Double/Float – нецелое число
    //Char – 1 символ
    //Boolean – true/false

    var digit1 = 10
    var text1 = digit1.toString() // преобразовал Int to String

    var unsigned1 = 10u // u означает (unsigned) беззнаковый - может хранить только положительные числа
    // unsigned1 = -10 error
    var unsigned2:UInt = 10u // аналогичная запись

    var result1 = 10 / 6
    var result2 = 10 / 6.toDouble()
    println(result1)
    println(result2)

    println(10/6.toDouble())





}