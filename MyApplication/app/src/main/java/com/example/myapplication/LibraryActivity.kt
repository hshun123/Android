package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_library.*

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)


        Glide.with(this@LibraryActivity)
            .load("https://www.howtogeek.com/wp-content/uploads/2018/06/shutterstock_1006988770.png?width=1198&trim=1,1&bg-color=000&pad=1,1")
            .centerCrop()
            .into(glide)
    }
}