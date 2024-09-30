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
            if(validateNames(value))
            {
                field=value
            }
            else
            {
                field=""
            }
        }
        get()
        {
            return field
        }
    var name: String =""
        set(value)
        {
            if(validateNames(value))
            {
                field=value
            }
            else
            {
                field=""
            }
        }
        get()
        {
            return field
        }
    var patronymic: String =""
        set(value)
        {
            if(validateNames(value))
            {
                field=value
            }
            else
            {
                field=""
            }
        }
        get()
        {
            return field
        }
    var phone: String? =null
        set(value)
        {
            if(validatePhone(value)) {
                field = value
            }
        }
        get()
        {
            return field
        }

    var telegram: String? =null
        set(value)
        {
            if(validateTelegram(value))
            {
                field=value
            }
        }
        get()
        {
            return field
        }

    var mail: String? =null
        set(value)
        {
            if(validateMail(value))
            {
                field=value
            }
        }
        get()
        {
            return field
        }

    var git: String? =null
        set(value)
        {
            if(validateGit(value))
            {
                field=value
            }
        }
        get()
        {
            return field
        }

    companion object
    {
        var ids=0

        private fun validatePhone(value:String?): Boolean
        {
            return value?.matches(Regex("""\+?\d{11}""")) ?: true
        }

        private fun validateNames(value:String): Boolean
        {
            return value.matches(Regex("""[A-Я]{1}[a-я]*"""))
        }

        private fun validateTelegram(value:String?): Boolean
        {
            return value?.matches(Regex("""\@{1}.*""")) ?: true
        }
        private fun validateMail(value:String?): Boolean
        {
            return value?.matches(Regex("""\w*\@\w*\.\w*""")) ?: true
        }
        fun validateGit(value:String?): Boolean
        {
            return value?.matches(Regex("""https://github.com/.*""")) ?: true
        }
    }
    fun validate() : Boolean
    {
        return this.hasGit()&&this.hasContact()
    }
    private fun hasGit() : Boolean
    {
        return this.git!=null
    }
    private fun hasContact() : Boolean
    {
        return this.phone!=null || this.telegram!=null || this.mail!=null
    }

    fun setContacts(_phone: String?=null,_telegram: String?=null,_mail: String?=null)
    {
        if(_phone!=null&&validatePhone(_phone))
        {
            phone = _phone
        }
        if(_telegram!=null&&validateTelegram(_telegram))
        {
            telegram = _telegram
        }
        if(_mail!=null&&validateMail(_mail))
        {
            mail = _mail
        }
    }
    init
    {
        ids++
    }

    constructor(_surname:String,_name:String,_patronymic:String)
    {
        id=ids
        surname=_surname
        name=_name
        patronymic=_patronymic
    }
    constructor(_surname:String,_name:String,_patronymic:String,_phone:String?=null,_telegram:String?=null,_mail:String?=null,_git:String?=null)
    {
        id=ids
        surname=_surname
        name=_name
        patronymic=_patronymic
        phone=_phone
        telegram=_telegram
        mail=_mail
        git=_git
    }

    constructor(hashStud: HashMap<String,Any?>)
    {
        id=ids
        surname=hashStud["surname"].toString()
        name=hashStud["name"].toString()
        patronymic=hashStud["patronymic"].toString()
        phone=hashStud.getOrDefault("phone",null).toString()
        telegram=hashStud.getOrDefault("telegram",null).toString()
        mail=hashStud.getOrDefault("mail",null).toString()
        git=hashStud.getOrDefault("git",null).toString()

    }

    override fun toString() : String
    {
        var out = "ID: $id, Фамиля: $surname, Имя: $name, Отчество: $patronymic"
        if(phone!=null)out+=", Телефон: $phone"
        if(telegram!=null)out+=", Телеграм: $telegram"
        if(mail!=null)out+=", Почта: $mail"
        if(git!=null)out+=", Гит: $git"
        return out
    }
}