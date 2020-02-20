package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intPlatillo = this.intent
        var opc = intPlatillo.getStringExtra("PLATILLO")

        rcvListado.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val platillos = ArrayList<Platillo>()

        platillos.add(Platillo("Ensalada Verde",R.string.strDetEnsVerde,70F,R.drawable.ensalada_verde,"2"))
        platillos.add(Platillo("Ensalada Cesar",R.string.strDetEnsCesar,70F,R.drawable.ensalada_cesar,"2"))
        platillos.add(Platillo("Ensalada de Uva",R.string.strDetEnsUva,70F,R.drawable.ensalada_uva,"2"))
        platillos.add(Platillo("Chiles en Nogada",R.string.strDetChiles,50F,R.drawable.chile_enhogada,"1"))
        platillos.add(Platillo("Pavo",R.string.strDetPavo,50F,R.drawable.pavo,"1"))
        platillos.add(Platillo("Pozole",R.string.strDetPozole,50F,R.drawable.pozole,"1"))
        platillos.add(Platillo("Taco",R.string.strDetTaco,50F,R.drawable.taco,"1"))
        platillos.add(Platillo("Agua Fresca",R.string.strDetAguaFresca,50F,R.drawable.agua_fresca,"3"))
        platillos.add(Platillo("Cerveza",R.string.strDetCerveza,50F,R.drawable.cerveza,"3"))
        platillos.add(Platillo("Refresco",R.string.strDetRefresco,50F,R.drawable.refresco,"3"))
        platillos.add(Platillo("Vino",R.string.strDetVino,50F,R.drawable.vinos_uva,"3"))

        var subPlatillos = platillos.filter { it.tipo  == opc } as ArrayList<Platillo>

        val adaptador = AdapterPlatillo(subPlatillos)
        rcvListado.adapter = adaptador
    }
}
