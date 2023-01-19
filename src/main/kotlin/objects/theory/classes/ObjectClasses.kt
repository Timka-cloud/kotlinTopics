package objects.theory.classes

/*
В отличие от Java-подобных языков – в Kotlin разрешатся иметь в одном файле несколько внешних классов
(в этом случае название файла должно отражать смысл общего функционала)

Но желательно создавать одном файле только один класс, чтобы не было путаницы (тогда файл следует называть именем класса)

Либо, если в файле будут неск. классов, то они должны быть связаны по смыслу.

Кстати, если в файле будет только один класс с тем же названием, что и файл – то расширение .kt исчезнет
и появится иконка C (“class”). Это похоже на Java классы, где в одном файле только один public class

В Kotlin различают (при создании функций, переменных, констант и пр.):
– top-level: объявление на уровне файла (вне какого-либо класса)
– class-level: объявление внутри класса (подробности – далее в уроках)


Класс – слепок (образец), с помощью которого можно создавать любое кол-во объектов
 */


fun main() {
    // слово new не нужно писать как в java
    var user = User() //вызывается конструктор без параметров, которые создаются автоматически, т.к. никакие другие конструкторы не были созданы

    var customer = Customer()

    println(user)
    println(customer)
}

class User // пустой класс - можно без фигурных скобок

class Customer


