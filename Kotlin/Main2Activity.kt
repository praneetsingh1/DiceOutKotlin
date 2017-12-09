package com.example.kotlindiceout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(applicationContext, "Welcome to DiceOut!", Toast.LENGTH_SHORT).show()
    }

    fun startGame(v: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
