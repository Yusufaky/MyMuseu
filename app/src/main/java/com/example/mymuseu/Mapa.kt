package com.example.mymuseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Mapa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa)
        supportActionBar!!.title= "Mapa"//getString(R.string.contactos)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
