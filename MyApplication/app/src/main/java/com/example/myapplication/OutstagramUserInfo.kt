package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_outstagram_post_list.*

import kotlinx.android.synthetic.main.activity_outstagram_user_info.*
import kotlinx.android.synthetic.main.activity_outstagram_post_list.user_info as user_info1
import kotlinx.android.synthetic.main.activity_outstagram_user_info.all_list as all_list1
import kotlinx.android.synthetic.main.activity_outstagram_user_info.my_list as my_list1
import kotlinx.android.synthetic.main.activity_outstagram_user_info.upload as upload1

class OutstagramUserInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outstagram_user_info)

        all_list.setOnClickListener {
            startActivity(Intent(this, OutstagramPostListActivity::class.java))
        }

        my_list.setOnClickListener {
            startActivity(Intent(this, OutstagramMyPostListActivity::class.java))
        }

        upload.setOnClickListener {
            startActivity(Intent(this, OutstagramUploadActivity::class.java))
        }

        logout.setOnClickListener {
            val sp = getSharedPreferences("login_sp", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("login_sp", "null")
            editor.commit()
            (application as MasterApplication).createRetrofit()
            finish()
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}