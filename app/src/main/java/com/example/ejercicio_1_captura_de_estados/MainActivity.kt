package com.example.ejercicio_1_captura_de_estados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onStop = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate ${onCreate+1}")
    }

    override fun onStart() {
        super.onStart()

        println("onStart ${onStart+1}")
    }
    override fun onResume(){
        super.onResume()

        println("onResume ${onResume+1}")
    }
    override fun onPause(){
        super.onPause()

        println("onPause ${onPause+1}")
    }
    override fun onStop(){
        super.onStop()

        println("onStop ${onStop+1}")
    }
}