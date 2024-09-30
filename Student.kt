class Student {
    var id: Int =-1
        set(value)
        {
            if(value>0)
                field=value
        }
        get()
        {
            return field
        }
    var surname: String =""
        set(value)
        {
            field=value
        }
        get()
        {
            return field
        }
    var name: String =""
        set(value)
        {
            field=value
        }
        get()
        {
            return field
        }
    var patronymic: String =""
        set(value)
        {
            field=value
        }
        get()
        {
            return field
        }
    var phone: String? =null
        set(value)
        {
            field=value
        }
        get()
        {
            return field
        }
    var mail: String? =null
        set(value)
        {
            field=value
        }
        get()
        {
            return field
        }
    var git: String? =null
        set(value)
        {
            field=value
        }
        get()
        {
            return field
        }
    constructor(_surname:String,_name:String,_patronymic:String)
    {
        surname=_surname
        name=_name
        patronymic=_patronymic
    }
}