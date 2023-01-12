package theory.variables

var textVar: String = "var value" // явное указание типа и значения
var digitVar = 1 // явное указание значения, (тип автоматически становится Int, Alt + колесико мыши чтобы посмотреть тип)
// var notInitVar: Int // нужно инициализоровать значение обязательно


val textVal: String  = "val value" // это константа
val digitVal: Int = 1

val getValueDuringRuntimeExecution: Int = someFun(10, 5)

fun someFun(a: Int, b: Int) : Int {
    return a + b
}

fun main() {
    println(digitVar + digitVal)
    println(textVar)
    println(textVal)
    textVar = "Alex"
   // textVal = "Damn" // error, it's constant value
    println(textVar)
    println(textVal)

    println(getValueDuringRuntimeExecution)


    println("value = $textVal") // for concatenation
    println("value = ${textVal.length}") // use brackets to call some method or field
    name = "good"
    print(name)

}

/*
var – переменная (mutable)
    – значение можно присваивать любое кол-во раз
    – runtime value – значение можно присваивать во время работы приложения

val – константа (immutable, read only)
    – значение можно присвоить только один раз
    – runtime value – присваивается во время работы приложения (можно присвоить не просто какое-то значение, а результат работы функции и пр.)
    – аналог final из Java

https://kotlinlang.org/docs/basic-syntax.html#variables

Понятия:
– runtime value: значение можно присваивать во время работы приложения
– compile value: значение нужно присвоить сразу до запуска проекта (нельзя присвоить результат функции, другие переменные)

Можно объявлять на уровне класса, метода, файла

В отличие от некоторых других языков – в Kotlin можно объявлять переменные/константы одного имени в классе и в методе одновременно (не будет ошибки компиляции)

***


Обратите внимание, что мы объявляем переменные/константы и функции просто в файле .kt (не внутри какого либо класса как в Java) – это отличается от Java подобных языков, где мы не можем создавать ничего вне класса

В Kotlin различают (при создании функций, переменных, констант и пр.):
– top-level: объявление на уровне файла (вне какого-либо класса) – привязка к файлу
– class-level: объявление внутри класса (подробности – далее в уроках) – привязка к классу


Правила именования (как и в любом другом языке):
– названия переменной должно быть со смыслом, для чего создавали
– название переменной с маленькой буквы, формат CamelCase (каждое новое слово – с большой буквы и без подчеркивания)
– не рекомендуется давать переменным слишком длинные и сложные имена – максимум из 2-3 слов в формате CamelCase
 */


// --------------------------------------------------


lateinit var name: String // если позже не задать значение будет ошибка UninitializedPropertyAccessException
//lateinit var name2: String = "test" // нельзя писать, бессмысленно так как сразу задаем значение
//const var dig = 1 // not allowed

const val constDigit1 = 5; // const добавляется тогда, когда константа имеет фиксированное значение и не
// зависит от других переменных
const val constDigit2 = constDigit1
val digit = 4
// const val constDigit3 = digit // error



/*
lateinit var
    – инициализацию можно отложить до первого использования
    – lateinit val нельзя писать (константа должна получить значение в том же месте, где объявлена)

val – константа (immutable, read only) – значение можно присвоить только один раз
    – runtime value – присваивается во время работы приложения
    – можно присвоить результат работы функции и пр.

сonst val
    – compile value – значение присваивается до начала работы приложения
    – значение фиксированное и НЕ зависит от других переменных
    – НЕЛЬЗЯ присвоить результат работы функции и пр.
    – аналог static final из Java
    – const var нельзя писать
 */