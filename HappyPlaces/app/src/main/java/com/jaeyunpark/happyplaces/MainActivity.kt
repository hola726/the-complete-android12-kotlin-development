package com.jaeyunpark.happyplaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        fabAddHappyPlace.setOnclickListener{

            val intent = Intent(this,AddHappyPlaceActivity::class.java)
            startActivity(intent)


        }
    }
}