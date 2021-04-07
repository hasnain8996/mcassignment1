package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var alpha = Array<String> (size:26) {""}
        var j=65
        for(i:int in 0..25) {
            alpha[i] = Character.toString(j.tochar())
            j++
        }
        var adapter = ArrayAdapter<String> (applicationContext, android.R.layout.simple_dropdown_item_1line,alpha)
                gridview.adapter=adapter
                gridview.setOnItemClickListener { adapterView, view, i, l->
            var intent = Intent(applicationContext, AlphabetActivity::class.java)
            intent.putExtra( "name", alpha[i])
            startActivity (intent)
        }

    }
}