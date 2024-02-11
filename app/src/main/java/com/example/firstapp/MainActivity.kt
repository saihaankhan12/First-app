package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.graphics.blue
import androidx.core.graphics.red

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHot = findViewById<Button>(R.id.btnhot)
        val buttonCool = findViewById<Button>(R.id.btncool)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonHot.setOnClickListener {
            //change background to red
            linearLayout.setBackgroundColor(R.color.black)

        }
        buttonCool.setOnClickListener {
            //change background to blue
            linearLayout.setBackgroundColor(com.google.android.material.R.color.material_blue_grey_800)
        }
    }
}