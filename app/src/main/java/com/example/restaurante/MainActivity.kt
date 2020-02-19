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

        platillos.add(Platillo("Ensalada","descripcion",70F,R.drawable.ensaladas,"2"))
        platillos.add(Platillo("Ensalada Cesar","descripcion",70F,R.drawable.ensalada_cesar,"2"))
        platillos.add(Platillo("Ensalada de Uva","descripcion",70F,R.drawable.ensalada_uva,"2"))
        platillos.add(Platillo("Chiles Enhogada","",50F,R.drawable.chile_enhogada,"1"))
        platillos.add(Platillo("Pavo","",50F,R.drawable.pavo,"1"))
        platillos.add(Platillo("Pozole","",50F,R.drawable.pozole,"1"))
        platillos.add(Platillo("Taco","",50F,R.drawable.taco,"1"))
        platillos.add(Platillo("Agua Fresca","",50F,R.drawable.agua_fresca,"3"))
        platillos.add(Platillo("Cerveza","",50F,R.drawable.cerveza,"3"))
        platillos.add(Platillo("Refresco","",50F,R.drawable.refresco,"3"))
        platillos.add(Platillo("Vino","",50F,R.drawable.vinos_uva,"3"))

        var subPlatillos = platillos.filter { it.tipo  == opc } as ArrayList<Platillo>

        val adaptador = AdapterPlatillo(subPlatillos)
        rcvListado.adapter = adaptador
    }
}
