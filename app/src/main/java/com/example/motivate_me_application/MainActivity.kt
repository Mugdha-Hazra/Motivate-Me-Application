package com.example.motivate_me_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
  //  val name: EditText = findViewById(R.id.activity_main_et_name)
  //  val message = findViewById<TextView>(R.id.main_activity_tv_message)

    private lateinit var name:EditText
    private lateinit var message:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val updateButton: Button = findViewById(R.id.activity_main_bt_update)
        updateButton.setOnClickListener { updateMessage() }
         name = findViewById(R.id.activity_main_et_name)
        message = findViewById(R.id.main_activity_tv_message)
    }
    private fun updateMessage()
    {   val username = name.text
        val motivationalMessages = listOf("Don’t let what you can’t do stop you from doing what you can do.",
            "We all can dance when we find music we love!.","The more you give away the happier you become.",
            "I think I can. I know I can.","Never give up!!","Keep your head up","is a good girl","The harder you work the better you get!")
        val index = (0..7).random()
        val currentMessage = motivationalMessages[index]

        if (username.toString()=="") {
            message.text = "Heyy make sure you enter your name!"
        }else{
            message.text="Hello $username! $currentMessage"
        }

        name.setText("")


    }
}