package com.example.mymuseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QRcode_Quadro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q_rcode__quadro)
        supportActionBar!!.title= "Quadro"//getString(R.string.contactos)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
