package com.jaeyunpark.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaeyunpark.a7minutesworkout.databinding.ActivityBmiBinding
import com.jaeyunpark.a7minutesworkout.databinding.ActivityMainBinding

class BMIActivity : AppCompatActivity() {
    private var binding: ActivityBmiBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.toolbarBmiActivity)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "CALCULATE BMI"
        }

        binding?.toolbarBmiActivity?.setNavigationOnClickListener {

            onBackPressed()
        }
    }
}