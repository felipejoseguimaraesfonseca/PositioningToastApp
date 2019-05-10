package com.felipejose.positioningtoastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kotlin = findViewById<Button>(R.id.kotlin) as Button
        val java = findViewById<Button>(R.id.java) as Button
        val javascript = findViewById<Button>(R.id.javascript) as Button
        val python = findViewById<Button>(R.id.python) as Button
        val c = findViewById<Button>(R.id.c) as Button
        val swift = findViewById<Button>(R.id.swift) as Button

        kotlin.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity,"KOTLIN", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0,0)
            toast.show()
        }

        java.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity, "JAVA", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
        javascript.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity, "JAVASCRIPT", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 0, 0)
            toast.show()
        }
        python.setOnClickListener {
            val toast1 = Toast.makeText(this@MainActivity, "PYTHON", Toast.LENGTH_SHORT)
            toast1.setGravity(Gravity.LEFT, 0, 0)
            toast1.show()
        }
        c.setOnClickListener {
            val toast1 = Toast.makeText(this@MainActivity, "C", Toast.LENGTH_SHORT)
            toast1.setGravity(Gravity.RIGHT, 0, 0)
            toast1.show()
        }
        swift.setOnClickListener {
            val toast1 = Toast.makeText(this@MainActivity, "SWIFT", Toast.LENGTH_SHORT)
            toast1.setGravity(Gravity.TOP or Gravity.LEFT, 0,0)
            toast1.show()
        }
    }
}
