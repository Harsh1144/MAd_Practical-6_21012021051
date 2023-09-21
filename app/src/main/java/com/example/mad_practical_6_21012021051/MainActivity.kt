package com.example.mad_practical_6_21012021051

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : FloatingActionButton = findViewById(R.id.button2)
        var button1:FloatingActionButton = findViewById(R.id.button3)
        button.setOnClickListener {
            playpause()
        }

        button1.setOnClickListener {
            stop()
        }
    }


    fun playpause(){

        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PlayerVALUE).apply { startService(this) }
    }
    fun  stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PlayerVALUE).apply { stopService(this) }
    }
}
