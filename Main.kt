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
//                var ivanInp= hashMapOf<String,Any?>(
//            "surname" to "Ivanov
//            "name" to "Ivan",
//            "patronymic" to "Ivanovich"
//        )
//        var ivan=Student(ivanInp)
//        println(ivan.toString())
//
//        var danila=Student("Daniil Danilanin Danilavich")
//        println(danila.toString())
//        println(ravil.getInfo())
//        var vik=StudentShort(ravil)
//        println(rav.toString())
//        var studList= Student.readFromTxt("input.txt")
//        for (stud in studList)
//        {
//            println(stud)
//        }
//        Student.writeToTxt("output.txt",studList)
        var dtt=DataTable(arrayOf(arrayOf(1,2,3), arrayOf(4,5,6),arrayOf("a","b",3)))
        println(dtt.getElement(2,2))
        println(dtt.getRows())
        println(dtt.getColumns())
    }
}
fun main() = Main().main()
