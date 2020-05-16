package com.example.mymuseu

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.list.*

class Opiniao : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opiniao)
        supportActionBar!!.title= "Opiniao"//getString(R.string.contactos)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)




        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.list_view)

        mListView.adapter = MyCustomAdapter(this)
    }
    private class MyCustomAdapter(context: Context): BaseAdapter() {

        private val mContext: Context

        private val nomes = arrayListOf<String>(
            "Donald Trump", "Steve Jobs", "Tim Cook", "Mark Zuckerberg", "Barack Obama"
        )
        private val comentarios= arrayListOf<String>(
            "Muitos Grandes", "Algunns", "Poucos", "Assim assim", "NAda"
        )
        private val classicacao = arrayListOf<String>(
            "5", "5", "4", "4", "2"
        )
        init {
            mContext = context
        }

        // responsible for how many rows in my list
        override fun getCount(): Int {
            return nomes.size
        }

        // you can also ignore this
        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        // you can ignore this for now
        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        // responsible for rendering out each row
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.list, viewGroup, false)

            val nameTextView = rowMain.findViewById<TextView>(R.id.nome)
            nameTextView.text = nomes.get(position)

            val positionTextView = rowMain.findViewById<TextView>(R.id.comentario)
            positionTextView.text = comentarios.get(position)
            val classificacaoTextView = rowMain.findViewById<TextView>(R.id.classificacao)
            classificacaoTextView.text = classicacao.get(position)



            return rowMain
//            val textView = TextView(mContext)
//            textView.text = "HERE is my ROW for my LISTVIEW"
//            return textView
        }

    }
}

