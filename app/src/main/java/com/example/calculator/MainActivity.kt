package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

 class MainActivity : AppCompatActivity() {
     var etNumber: EditText? = null
     var etNumbertwo: EditText? = null
     var btnadd: Button? = null
     var btnsubs: Button? = null
     var btnmultiply: Button? = null
     var btndivide: Button? = null
     var num1: Double? = null
     var num2: Double? = null
     var tvresult: TextView? = null
     @SuppressLint("MissingInflatedId")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
         etNumber = findViewById(R.id.etNumber)
         etNumbertwo= findViewById(R.id.etNumbertwo)
         btnadd = findViewById(R.id.btnadd)
         btndivide = findViewById(R.id.btndivide)
         btnmultiply = findViewById(R.id.btnmultiply)
         btnsubs = findViewById(R.id.btnsubs)
         tvresult = findViewById(R.id.tvresult)
         Clicklistener()
     }

     fun Clicklistener() {
         btnadd!!.setOnClickListener {
             num1 = etNumber!!.text.toString().toDouble()
             num2 = etNumbertwo!!.text.toString().toDouble()
             val result = num1!! + num2!!
             tvresult!!.text = result.toString()
         }
         btnsubs!!
             .setOnClickListener {
                 num1 = etNumber!!.text.toString().toDouble()
                 num2 = etNumbertwo!!.text.toString().toDouble()
                 val result = num1!! - num2!!
                 tvresult!!.text = result.toString()
             }
         btnmultiply!!.setOnClickListener {
             num1 = etNumber!!.text.toString().toDouble()
             num2 = etNumbertwo!!.text.toString().toDouble()
             val result = num1!! * num2!!
             tvresult!!.text = result.toString()
         }
         btndivide!!.setOnClickListener {
             num1 = etNumber!!.text.toString().toDouble()
             num2 = etNumbertwo!!.text.toString().toDouble()
             val result = num1!! / num2!!
             tvresult!!.text = result.toString()
         }
     }
 }

