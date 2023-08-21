package objects.theory.inheritance

/*
При наследовании – Kotlin (как и Java) обязывает связать дочерний и родительский класс (или цепочку классов) через какие-либо конструкторы.

Варианты (дочерний -> родительский):
– ПК -> ПК (дочерний ПК должен вызывать родительский ПК, если они присутствуют в обоих классах)
– ПК -> ВК (дочерний ПК может вызвать родительский ВК, если у родителя отсутствует ПК)
– ВК -> ВК (дочерний ВК вызывает родительский ВК, если в дочернем и родит. классах нет ПК)
– ВК -> ПК (дочерний класс содержит только ВК, а в родительском присутствует ПК)

Приоритет всегда отдается связи через ПК (т.к. в нем обычно перечислены критичные свойства объекта, обязательные к заполнению)


Конструкторы НЕ наследуются (как и в Java)
Все нужные конструкторы создаете в каждом классе

Нужно быть внимательным где указывать var, а где нет
 */

fun main() {
    var house = House("name", 100, "address");
    house.print()
}

// есть ПК
open class Building(var name: String, var height: Int) {

}

// ПК -> ПК
open class House(name: String,  height: Int, var address: String) : Building(name, height) {
// var перед name и height не нужно так как они обьявлены в родители, а address нужен var так как это свойство чисто его, его нету в род классе
    fun print() {
        println("${super.name} $name  ${super.height} $height")
    }
}


open class Animal {

    private var name: String
    private var weight: Int

    constructor(name: String, weight: Int) {
        this.name = name
        this.weight = weight
    }
}
//ПК -> ВК
open class Cat (name: String, weight: Int) : Animal(name, weight) {

}
// ВК -> ПК
open class ChildCat : Cat {
    var age: Int = 0

    constructor(name: String, weight: Int, age: Int) : super(name, weight) {
        this.age = age
    }
}

//ВК -> ВК
open class Horse : Animal {
    var age: Int = 0

    constructor(name: String, weight: Int, age: Int) : super(name, weight) {
        this.age = age
    }
}