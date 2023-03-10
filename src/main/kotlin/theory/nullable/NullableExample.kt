package theory.nullable

/*
В Kotlin и других современных языках – более строгий подход к работе с null.

Nullable типы – это те типы (переменных, функций и пр.), которые могут принимать null в качестве значения

Для того, чтобы переменная могла принимать значение null – в Kotlin нужно в конце типа указать знак “?” (можно применять не только для переменных, но и везде где указывается тип)

Самая частая ошибка в любом Java приложении: NullPointerException – означает, что пытаемся обратиться по ссылке, где нет объекта (пытаемся работать с несуществующим объектом)

Kotlin (и многие современные языки) обязывает явно указывать при объявлении переменной – может ли она быть null с помощью знака “?”.

В зависимости от этого компилятор будет вести себя по разному:
– либо не допускать присвоения null в переменную
– либо (если переменная допускает null) каждый раз при использовании – заставляет проверять на null

Тем самым компилятор заставляет аккуратно работать со всеми переменными и исключает ошибку NullPointerException

https://kotlinlang.org/docs/reference/null-safety.html

Главная цель
– не исключить присвоения null, а не допускать ошибки NullPointerException
– проверять null на этапе компиляции, а не уже во время работы приложения (иначе возникнет NullPointerException)

Nullable типы часто называют wrapper’ом – т.е. оберткой (контейнером) для обычного типа (которая может принимать как значение, так и null) – аналог Optional в Java

Примечание: создавайте nullable типы ТОЛЬКО тогда, когда по смыслу и по задаче выражение (переменная, функция) может иметь значение null
 */

fun main(args: Array<String>) {
    var name:String? // ? означает, что переменная nullable (может иметь null) - теперь в коде компилятор всегда будет делать проверку при использованье
    name = "a"
    name = null
    // ? означает "if (name != null) "
    println(name?.length) // если name == null, то length не будет вызываться(таким образом не будет ошибки NPE)

    // можно также вручную проверять на null, аналог выше
    if(name != null) {
        println(name.length) // здесь уже не нужно добавлять ?, т.к компилятор видит, что мы сначала выполнили проверку на null
    }

   // printText(name) ошибка компилятора, String и String? - это разные типы

    // это elvis operator
    var len = name?.length ?: 0 // если name != null то в переменную len присвоится name.length, иначе присвоится 0

}

fun printText(text: String) {
    println(text)
}