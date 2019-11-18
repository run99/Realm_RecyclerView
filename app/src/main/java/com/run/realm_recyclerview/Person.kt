package com.run.realm_recyclerview

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Person : RealmObject() {
    @PrimaryKey
    var id: Int? = null
    var name: String? = null
    var age: Int? = null
    var gender: String? = null
}
