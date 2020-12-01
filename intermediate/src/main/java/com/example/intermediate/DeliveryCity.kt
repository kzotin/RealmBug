package com.example.intermediate

import com.example.base.Location
import io.realm.RealmList
import io.realm.RealmModel
import io.realm.annotations.RealmClass


@RealmClass
open class DeliveryCity : RealmModel {

   var centerPoint: RealmList<Location>? = null

}
