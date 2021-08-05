package com.example.callcount

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    val receiver = MyCallListener()
    val TAG = "MainActivity"

    val list= listOf<Int>(
        R.drawable.eight,
        R.drawable.seven,
        R.drawable.six,
        R.drawable.five,
        R.drawable.four,
        R.drawable.three,
        R.drawable.two,
        R.drawable.one
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        IntentFilter(Intent.ACTION_DIAL).also {
//            registerReceiver(receiver,it)
//        }
        val adapter=ViewPagerAdapter(list)
        val viewPager=findViewById<ViewPager>(R.id.vpMain)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
        Log.d(TAG,"I feel so down bana")
    }
}