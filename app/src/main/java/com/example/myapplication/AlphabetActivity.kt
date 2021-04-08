package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class AlphabetActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)
        var name :String = intent.getStringExtra("name")?.toLowerCase() ?:
        Toast.makeText(applicationContext,name, Toast.LENGTH_LONG).show()
        var id:int = resources.getIdentifier(name, "drawable", packageName)
        imageview.setImageResource(id)
        var mid:Int = resources.getIdentifier(name, "raw", packageName)
        var mp: MediaPlayer = MediaPlayer.create(applicationContext, mid)
        mp.start()
    }
}