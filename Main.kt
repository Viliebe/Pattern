import Student

class Main {
    fun main()
    {
//        val sasha = Student("Zayc","Sanina","Govninovna", "8900s9v0n2+","username","mailexample.com","https://github.com")
//        val ravil = Student("Mango","Zed","Dinovich", "+7900000000","@username","mailexample@gmail.com","https://github.com/Rukmenga")
//        println(sasha.toString())
//        println(ravil.toString())
//        println(ravil.validate())
//        ravil.setContacts("89999999999","wrongtelegram","mail@yandex.ru")
//        println(ravil.toString())
//        var ivanInp= hashMapOf<String,Any?>(
//            "surname" to "Ivanov",
//            "name" to "Ivan",
//            "patronymic" to "Ivanovich"
//        )
//        var ivan=Student(ivanInp)
//        println(ivan.toString())
//        var danila=Student("Daniil Danilanin Danilavich")
//        println(danila.toString())
//        var studList= Student.readFromTxt("input.txt")
//        for (stud in studList)
//        {
//            println(stud)
//        }
//        Student.writeToTxt("output.txt",studList)
//
//        var dtt=DataTable(mutableListOf(mutableListOf(1,2,3), mutableListOf(4,5,6), mutableListOf("a","b",3)))
//        println(dtt.getElement(2,2))
//        println(dtt.getRows())
//        println(dtt.getColumns())
//        var dlss=DataListStudentShort(mutableListOf(
//            StudentShort(sasha),
//            StudentShort(ravil),
//            StudentShort(ivan),
//            StudentShort(danila)
//        ))
//        dlss.select(1)
//        dlss.select(2)
//        var dtss=dlss.getTable()
//        for (i in 0..dtss.getRows()-1)
//        {
//            for(j in 0..dtss.getColumns()-1)
//            {
//                print(dtss.getElement(i,j))
//                print(" ")
//            }
//            println()
//        }
        var manager = StudentManager(StudentListTxt())
        manager.readFromFile("input.txt")
        println(manager.data)
        manager.writeToFile("output.txt")
        manager.setStrategy(StudentListJson())
        manager.readFromFile("input.json")
        println(manager.getById(1))
        manager.writeToFile("output.json")
        manager.setStrategy(StudentListYaml())
        manager.readFromFile("input.yaml")
        println(manager.getById(1))
        manager.writeToFile("output.yaml")
    }
}
fun main() = Main().main()
