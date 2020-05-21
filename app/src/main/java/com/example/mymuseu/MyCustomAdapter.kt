package com.example.mymuseu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MyCustomAdapter(context: Context) : BaseAdapter() {

    val mContext: Context
    val nomes = arrayListOf<String>(
        "Marcos Costa",  "António Saleiro", "Daniela Freitas"
    )

    val comentarios = arrayListOf<String>(
       "Gostei bastante", "Uma visita boa pois estava com uma boa organização e a aplicação estava muito bem feita", "Boa Aplicação"
    )
    val classificacao = arrayListOf<Float>(


       5.0F, 5.0F, 3.0F
    )

    fun update(nome: String, comentario: String, n_classificacao: Float) {
        this.nomes.add(nome)
        this.comentarios.add(comentario)
        this.classificacao.add(n_classificacao)
        //Toast.makeText(this.mContext, this.nomes.get(5), Toast.LENGTH_LONG).show()

        // adicionou

    }

    /*  override fun notifyDataSetChanged() {
          super.notifyDataSetChanged()
      }*/



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

      val classificacaoTextView = rowMain.findViewById< RatingBar>(R.id.ratingBar)
        classificacaoTextView.rating = classificacao.get(position)




        return rowMain
//            val textView = TextView(mContext)
//            textView.text = "HERE is my ROW for my LISTVIEW"
//            return textView
    }

}