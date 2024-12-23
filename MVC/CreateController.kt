package MVC
import Student
import StudentLists.StudentList

class CreateController(var view:View,source:StudentList) {

    private val pg=source

    public fun addStudent(surName:String,name:String,patroNymic:String,phone:String,telegram:String,mail:String,git:String)
    {
        pg.addStudent(Student(_surname = surName,name,patroNymic,phone,telegram,mail,git))
    }

}