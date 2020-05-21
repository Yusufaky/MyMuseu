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
        supportActionBar!!.title =getString(R.string.QRcodeMain)
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
                    Toast.makeText(this, "Erro ao Ler o QRCODE", Toast.LENGTH_LONG).show()
                };if (result.contents == "Quadro" || result.contents == "quadro" || result.contents == "QUADRO") {
                    val intent = Intent(this, QRcode_Quadro::class.java)
                    startActivity(intent)
                };if (result.contents == "Sala" || result.contents == "sala" || result.contents == "SALA") {
                    val intent = Intent(this, QRcode_Sala::class.java)
                    startActivity(intent)
                };if (result.contents != "Sala" && result.contents != "Quadro" && result.contents != "quadro" && result.contents != "sala" && result.contents != "SALA" && result.contents != "QUADRO") {
                    Toast.makeText(this, "Erro ao Ler o QRCODE", Toast.LENGTH_LONG).show()
                } else {
                    super.onActivityResult(requestCode, resultCode, data)
                }
            }
        }
    }
}
