package com.gitapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("Error code","login in")
        println("hello android testing")
        println("change from experimental")
        println("this line merged from experimental")
        println("Hello from your friend")
    }
}