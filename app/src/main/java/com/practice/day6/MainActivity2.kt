package com.practice.day6

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    var tvname: TextView?= null
    var name = ""
    var back: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        tvname= findViewById(R.id.name)
        tvname?.setText(name)
        back= findViewById(R.id.back)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        back?.setOnClickListener {
            this.finish()
        }}
      override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "activity destroy", Toast.LENGTH_SHORT).show()
    }
    }

