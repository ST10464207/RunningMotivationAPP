package com.example.runningmotivationapp

import android.os.Bundle
import android.widget.Button
import android.window.SplashScreen
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

            //variable
            lateinit var buttonsnext: Button
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.splashscreen)


                buttonnxt=findViewById(R.id.button)
//onclick button
                buttonnext.setOnClickListener {

                    val intent1= Intent(this, SplashScreen::class.java)
                    startActivity(intent1)
                }}}