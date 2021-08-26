package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.R.color.textview_color
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)


        val ment = resources.getString(R.string.hello)
        Log.d("mentt", "ment: " + ment)

        val ment2 = getString(R.string.hello)
        Log.d("mentt2", "ment2 : " + ment2)


        val color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            button.setBackgroundColor(getColor(R.color.textview_color))
        }else{
            button.setBackgroundColor(resources.getColor(R.color.textview_color)) // 안돼
        }


    }
}