package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListner {

    override fun onDataPass(data: String?) {
        Log.d("pass", "" + data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentOne : FragmentOne = FragmentOne()

        // fragment에 data를 넣어주는 방법
        val bundle: Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle

        button.setOnClickListener{
            // fragment를 동적으로 작동하는 방법
            // 붙이는 방법 : replace/add
            val fragmentManager : FragmentManager = supportFragmentManager

            // transaction
            // 작업단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()
            // commit   -> 시간 될 때
            // commitnow -> 지금 당장해
        }

        button2.setOnClickListener{
            // fragment를 동적으로 작동하는 방법
            // val fragmentOne : FragmentOne = FragmentOne()
            // 없애는 방법 remove/detach
            val fragmentManager : FragmentManager = supportFragmentManager

            // transaction
            // 작업단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
        }

    }

    override fun onStart() {
        Log.d("life_cycle", "onStart")
        super.onStart()

    }

    override fun onResume() {
        Log.d("life_cycle", "onResume")
        super.onResume()

    }

    override fun onPause() {
        Log.d("life_cycle", "onPause")
        super.onPause()

    }

    override fun onStop() {
        Log.d("life_cycle", "onStop")
        super.onStop()

    }

    override fun onDestroy() {
        Log.d("life_cycle", "onDestroy")
        super.onDestroy()

    }
}