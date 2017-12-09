package com.example.kotlindiceout

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

abstract class MainActivity : AppCompatActivity() {
    abstract var rollResult: TextView?

    abstract var die1: Int
    abstract var die2: Int
    abstract var die3: Int

    abstract var dice: ArrayList<Int>
    abstract var diceImageViews: ArrayList<ImageView>

    abstract var score: Int
    abstract var scoreText: TextView?

    abstract var rand: Random


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view -> rollDice(view)
        }

        score = 0

        scoreText = findViewById(R.id.scoreText)

        rollResult = findViewById(R.id.rollResult)

        rand = Random()

        dice = arrayListOf()

        val dice1Image: ImageView = findViewById(R.id.die1Image)
        val dice2Image: ImageView = findViewById(R.id.die2Image)
        val dice3Image: ImageView = findViewById(R.id.die3Image)

        diceImageViews = arrayListOf()

        diceImageViews.add(dice1Image)
        diceImageViews.add(dice2Image)
        diceImageViews.add(dice3Image)

    }
    fun goHome(v: View){
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }

    fun rollDice(v: View){

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
