package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var plus : Button
    lateinit var subbtn : Button
    lateinit var mulbtn : Button
    lateinit var divbtn : Button
    lateinit var val1 : EditText
    lateinit var val2 : EditText
    lateinit var reslt : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plus = findViewById(R.id.plus)
        subbtn = findViewById(R.id.sub)
        mulbtn = findViewById(R.id.mul)
        divbtn = findViewById(R.id.div)
        val1 = findViewById(R.id.num1)
        val2 = findViewById(R.id.num2)
        reslt = findViewById(R.id.result)

        plus.setOnClickListener(this)
        subbtn.setOnClickListener(this)
        mulbtn.setOnClickListener(this)
        divbtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = val1.text.toString().toDouble()
        var b = val2.text.toString().toDouble()
        var res = 0.0

        when(v?.id){
            R.id.plus -> {
                res = a+b
            }
            R.id.sub -> {
                res = a-b
            }
            R.id.mul -> {
                res = a*b
            }
            R.id.div -> {
                res = a/b
            }
        }

    reslt.text="Result : ${res}"
}


}
