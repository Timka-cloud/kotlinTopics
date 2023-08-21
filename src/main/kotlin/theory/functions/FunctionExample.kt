package theory.functions

/*
Функция (метод в Java) – выполняет любой функционал.

Как и в других языках:
– имеет название
– возвращаемый тип (или ничего не возвращает)
– параметры (или без параметров)
– реализуют какую-то логику из бизнес-процесса

В Kotlin функции могут находиться как внутри класса, так и просто внутри файла kt (в отличие от Java, где функция может быть описана только внутри класса)


Примечания:
– название функции – с маленькой буквы, CamelCase
– не следует создавать слишком большие функции (много строк кода), лучше разбить на несколько (каждая со своей небольшой задачей)
– желательно группировать (располагать) функции рядом друг с другом по смыслу (можно упорядочить по алфавиту во вкладке Structure) – для лучшего чтения кода


При вызове функции – можно нажать Ctrl + P внутри скобок, чтобы увидеть все доступны параметры


В Kotlin для того, чтобы функция ничего не возвращала, используется тип Unit (его не обязательно указывать – еще сокращаем код) – это аналог void из Java (void в Java обязательно указывать)
 */

fun main() {
    printText(text = "sample")

    var length = calcTextLength(text = "test")
    println("length: $length")

    var finalText: String = concatText(text1 = "hi", text2 = "hello")
    println(finalText)

    println(multiply(a = 10, b = 30))

    println(funWithDefaultParameters("a", "b")) // заменяет defaul value
    println(funWithDefaultParameters("a"))

}

// не возвращает никакой тип (просто выполняет какой-то функционал внутри себя) - по умолчанию там ставиться
// тип Unit (аналог void в Java) его можно ставить и можно не ставить
fun printText(text: String): Unit{
    println("text = $text")
}

fun calcTextLength(text: String): Int{
    return text.length
}

fun concatText(text1: String, text2: String): String{
    return "$text1 $text2"
}

// короткая запись, если логика умещается в одну строку
fun multiply(a: Int, b: Int): Int = a * b

/*Ключевое слово return
возвращает значение (если указан тип)
или просто выходит из метода (если тип Unit)
В функции может быть несколько return, который вызываются в зависимости от условий

Если тип функции указан, то обязательно должен быть return*/

fun manyReturns(a: Int, b: Int): String {
    if(a < b) {
        return "a < b"
    }
    return "a > b or a == b"
}

fun unitReturn(a: Int, b: Int): Unit {
    if(a < b) {
        return
    }
    println("end of the function")
}

/*
Дефолтные значения параметров
Параметры функции могут иметь значения по-умолчанию.

Если при вызове функции этот параметр не будет передан – будет использоваться значение по-умолчанию, если передан – будет использоваться переданное значение

 */

fun funWithDefaultParameters(text1: String, text2: String = "default text"): String {
    return "$text1 - $text2"
}