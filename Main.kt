import Student
class Main {
    fun main()
    {
        val sasha = Student("Zayc","Sanina","Govninovna", _phone = "8900s9v0n2+")
        val ravil = Student("Mango","Zed","Dinovich",_phone = "+7900000000")
        println(sasha.toString())
        println(ravil.toString())
    }
}
fun main() = Main().main()
