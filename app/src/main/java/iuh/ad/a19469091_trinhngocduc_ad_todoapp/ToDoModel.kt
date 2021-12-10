package iuh.ad.a19469091_trinhngocduc_ad_todoapp

class ToDoModel {

    companion object Factory {
        fun createList(): ToDoModel = ToDoModel()
    }

    var UID: String? =null
    var itemDataText: String? =null
    var done: Boolean? = false
}