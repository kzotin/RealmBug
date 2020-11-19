package com.example.base

import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
open class Location : RealmObject() {
    var lat = 0.0
    var lng = 0.0
}