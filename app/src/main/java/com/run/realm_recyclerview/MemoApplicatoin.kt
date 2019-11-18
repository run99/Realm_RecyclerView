package com.run.realm_recyclerview

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class MemoApplicatoin : Application() {

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val realmConfiguration = RealmConfiguration.Builder().build()

        //この一行でデータを全て削除してしまう　// Delete Realm between app restarts.
        //Realm.deleteRealm(realmConfiguration)
        Realm.setDefaultConfiguration(realmConfiguration)
    }
}
