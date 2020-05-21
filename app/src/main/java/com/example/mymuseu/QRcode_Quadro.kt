package com.example.mymuseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QRcode_Quadro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q_rcode__quadro)
        supportActionBar!!.title= getString(R.string.QRCODEQUADRO)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
