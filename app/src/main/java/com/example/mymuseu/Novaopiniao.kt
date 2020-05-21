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
        supportActionBar!!.title = getString(R.string.novaOpiniao)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val button_opiniao = findViewById<Button>(R.id.button_opiniao)
        button_opiniao.setOnClickListener {

            val nome = Opiniao_nome.text.toString()
            val email = Opiniao_email.text.toString()
            val comentarios = Opiniao_comentario.text.toString()
            val classificacao = ratingBar.rating
            var validacao = 0

                if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

                }else{
                     validacao = 1
                    //Toast.makeText(this, "emailerrado",Toast.LENGTH_LONG).show()
                }




          if(nome.isEmpty()||comentarios.isEmpty() || email.isEmpty()|| validacao ==1){
                if(validacao ==0) {
                    Toast.makeText(this, "Algum dos campos não se encontram ainda preenchidos ou o email inserido não é válido",Toast.LENGTH_LONG).show()

                }else{
                    Toast.makeText(this, " O email inserido não é válido",Toast.LENGTH_LONG).show()
                }



          }else{
              val intent = Intent(this, Opiniao::class.java)
              intent.putExtra("nome", nome)
              intent.putExtra("classificacao", classificacao)
              intent.putExtra("comentario", comentarios)
              startActivity(intent)
          }


        }
    }
}
