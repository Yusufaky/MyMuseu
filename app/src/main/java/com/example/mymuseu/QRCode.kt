package com.example.mymuseu

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_q_r_code.*

class QRCode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q_r_code)
        supportActionBar!!.title= "QRCODE"//getString(R.string.contactos)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        btn_scan.setOnClickListener {
            val scanner = IntentIntegrator(this)
            scanner.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
            scanner.setBeepEnabled(false)
            scanner.initiateScan()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
            if (result != null) {
                if (result.contents == null) {
                    Toast.makeText(this, "Erro ao fazer scan", Toast.LENGTH_LONG).show()
                } else {
                    val intent = Intent(this, QRcode_Quadro::class.java)
                    startActivity(intent)
                }
            } else {
                super.onActivityResult(requestCode, resultCode, data)
            }
        }
    }
}
