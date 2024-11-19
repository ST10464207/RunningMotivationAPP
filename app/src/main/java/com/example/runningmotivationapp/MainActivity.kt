package com.example.runningmotivationapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.runningmotivationapp.ui.theme.RunningMotivationAPPTheme

class MainActivity : ComponentActivity() {

    companion object {
        val dayList = mutableListOf<Runners>()




    }

    //VARIABLES
    lateinit var buttonnext: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_data)
        setContentView(R.layout.splashscreen)

        val day=findViewById<EditText>(R.id.eday)
        val morning=findViewById<EditText>(R.id.emorning)
        val afternoon=findViewById<EditText>(R.id.eafternoon)

        val nxtbtn=findViewById<Button>(R.id.button)
        val btnsave=findViewById<Button>(R.id.submitbtn)
        val  btnclear=findViewById<Button>(R.id.clearbtn)
        val btnshow=findViewById<Button>(R.id.submitbtn)

        btnsave.setOnClickListener {

            val day=day.text.toString()
            val morning=morning.text.toString()
            val afternoon=afternoon.text.toString()

            if(day.isNotBlank() && morning.isNotBlank() && afternoon.isNotBlank())
                dayList.add(Runners(day,morning,afternoon))

        }
        btnshow.setOnClickListener {


        }

    }}




