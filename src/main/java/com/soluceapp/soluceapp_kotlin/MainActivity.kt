package com.soluceapp.soluceapp_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.soluceapp.soluceapp_kotlin.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   /* val faccess = findViewById<Button>(R.id.Btn_acceder)
    faccess.setOnClickListener {
        val Intent = Intent(this, LoginActivity::class.java)
        startActivity(Intent) }*/
    }
}
