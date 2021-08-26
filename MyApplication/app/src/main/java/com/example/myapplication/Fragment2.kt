package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // fragment가 인터페이스를 처음으로 그릴때 호출
        // infalter -> 뷰를 그려주는 역할
        // container -> 부모뷰
        Log.d("life_cycle", "F onCreateView")
        return inflater.inflate(R.layout.fragment_two, container, false)


        // return super.onCreateView(inflater, container, savedInstanceState)
    }
}