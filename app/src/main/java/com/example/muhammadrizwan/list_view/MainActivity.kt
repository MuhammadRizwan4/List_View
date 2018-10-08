package com.example.muhammadrizwan.list_view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var LV : ListView
    var array = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LV = findViewById(R.id.LV)
        LV.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,array)


    }
}
