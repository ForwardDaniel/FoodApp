package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ch1=findViewById<View>(R.id.checkbox) as CheckBox
        var ch2=findViewById<View>(R.id.checkbox2) as CheckBox
        var rate1=findViewById<View>(R.id.rate1) as TextView
        var rate2=findViewById<View>(R.id.rate2) as TextView
        var quantity1=findViewById<View>(R.id.q1) as EditText
        var quantity2=findViewById<View>(R.id.q2) as EditText
        var bill=findViewById<View>(R.id.bill) as TextView
        var makebill=findViewById<View>(R.id.button) as Button
        var pay_option =findViewById<View>(R.id.payOption) as Button
        var hotels3 =findViewById<View>(R.id.buttonAnotherCafe) as Button
        makebill.setOnClickListener(View.OnClickListener {
            var total=0
            bill.text="YOUR BILL\nMenu\t\t\tAmount\n"
            if (ch1.isChecked) {
                total = total+rate1.text.toString().toInt()*quantity1.text.toString().toInt()
                bill.text=bill.text.toString()+ch1.text.toString()+"\t\t\t"+(rate1.text.toString().toInt()*quantity1.text.toString().toInt()).toString()+"\n"
            }
            if (ch2.isChecked) {
                total = total+rate2.text.toString().toInt()*quantity2.text.toString().toInt()
                bill.text=bill.text.toString()+ch2.text.toString()+"\t\t\t"+(rate2.text.toString().toInt()*quantity2.text.toString().toInt()).toString()+"\n"
            }
            bill.text=bill.text.toString()+ "Total Bill=\t\t\t"+total.toString()

            payOption.setOnClickListener {
                val intent = Intent(this, PayOption::class.java)
                startActivity(intent);
            }
        })

        hotels3.setOnClickListener {
            val intent = Intent(this, Hotels::class.java)
            startActivity(intent);
        }

    }
}