class Student {
    companion object {
        private var lastId: Int = 0
    }

    var id: Int = 0
        private set

    var surname: String = ""
        set(value) {
            field = value
        }
        get() {
            return field
        }

    var name: String = ""
        set(value) {
            field = value
        }
        get() {
            return field
        }

    var patronymic: String = ""
        set(value) {
            field = value
        }
        get() {
            return field
        }

    var phone: String? = null
        set(value) {
            field = value
        }
        get() {
            return field
        }

    var mail: String? = null
        set(value) {
            field = value
        }
        get() {
            return field
        }

    var git: String? = null
        set(value) {
            field = value
        }
        get() {
            return field
        }

    constructor(_surname: String, _name: String, _patronymic: String) {
        surname = _surname
        name = _name
        patronymic = _patronymic
        lastId++
        id = lastId
    }

    fun write() {
        var out = "ID: $id, Фамилия: $surname, Имя: $name, Отчество: $patronymic"

        if (phone != null) out += ", Телефон: $phone"
        if (mail != null) out += ", Почта: $mail"
        if (git != null) out += ", Гит: $git"

        println(out)
    }
}