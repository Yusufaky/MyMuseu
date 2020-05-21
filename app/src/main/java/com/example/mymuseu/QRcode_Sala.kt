package com.example.mymuseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QRcode_Sala : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q_rcode__sala)
        supportActionBar!!.title= getString(R.string.QRCODESALA)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
