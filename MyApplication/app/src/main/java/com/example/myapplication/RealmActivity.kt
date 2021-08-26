package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_realm.*

class RealmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realm)


        Realm.init(this@RealmActivity)
        val config : RealmConfiguration = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()

        Realm.setDefaultConfiguration(config)
        val realm = Realm.getDefaultInstance()

        button_save.setOnClickListener{
            realm.executeTransaction{
                // A 테이블에서 데이터를 가져온다
                // B 테이블에서 데이터를 가져온다
                // C 테이블에서 데이터를 가져온다
                with(it.createObject(School::class.java)){
                    this.name = "어떤 대학교"
                    this.location = "서울"
                }
            }
        }
        button_load.setOnClickListener{
            realm.executeTransaction{
                val data = it.where(School::class.java).findFirst()
            }
        }
        button_delete.setOnClickListener{
            realm.executeTransaction{
                it.where(School::class.java).findAll().deleteAllFromRealm()
            }
        }

    }
}