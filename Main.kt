import Student
class Main {
    fun main()
    {
        val sasha = Student("Zayc","Sanina","Govninovna", "8900s9v0n2+","username","mailexample.com","https://github.com")
        val ravil = Student("Mango","Zed","Dinovich", "+7900000000","@username","mailexample@gmail.com","https://github.com/Rukmenga")
        println(sasha.toString())
        println(ravil.toString())
        println(ravil.validate())
        ravil.setContacts("89005553535","zxccursed","lombard@yandex.ru")
        println(ravil.toString())
    }
}
fun main() = Main().main()
