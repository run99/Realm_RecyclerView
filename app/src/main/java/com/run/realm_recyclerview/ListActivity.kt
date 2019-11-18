package com.run.realm_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
    }

    overrid fun onStart(){
        super.onStart()
        val realmResults = mRealm.where
    }

}
