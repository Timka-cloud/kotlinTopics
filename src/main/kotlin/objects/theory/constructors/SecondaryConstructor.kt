package objects.theory.constructors

fun main() {
    var anna = Anna("Anna")
    println("${anna.name}  ${anna.age}")

    var anna2 = Anna(15, "Anna")
    println("${anna2.name} ${anna2.age}")

    var james = James(10)

    var goodWin = GoodWin(10,  "goodWin")

}

class Anna(var name: String) {
   // var age: Int // когда создается обьект может вызваться как PC или SC поэтому поле age может остаться незаполненным если мы
    // при создание обьекта воспользуемся только PC, поэтому можем дать дефолтное значение, а если будут использовать
    // SC то поле age просто перезапишется
    var age: Int = 10
    constructor(age: Int, name: String) : this(name){ // явно вызываем primary constructor
        this.age = age
    }
}

class James { // автоматически НЕ создается PC без параметров т.к. добавлен SC
    var age: Int // компилиятор не ругается, так как поле age будет полюбому проинициализированна так как единственный способ создать обьект это вызвать SC

    var address: String = "104 address"

    constructor(age: Int) { // явно не вызываем PC
        this.age = age
    }
}


class Mike() { // если указали пустые скобки то обязательно надо явно вызывать PC из SC

    constructor(age: Int) : this() {

    }
}


class GoodWin(var name: String) {
    // блоки init вызываются после PC (SC отработает после всех блоков init)
    // блоков init может быть любое количество (не рекомендуется больше 1 - 3) - вызываются в порядке следования в коде (сверху вниз)
    // нежелательно нагружать лишней логикой или большим кодом - добавляйте только то, что связанно с инициализацей обьекта
    var age: Int = 100
    init {
        println("init 1")
        this.name = this.name + " test"
        printText(this.name)
    }

    init {
        println("init 2")
    }

    constructor(age: Int, name: String) : this(name) {
        this.age = age;
        println("secondary constructor")
    }



    fun printText(str: String) {
        println("str = $str")
    }
}