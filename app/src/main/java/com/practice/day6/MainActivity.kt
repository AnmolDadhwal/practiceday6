package com.practice.day6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var name: EditText?=null
    var pass: EditText?=null
    var check: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name=findViewById(R.id.name)
        pass=findViewById(R.id.pass)
        check=findViewById(R.id.check)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        check?.setOnClickListener {
            if(name?.text?.trim().isNullOrEmpty()){
                name?.error="Enter The Name"
        }else if((pass?.text?.trim()?.length?:0) <4){
                pass?.error = "Number should be valid"
            }
           else{
               var intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                this.finish()
           }
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "activity start", Toast.LENGTH_SHORT).show()

    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "activity Resume", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "activity stop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "activity restart", Toast.LENGTH_SHORT).show()
    }
    //override fun onDestroy() {
      //  super.onDestroy()
     //   Toast.makeText(this, "activity destroy", Toast.LENGTH_SHORT).show()
//}
}
