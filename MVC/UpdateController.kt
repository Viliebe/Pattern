package MVC
import Student
import StudentLists.StudentList

class UpdateController(var view:View,source:StudentList) {

    private val pg=source

    public fun updateStudent(id:Int,lastName:String,name:String,fatherName:String,phone:String,telegram:String,mail:String,git:String)
    {
        pg.replaceStudent(id,Student(_surname = lastName,name,fatherName,phone,telegram,mail,git))
    }

    public fun getStudent(id:Int): List<String?>
    {
        val stud = pg.getById(id)
        return listOf(stud?.surname?:"",stud?.name?:"",stud?.patronymic?:"",stud?.phone?:"",stud?.telegram?:"",stud?.mail?:"",stud?.git?:"")
    }

}