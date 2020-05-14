package com.example.mymuseu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_q_r_code.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_qrcode = findViewById<Button>(R.id.btn_qrcode)
        button_qrcode.setOnClickListener{
            val intent = Intent(this, QRCode::class.java)
            startActivity(intent)
        }
        val button_opiniao = findViewById<Button>(R.id.btn_opiniao)
        button_opiniao.setOnClickListener{
            val intent = Intent(this, Opiniao::class.java)
            startActivity(intent)
        }
        val button_mapa = findViewById<Button>(R.id.btn_mapa)
        button_mapa.setOnClickListener{
            val intent = Intent(this, Mapa::class.java)
            startActivity(intent)
        }
    }
}
