package com.example.mymuseu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_novaopiniao.*
import kotlinx.android.synthetic.main.activity_opiniao.*


class Novaopiniao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novaopiniao)
        supportActionBar!!.title = "Deixe a Opinião"//getString(R.string.contactos)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val button_opiniao = findViewById<Button>(R.id.button_opiniao)
        button_opiniao.setOnClickListener {

            val nome = Opiniao_nome.text.toString()
            val email = Opiniao_email.text.toString()
            val comentarios = Opiniao_comentario.text.toString()

            val intent = Intent(this, Opiniao::class.java)

            intent.putExtra("nome", nome)
            intent.putExtra("email", email)
            intent.putExtra("comentario", comentarios)
            startActivity(intent)


        }
    }
}
