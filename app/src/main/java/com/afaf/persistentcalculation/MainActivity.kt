package com.afaf.persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstNumber = findViewById<EditText>(R.id.etFirstNumber)
        val secondNumber = findViewById<EditText>(R.id.etSecondNumber)
        val btn = findViewById<Button>(R.id.btCalculate)
        val res = findViewById<TextView>(R.id.result)

        btn.setOnClickListener {
            val n1 = firstNumber.text.toString()
            val n2 = secondNumber.text.toString()
            if(n1.isNotEmpty() && n2.isNotEmpty()){
                try {
                    res.text = (n1.toFloat() * n2.toFloat()).toString()
                }catch (e: Exception){
                    Toast.makeText(this, "Please enter only numbers", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}