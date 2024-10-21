import Student
class Main {
    fun main()
    {
        val sasha = Student("Zayc","Sanina","Govninovna", "8900s9v0n2+","username","mailexample.com","https://github.com")
        val ravil = Student("Mango","Zed","Dinovich", "+7900000000","@username","mailexample@gmail.com","https://github.com/Rukmenga")
        println(sasha.toString())
        println(ravil.toString())
        println(ravil.validate())
        ravil.setContacts("89999999999","wrongtelegram","mail@yandex.ru")
        println(ravil.toString())
         var ivanInp= hashMapOf<String,Any?>(
            "lastname" to "Ivanko",
            "name" to "Ivan",
            "fathername" to "Ivanevich"
        )
        var ivan=Student(ivanInp)
        println(ivan.toString())
        var jenek=Student("Evgeniy Prokopenko Evgenievich")
        println(jenek.toString())
        println(ravil.getInfo())
        var rav=StudentShort(ravil)
        println(rav.toString())
        var studList= Student.readFromTxt("input.txt")
        for (stud in studList)
        {
            println(stud)
        }
    }
}
fun main() = Main().main()
