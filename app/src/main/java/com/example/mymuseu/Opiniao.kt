package com.example.mymuseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Opiniao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opiniao)
        supportActionBar!!.title= "Opiniao"//getString(R.string.contactos)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
