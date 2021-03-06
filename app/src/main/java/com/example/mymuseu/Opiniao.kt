package com.example.mymuseu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Opiniao : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opiniao)
        supportActionBar!!.title =getString(R.string.OpiniaoMain)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val adapter = MyCustomAdapter(this)

        val extras = getIntent().getExtras()

        if (null != extras) {
            val nome = extras?.getString("nome")
            val comentario = extras?.getString("comentario")
            val classificacao = extras?.getFloat("classificacao")
            adapter.update(nome.toString(), comentario.toString(), classificacao)

        }

        val button_addOpiniao = findViewById<Button>(R.id.button_add_opiniao)
        button_addOpiniao.setOnClickListener {


            val intent = Intent(this, Novaopiniao::class.java)

            startActivity(intent)
        }

        var mListView = findViewById<ListView>(R.id.list_view)

        mListView.adapter = adapter

    }


}

