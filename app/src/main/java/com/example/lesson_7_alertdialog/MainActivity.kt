package com.example.lesson_7_alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createSimpleDialog()
    }
    private fun createSimpleDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert Dialog")
        builder.setMessage("This is my first AlertDialog")
        builder.setNeutralButton("Info") { dialogInterface, i ->

        }
        builder.setPositiveButton("Yes"){dialog, i ->

        }
        builder.setNegativeButton("NO") {dialog, i ->

        }
        builder.show()
    }
}